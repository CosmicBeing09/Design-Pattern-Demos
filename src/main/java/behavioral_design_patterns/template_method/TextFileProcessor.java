package behavioral_design_patterns.template_method;

public class TextFileProcessor extends FileProcessor{
    @Override
    void extractContent() {
        System.out.println("Extracting content from text file");
    }

    @Override
    void parseContent() {
        System.out.println("Parsing content of text file");
    }
}
