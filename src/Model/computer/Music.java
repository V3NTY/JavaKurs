package Model.computer;

public interface Music {

// INTERFEJS NIE ZAWIERA ŻANYCH PÓL OBIEKTU
// MOŻE ZAWIERAĆ TYLKO METODY
// MOŻNA TWORZYĆ TYLKO WARTOŚCI STAŁE (STATIC)

// DOMYŚLNIE KAŻDA STAŁA JEST PUBLIC STATIC FINAL

// MOŻE ZAWIERAĆ TYLKO METODY ABSTRAKCYJNE

String NAME = "MUSIC";

// DOMYŚLNIE KAŻDA METODA JEST PUBLIC ABSTRACT

void playMusic();
void pauseMusic();
void stopMusic();

// OD JAVA 8 MOŻNA TWORZYĆ NORMALNE METODY MAJĄCE CIAŁO, ALE MUSI BYĆ DEFAULT

default void sayHelloFromMusic(){
    System.out.println("Hello");
}

static String getName(){
    return NAME;
}

// OD JAVY 9 MOŻNA DODAWAĆ PRYWATNE STATYCZNE METODY

private static void privateMethod(){
    System.out.println("Hello from private method");
}


}
