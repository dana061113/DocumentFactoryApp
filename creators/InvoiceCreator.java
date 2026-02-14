package creators;

import documents.Document;
import documents.Invoice;

public class InvoiceCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new Invoice();
    }
}
