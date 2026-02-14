package documents;

public class Resume implements Document {

    @Override
    public void open() {
        System.out.println("Резюме ашылды.");
    }
}
