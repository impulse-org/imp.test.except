package org.eclipse.imp.test.except.parser;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.parser.ISourcePositionLocator;

public class ExceptASTNodeLocator implements ISourcePositionLocator {
    public ExceptASTNodeLocator() {
    }

    public Object findNode(Object ast, int offset) {
        return null;
    }

    public Object findNode(Object ast, int startOffset, int endOffset) {
        return null;
    }

    public int getStartOffset(Object entity) {
        return -1;
    }

    public int getEndOffset(Object entity) {
        return -1;
    }

    public int getLength(Object entity) {
        return -1;
    }

    public IPath getPath(Object node) {
        return null;
    }
}
