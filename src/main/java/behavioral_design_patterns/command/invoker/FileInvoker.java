package behavioral_design_patterns.command.invoker;

import behavioral_design_patterns.command.concrete_command.Command;

public class FileInvoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
