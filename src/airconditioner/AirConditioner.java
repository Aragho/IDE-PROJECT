package airconditioner;

public class AirConditioner {
    private boolean isOn, off;
    private int temperature = 16;


    public AirConditioner() {
        this.isOn = true;
        this.off = false;
    }
    public boolean setOn(){
        return isOn;
    }
    public boolean setOff(){
        return off;
    }
    public int getTemperature(){
        return temperature;

    }
    public void increaseTemperature(int temperature){
        boolean airCondtionerIsturnOn= setOn();
        if(airCondtionerIsturnOn){
            this.temperature += temperature;
            if(this.temperature > 30) this.temperature = 30;

        }

    }
    public void decreaseTemperature(int temperature){
        boolean airCondtionerIsturnOn= setOn();
        if(airCondtionerIsturnOn){
            this.temperature -= temperature;
            if(this.temperature < 16) this.temperature = 16;
        }
    }



}
