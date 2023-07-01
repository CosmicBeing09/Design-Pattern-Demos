package behavioral_design_patterns.template_method;

public class DOCFileProcessor extends FileProcessor{
    @Override
    void extractContent() {
        System.out.println("Extracting content from DOC file");
    }

    @Override
    void parseContent() {
        System.out.println("Parsing content of DOC file");
    }
}
