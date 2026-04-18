package l10.homework.task6;

public class CsvExporter extends BaseExporter implements ReportExporter{

    public CsvExporter(String formatName) {
        super(formatName);
    }

    @Override
    public void export(String data) {
        System.out.println("export"+data+" csv format");
    }
}
