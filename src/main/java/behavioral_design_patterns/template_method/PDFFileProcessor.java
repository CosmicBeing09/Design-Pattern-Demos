package behavioral_design_patterns.template_method;

public class PDFFileProcessor extends FileProcessor{
    @Override
    void extractContent() {
        System.out.println("Extracting content from PDF file");
    }

    @Override
    void parseContent() {
        System.out.println("Parsing content of PDF file");
    }
}
