public class SpreadsheetDocument implements Document{
    private String spreadSheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadSheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    @Override
    public SpreadsheetDocument clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadSheetName + " (" + rowCount + " rows, " + columnCount + ")");
        System.out.println("Type: " + getType() + ", Name: " + spreadSheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
    
} 