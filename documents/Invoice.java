package documents;

public class Invoice implements Document {

    @Override
    public void open() {
        System.out.println("Счет-фактура ашылды.");
    }
}
