package ChibuzorAssignment;

public class Bike {
    private String bikeName;
    private boolean isOn;

    public Bike(String bikeName) {
        this.bikeName = bikeName;
        this.isOn = isOn;

    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public void setOff(boolean Off) {
        isOn = Off;
    }
    public String setName(String bike){
       if (bikeName == bike);
       return bikeName;
    }

    public boolean isOn() {
        boolean isOntrue;
        return isOn;
    }
    public String getBikename(){
        return bikeName;
    }
}
