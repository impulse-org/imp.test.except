package org.eclipse.imp.test.except.parser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.parser.MessageHandlerAdapter;
import org.eclipse.imp.parser.SimpleLPGParseController;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.imp.test.except.Activator;

/**
 * @author rfuhrer@watson.ibm.com
 */
public class ExceptParseController extends SimpleLPGParseController implements IParseController {
    public ExceptParseController() {
        super(Activator.kLanguageID);
    }

    public ISourcePositionLocator getSourcePositionLocator() {
        return new ExceptASTNodeLocator();
    }

    public ILanguageSyntaxProperties getSyntaxProperties() {
        return new ExceptSyntaxProperties();
    }

    /**
    * setFilePath() should be called before calling this method.
    */
    public Object parse(String contents, IProgressMonitor monitor) {
        PMMonitor my_monitor= new PMMonitor(monitor);
        char[] contentsArray= contents.toCharArray();

        if (fLexer == null) {
            fLexer= new ExceptLexer();
        }
        fLexer.reset(contentsArray, fFilePath.toPortableString());

        if (fParser == null) {
            fParser= new ExceptParser(fLexer.getILexStream());
        }
        fParser.reset(fLexer.getILexStream());
        fParser.getIPrsStream().setMessageHandler(new MessageHandlerAdapter(handler));

        fLexer.lexer(my_monitor, fParser.getIPrsStream()); // Lex the stream to
        // produce the token
        // stream
        if (my_monitor.isCancelled())
            return fCurrentAst; // TODO fCurrentAst might (probably will) be
        // inconsistent wrt the lex stream now

        fCurrentAst= fParser.parser(my_monitor, 0);

        cacheKeywordsOnce();

        Object result= fCurrentAst;
        return result;
    }
}
