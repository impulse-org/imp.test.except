package org.eclipse.imp.test.except.occurrenceMarker;

import java.util.List;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IOccurrenceMarker;

public class ExceptOccurrenceMarker implements IOccurrenceMarker {
    public ExceptOccurrenceMarker() {
    }

    public String getKindName() {
        throw new IllegalArgumentException("Gotcha!");
    }

    public List<Object> getOccurrencesOf(IParseController parseController, Object entity) {
        throw new IllegalArgumentException("Gotcha!");
    }
}
