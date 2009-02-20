package org.eclipse.imp.test.except.referenceResolvers;

import org.eclipse.imp.language.ILanguageService;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

public class ExceptReferenceResolver implements IReferenceResolver, ILanguageService {

    public ExceptReferenceResolver() {
    }

    public String getLinkText(Object node) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public Object getLinkTarget(Object node, IParseController controller) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
