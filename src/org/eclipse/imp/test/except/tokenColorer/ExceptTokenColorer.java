package org.eclipse.imp.test.except.tokenColorer;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.ITokenColorer;
import org.eclipse.imp.services.base.TokenColorerBase;
import org.eclipse.imp.test.except.parser.ExceptParsersym;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextAttribute;

public class ExceptTokenColorer extends TokenColorerBase implements ExceptParsersym, ITokenColorer {
    public ExceptTokenColorer() {
        super();
    }

    public TextAttribute getColoring(IParseController controller, Object o) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public IRegion calculateDamageExtent(IRegion seed) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
