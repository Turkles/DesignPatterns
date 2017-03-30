class FanDriver { // wzorzec fasady

    private OilPumpDriver oilDriver;
    private BrakeDriver brakeDriver;
    private ElectricityMainDriver mainSwitchDriver;
    private SwitchDriver swDriver;

    public FanDriver() {
        oilDriver = new OilPumpDriver();
        brakeDriver = new BrakeDriver();
        swDriver = new SwitchDriver();
        mainSwitchDriver = new ElectricityMainDriver();
    }

    public void turnON(){
        oilDriver.turnOn();
        brakeDriver.turnOff();
        mainSwitchDriver.turnOn();
        swDriver.turnOn();

        System.out.println("WAIT!");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        swDriver.turnOff();

        System.out.println("FAN IS TURN ON");
    }

    public void turnOFF(){

        mainSwitchDriver.turnOff();
        swDriver.turnOff();
        brakeDriver.turnOn();

        System.out.println("Wait a second, brakes are working");
        try {
            Thread.sleep(1500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        oilDriver.turnOff();

        System.out.println("Fan is turn off :(");
    }
}

class OilPumpDriver {

    public void turnOn(){
        System.out.println("We are turning on oil pump driver");
    }

    public void turnOff(){
        System.out.println("We are turning off oil pump driver");
    }
}

class BrakeDriver {

    public void turnOn(){
        System.out.println("Brakes are turning on! ");
    }

    public void turnOff(){
        System.out.println("I released brakes.");
    }
}

class SwitchDriver {

    public void turnOn(){
        System.out.println("I turning on Swith drivers. It works!");
    }

    public void turnOff(){
        System.out.println("I turning of switch driver");
    }
}

class ElectricityMainDriver {

    public void turnOn(){
        System.out.println("I turning on main electricity driver");
    }

    public void turnOff(){
        System.out.println("I turning off main electricity driver");
    }
}

