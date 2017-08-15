
public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        if (formatType == FormatType.CSV)
            formattedOutput = convertObjectToCSV(object);
        else
            formattedOutput = convertObjectToXML(object);

    }

    private String convertObjectToXML(Object object) {
        return "XML: " + object.toString();
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: " + object.toString();
    }

    protected String getFormattedValue() {
        return formattedOutput;
    }

}
