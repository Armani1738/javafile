package ChibuzorAssignment;

public class AirConditioner {
    private boolean acSwitch;
    private int temperature = 16;

    public void turnOn() {
        this.acSwitch = true;
    }
    public boolean getAcSwitch(){
        return acSwitch;
    }
    public void turnOff() {
        this.acSwitch = false;
    }
    public void toggle() {
        acSwitch = true;
    }
    public void increaseTemperature(){
        if(temperature < 30) {
        this.temperature = temperature + 1;
    }
        if(temperature > 30){
            this.temperature = temperature;
        }
    }
    public void decreaseTemperature(){
        if(temperature > 16) {
            this.temperature = temperature + 1;
        }
        if(temperature < 16){
            this.temperature = temperature;
        }
    }
    public int getTemperature(){
        return temperature;
    }



}

