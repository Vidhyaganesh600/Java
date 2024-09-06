public class Lamp {
    boolean lampOn=false;
    void toggleLamp(){
        lampOn=!lampOn;
    }
    boolean getState(){
        return lampOn;
    }
    void reportStatus(){
        if(getState()){
            System.out.println("Lamp is On");
        }
        else{
            System.out.println("Lamp is off");
        }
    }
    public static void main(String[] args){
        Lamp l=new Lamp();
        //turn on
        l.toggleLamp();
        l.reportStatus();
        //turn off
        l.toggleLamp();
        l.reportStatus();
    }
}
