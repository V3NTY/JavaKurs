package Model.computer;

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

    public void setBatteryLevel(int newBatteryLevel){
    batteryLevel = newBatteryLevel;
    }


}
