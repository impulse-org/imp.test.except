package org.eclipse.imp.test.except.treeModelBuilder;

import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class ExceptLabelProvider implements ILabelProvider {
    public Image getImage(Object element) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public String getText(Object element) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public void addListener(ILabelProviderListener listener) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public boolean isLabelProperty(Object element, String property) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public void removeListener(ILabelProviderListener listener) {
        throw new IllegalArgumentException("Gotcha!");
    }

    public void dispose() { }
}
