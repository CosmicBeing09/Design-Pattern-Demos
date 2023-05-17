package behavioral_design_patterns.command;

import behavioral_design_patterns.command.concrete_command.Command;
import behavioral_design_patterns.command.concrete_command.OpenFileCommand;
import behavioral_design_patterns.command.concrete_command.SaveFileCommand;
import behavioral_design_patterns.command.invoker.FileInvoker;
import behavioral_design_patterns.command.receiver.FileManager;

public class Client {
    public static void main(String[] args) {
        FileInvoker fileInvoker = new FileInvoker();
        FileManager fileManager = new FileManager();

        Command openFileCommand = new OpenFileCommand(fileManager);
        Command saveFileCommand = new SaveFileCommand(fileManager);

        fileInvoker.setCommand(openFileCommand);
        fileInvoker.executeCommand();

        fileInvoker.setCommand(saveFileCommand);
        fileInvoker.executeCommand();
    }
}
