package behavioral_design_patterns.template_method;

public class Client {
    public static void main(String[] args) {
        FileProcessor pdfFileProcessor = new PDFFileProcessor();
        pdfFileProcessor.processFile("sample.pdf");
        System.out.println();

        FileProcessor docFileProcessor = new DOCFileProcessor();
        docFileProcessor.processFile("sample.doc");
        System.out.println();

        FileProcessor textFileProcessor = new TextFileProcessor();
        textFileProcessor.processFile("sample.txt");
    }
}
