package creators;

import documents.Document;
import documents.Resume;

public class ResumeCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Resume();
    }
}
