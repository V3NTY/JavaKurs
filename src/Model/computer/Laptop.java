package Model.computer;


// W JAVIE NIE MA WIELODZIEDZICZENIA

// MATKA JEST TYLKO JEDNA

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        
               // WYWOŁANIE KONSTRUKTORA Z KLASY MATKI ABY ZACIĄGNĄĆ POLA
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel; 

    }

    @Override
    public void switchOn(){
        System.out.println("Checking battery level");
        if (batteryLevel >0){
        super.switchOn();
        }
        else {
            System.out.println("Battery level too low");
        }
    }
    public void switchOff(){
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel){
    batteryLevel = newBatteryLevel;
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
