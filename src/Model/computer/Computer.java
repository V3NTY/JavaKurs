package Model.computer;

// KLASA MATKA DLA LAPTOP I PC


// KLASA ABSTRACT POZWALA DZIEDZICZYĆ DZIECIOM ALE NIE POZWALA TWORZYĆ INSTANCJI BEZPOŚREDNIO Z NIEJ ALE MOŻNA JEJ UŻYWAĆ JAKO REFERENCJI

// JEŻELI KLASA POSIADA CHOĆ JEDNĄ METODĘ ABSTRAKCYJNĄ, TO SAMA MUSI BYĆ ABSTRAKCYJNA

// WSZYSTKIE DZIEDZICZĄCE KLASY MUSZĄ NADPISAĆ KAŻDĄ METODĘ ABSTRAKCYJNĄ Z KLASY MATKI
abstract public class Computer {

// PROTECTED -> KAŻDY CHILDREN MA DOSTĘP DO TEGO POLA
// PRIVATE -> DOSTĘP JEST TYLKO Z WEWNĄTRZ KLASY

// W KLASIE MATCE DOBRĄ PRAKTYKĄ JEST USTAWIANIE PROTECTED

protected String name;
protected String type;
protected Hdd hdd;
protected Ram ram;
protected boolean state;
protected int volumeLevel;

public Computer(String name, String type, Hdd hdd, Ram ram ){
this.name = name;
this.type = type;
this.hdd = hdd;
this.ram = ram;
this.state = false;
volumeLevel = 0;

}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public Hdd getHdd() {
    return hdd;
}

public void setHdd(Hdd hdd) {
    this.hdd = hdd;
}

public Ram getRam() {
    return ram;
}

public void setRam(Ram ram) {
    this.ram = ram;
}

public void switchOn(){
    System.out.println("Super - ustawiam pole state na true");
    state = true;
}

public void switchOff(){
    System.out.println("Wyłączam komputer: " + name);
    state = false;
}

public boolean getState(){
    return state;
}

// METODA ABSTRAKCYJNA -> WYMUSZA NADPISANIE CIAŁA METODY WE WSZYSTKICH DZIEDZICZĄCYCH CHILDRENACH

public abstract int volumeUp(int newValue);

public abstract int volumeDown(int newValue);

}


