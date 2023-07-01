package behavioral_design_patterns.template_method;

public abstract class FileProcessor {
    // Template method
    public final void processFile(String filePath) {
        openFile(filePath);
        extractContent();
        parseContent();
        closeFile();
    }

    abstract void extractContent();
    abstract void parseContent();

    void openFile(String filePath) {
        System.out.println("Opening file: " + filePath);
    }

    void closeFile() {
        System.out.println("Closing file");
    }
}
