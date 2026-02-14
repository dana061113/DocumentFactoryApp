package documents;

public class Letter implements Document {

    @Override
    public void open() {
        System.out.println("Письмо ашылды.");
    }
}
