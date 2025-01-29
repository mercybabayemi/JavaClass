package assignments.airconditioner;

public class AirConditioner {

        public boolean isOn;
        public int temperature ;

        public AirConditioner() {
            this.isOn = false;
            this.temperature = 0;
        }

        public boolean getIsOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            if(on == true) this.isOn = true;
            else this.isOn = false;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int decreaseTemperature(boolean isOn, int input) {
            if(input > 30) input = 30;
            if(isOn == true) {
                for(int temp = 16; temp <= 30; temp++) {
                    if (temp == input) {
                        this.temperature = temp;
                    }
                }
            }
            return this.temperature;
        }

        public int increaseTemperature(boolean isOn, int input) {
            if(input < 16) input = 16;
            if(isOn == true) {
                for(int temp = 30; temp >= 16; temp--) {
                    if (temp == input) {
                        this.temperature = temp;
                    }
                }
            }
            return this.temperature;
        }
}

