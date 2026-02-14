package documents;

public class Report implements Document {

    @Override
    public void open() {
        System.out.println("Отчет ашылды.");
    }
}
