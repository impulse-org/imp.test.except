package org.eclipse.imp.test.except.documentationProvider;

import org.eclipse.imp.language.ILanguageService;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IDocumentationProvider;
import org.eclipse.imp.test.except.parser.Ast.ASTNode;

public class ExceptDocumentationProvider implements IDocumentationProvider, ILanguageService {
    public String getDocumentation(Object target, IParseController parseController) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public int getTokenKindForNode(ASTNode node) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
