public class ProcessedDocument{
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        System.out.println();

        Document pdf1 = registry.createPDF("annual_report_2024.pdf", 150);
        pdf1.open();

        Document text = registry.createText();
        text.open();

        Document spreadsheet = registry.createSpreadSheet();
        spreadsheet.open();

        Document pdf2 = registry.createPDF("summary_report.pdf", 30);
        pdf2.open();
    }
}