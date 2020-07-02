package pattern;

public class Client {
    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();

        control.pressButton();

        light.printState();
    }

}
