package org.eclipse.imp.test.except.contentProposer;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IContentProposer;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class ExceptContentProposer implements IContentProposer {
    public ICompletionProposal[] getContentProposals(IParseController controller, int offset, ITextViewer viewer) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
