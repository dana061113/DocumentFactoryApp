package creators;

import documents.Document;
import documents.Letter;

public class LetterCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Letter();
    }
}
