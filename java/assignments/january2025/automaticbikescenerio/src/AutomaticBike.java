public class AutomaticBike {
    private boolean isOn;
    private int speed;
    private int gear;

    public AutomaticBike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void accelerate() {
        if (!isOn) throw new IllegalStateException("Automatic Bike cannot accelerate when Off");

        if (gear == 1) {
            speed += 1;
        } else if (gear == 2) {
            speed += 2;
        } else if (gear == 3) {
            speed += 3;
        } else if (gear == 4) {
            speed += 4;
        }
        updateGear();
    }

    private void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 30) {
            gear = 2;
        } else if (speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }

    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void decelerate() {
        if (!isOn) throw new IllegalStateException("Automatic Bike cannot accelerate when Off");

        if (gear == 1) {
            speed -= 1;
        } else if (gear == 2) {
            speed -= 2;
        } else if (gear == 3) {
            speed -= 3;
        } else if (gear == 4) {
            speed -= 4;
        }
        updateGear();
    }

    public void setGear(int i) {
        this.gear = i;
        if (gear == 1) {
            speed = 0;
        }else if (gear == 2) {
            speed = 21;
        }else if (gear == 3) {
            speed = 31;
        }else if (gear == 4) {
            speed = 41;
        }
    }

}
