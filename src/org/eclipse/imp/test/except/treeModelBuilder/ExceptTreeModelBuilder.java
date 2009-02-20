package org.eclipse.imp.test.except.treeModelBuilder;

import org.eclipse.imp.services.base.TreeModelBuilderBase;

public class ExceptTreeModelBuilder extends TreeModelBuilderBase {
    @Override
    public void visitTree(Object root) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
