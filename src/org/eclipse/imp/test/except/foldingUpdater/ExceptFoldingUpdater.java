package org.eclipse.imp.test.except.foldingUpdater;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.services.base.FolderBase;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

/**
 * @author rfuhrer@watson.ibm.com
 */
public class ExceptFoldingUpdater extends FolderBase {
    public void sendVisitorToAST(HashMap<Annotation,Position> newAnnotations, List<Annotation> annotations, Object ast) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
