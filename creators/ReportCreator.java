package creators;

import documents.Document;
import documents.Report;

public class ReportCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Report();
    }
}
