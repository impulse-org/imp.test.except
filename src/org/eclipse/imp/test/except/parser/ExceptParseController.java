package org.eclipse.imp.test.except.parser;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.parser.SimpleLPGParseController;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.imp.test.except.Activator;

/**
 * @author rfuhrer@watson.ibm.com
 */
public class ExceptParseController extends SimpleLPGParseController implements IParseController {
    public ExceptParseController() {
        super(Activator.kLanguageID);
        fLexer= new ExceptLexer();
        fParser= new ExceptParser();
    }

    public ISourcePositionLocator getSourcePositionLocator() {
        return new ExceptASTNodeLocator();
    }

    public ILanguageSyntaxProperties getSyntaxProperties() {
        return new ExceptSyntaxProperties();
    }
}
