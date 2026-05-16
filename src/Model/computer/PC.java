package Model.computer;

public class PC extends Computer {

    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram, boolean isPluggedIn ) {
    
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

    

}
