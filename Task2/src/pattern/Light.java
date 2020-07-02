package pattern;

public class Light
{
    private boolean on;

    public Light(){
        on = false;
    }

    public void switchOn(){
        on = true;
    }

    public void switchOff(){
        on = false;
    }

    public void printState(){
        if(on){
            System.out.println("The light is on!");
        }
        else{
            System.out.println("The light is off!");
        }
    }
}
