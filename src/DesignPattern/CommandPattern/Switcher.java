package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

//Invoke
public class Switcher {

    public List<Command> listCommand;

    public Switcher() {
        this.listCommand = new ArrayList();
    }

    public void addCommand(Command command){
        listCommand.add(command);
    }

    public void executeCommand(){
        for (Command command: listCommand) {
            command.execute();
        }
    }
}
