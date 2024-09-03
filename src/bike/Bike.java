package bike;

public class Bike {
    private boolean isOn = false;
    private int gear = 0;
    private double acceleration;
    private double decceleration;

    public boolean turnOn() {
        isOn = true;
        return isOn;

    }

    public boolean turnOff() {
        return isOn;
    }


    public void accelerate(int gear, double speed) {
        isOn = true;
        boolean bikeIsOn = isOn;
        if (bikeIsOn) {
            if (gear == 1 && (speed > 0 && speed <= 20)) {
                acceleration = speed + gear;

            } else if (gear == 2 && (speed > 20 && speed <= 30)) {
                acceleration = speed + gear;
            } else if (gear == 3 && (speed > 30 && speed <= 40)) {
                acceleration = speed + gear;
            } else if (gear == 4 && (speed > 40)) {
                acceleration = speed + gear;
            } else {
                isOn = false;
            }
        }
    }

    public double accelerate() {
        return acceleration;
    }

    public void deccelerate(int gear, double speed) {
        boolean bikeIsOn = isOn;
        if (bikeIsOn) {
            if (gear == 1 && (speed > 0 && speed <= 20)) {
                decceleration = speed - gear;
            } else if (gear == 2 && (speed > 20 && speed <= 30)) {
                decceleration = speed - gear;
            } else if (gear == 3 && (speed > 30 && speed <= 40)) {
                decceleration = speed - gear;
            } else if (gear == 4 && (speed > 40)) {
                decceleration = speed - gear;
            }
        }
    }

    public  double deccelerate() {
        return decceleration;

    }



}








