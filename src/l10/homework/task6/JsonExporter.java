package l10.homework.task6;

public class JsonExporter extends BaseExporter implements ReportExporter  {


    public JsonExporter(String formatName) {
        super(formatName);
    }

    @Override
    public void export(String data) {
        System.out.println("expord "+data+" json format");
    }
}
