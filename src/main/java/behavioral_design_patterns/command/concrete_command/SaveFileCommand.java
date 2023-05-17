package behavioral_design_patterns.command.concrete_command;

import behavioral_design_patterns.command.receiver.FileManager;

public class SaveFileCommand implements Command{

    private FileManager fileManager;

    public SaveFileCommand(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute() {
        fileManager.saveFile();
    }
}
