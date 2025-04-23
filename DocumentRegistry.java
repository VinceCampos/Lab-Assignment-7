public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadSheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        spreadSheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPDF(String fileName, int pageCount) {
        PdfDocument newPDF = pdfPrototype.clone();
        newPDF.setFileName(fileName);
        newPDF.setPageCount(pageCount);
        return newPDF;
    }

    public Document createText() {
        return textPrototype.clone();
    }

    public Document createSpreadSheet() {
        return spreadSheetPrototype.clone();
    }
}