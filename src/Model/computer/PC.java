package Model.computer;

public class PC extends Computer {

    private boolean isPluggedIn;

    public PC(String name, String type, Hdd hdd, Ram ram, boolean isPluggedIn ) {
    
        // WYWOŁANIE KONSTRUKTORA Z KLASY MATKI ABY ZACIĄGNĄĆ POLA
        super(name, type, hdd, ram);
        this.isPluggedIn = isPluggedIn;
        
    }

    public void showComputerName(){
        System.out.println(name);
    }

    public void setIsPluggedIn(boolean newValue){
        isPluggedIn = newValue;
    };
    

    

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");

        if (isPluggedIn){
            System.out.println("Plugged in: Starting...");
        super.switchOn();
        }
        else{
            System.out.println("Computer is not plugged into energy");
        }

           // ODWOŁANIE DO SUPER ODWOŁUJE DO KLASY MATKI
    }
        public void switchOff(){
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    @Override
    public int volumeUp(int newValue){
    if (newValue >= volumeLevel && newValue<=100 && newValue != volumeLevel)
    {
    volumeLevel = newValue;
    System.out.println("Volume up: New volume level is " + volumeLevel);
    return volumeLevel;    
    }
    else{
    System.out.println("Invalid input value");
    return volumeLevel;
    }

}

    @Override
    public int volumeDown(int newValue) {
    if (newValue <= volumeLevel && newValue >=0 && newValue != volumeLevel){
        volumeLevel = newValue;
        System.out.println("Volume down: New volume level is " + volumeLevel);
        return volumeLevel;    
    }
    else{
    System.out.println("Invalid input value");
    return volumeLevel;
    }

    }

}
