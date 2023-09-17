import static sun.security.ssl.SSLLogger.isOn;

public class Bike {
    private boolean bikeSwitch;
    private int acceleration;

    public Bike(boolean bikeSwitch, int acceleration) {
        this.bikeSwitch = bikeSwitch;
        this.acceleration = acceleration;
    }
    public void setSwitch() {
        bikeSwitch = !bikeSwitch;
    }
    public boolean setBikeSwitch() {
        return bikeSwitch;
    }

    public int setAcceleration() {
        acceleration = acceleration + 1;
        if (acceleration >= 0 && acceleration<= 20) {
            return acceleration + 1;
        }
        if (acceleration >= 40) {
            return acceleration;
        }
            return 40;
    }
    public int getAcceleration() {
        return acceleration;
    }

    public void increaseAcceleration() {
        if (acceleration == 0 || acceleration < 20) {
            this.acceleration = acceleration + 1;
        } else if (acceleration == 21 || acceleration < 30) {
            this.acceleration = acceleration + 2;
        } else if (acceleration == 30 || acceleration <= 41) {
            this.acceleration = acceleration + 3;
        } else if (acceleration >= 41) {
            this.acceleration = acceleration + 4;
        }
    }
    public void decreaseAcceleration() {
        if (acceleration == 0 || acceleration > 20) {
            this.acceleration = acceleration - 1;
        } else if (acceleration == 21 || acceleration > 30) {
            this.acceleration = acceleration - 2;
        } else if (acceleration == 30 || acceleration >= 41) {
            this.acceleration = acceleration - 3;
        } else if (acceleration <= 41) {
            this.acceleration = acceleration - 4;

        }
    }
}