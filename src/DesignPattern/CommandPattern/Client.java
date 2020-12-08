package DesignPattern.CommandPattern;

public class Client {

    public static void main(String[] args){
        Light light = new Light();
        TurnOffLight turnOffLight = new TurnOffLight(light);
        TurnOnLight turnOnLight = new TurnOnLight(light);
        Switcher switcher = new Switcher();

        switcher.addCommand(turnOnLight);
        switcher.addCommand(turnOffLight);

        switcher.executeCommand();
    }
}
