import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Model.Bug;
import Model.BugReporter;
import Model.User;
import Model.computer.Computer;
import Model.computer.Hdd;
import Model.computer.Laptop;
import Model.computer.PC;
import Model.computer.Ram;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

/*        int number = 1000000000;
        double decimalNumber = 10.5;
        String text = "some text";
        char singleChar = 'a';
        boolean bool = true;
        long longNumber = 10000000000L;


        System.out.println(number); // number
        System.out.println(decimalNumber); // decimal number
        System.out.println(text); // string
        System.out.println(singleChar); // single char
        System.out.println(bool); // boolean
        System.out.println(!bool); // boolean*/

        // Math operators

//        double a = 10;
//        double b = 4;
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//
//        System.out.println(10/4); // result 2 - as a number
//        System.out.println(a/b);// result 2.5 - as a decimalNumber
//
////        //compare operators
//        int numOne = 1;
//        int numTwo = 2;
//
//        System.out.println(numOne>numTwo);
//        System.out.println(numOne<numTwo);
//        System.out.println(numOne==numTwo);
//        System.out.println(numOne!=numTwo);
//
//        // logic operators
//        // || OR
//        System.out.println(numOne>numTwo || numOne == 1); //false/true = true
//        System.out.println(numOne>numTwo || numOne != 1); //false/false = false
//        System.out.println(numOne<numTwo || numOne != 1); //true/ = true
//        // AND &&
//        System.out.println(numOne<numTwo && numOne == 1); // true/true = true
//        System.out.println(numOne>numTwo && numOne != 1); // false/false = false
//        System.out.println(numOne>numTwo && numOne != 1); // false/true = false
//        if (numOne < numTwo) {
//            System.out.println("Num one is less than Num two");
//        } else {
//            System.out.println("Num one is greater than Num two");
//        }
//
//        String homePage = "Home";
//        String loginPage = "Login";
//        String contactPage = "Contact";
//
//        String page = "NO";
//
//        switch(page){
//            case "Home":
//                System.out.println("Switch to Home");
//                break;
//                case "Login":
//                    System.out.println("Switch to Login");
//                    break;
//                    case "Contact":
//                        System.out.println("Switch to Contact");
//                        break;
//            default:
//                System.out.println("Unrecognized page");
//        }

        //MODULO

//        System.out.println(10%5); // 0
//        System.out.println(10%3); // 1
//        System.out.println(10%4); // 2
//
//        if (10%2 == 0){
//            System.out.println("10 jest parzyste");
//        } else {
//            System.out.println("10 jest nieparzyste");
//
//    }

        //ZADANIE
//
//        int numOne = 12;
//        int numTwo = 17;
//        int numThree = 9;
//        int numFour = 41;
//
//        int firstSum = numOne + numTwo;
//        int secondSum = numThree + numFour;
//
//        if (firstSum % 2 == 0) {
//            System.out.println("Suma pierwszych par jest parzysta");
//        } else {
//            System.out.println("Suma pierwszych par jest niepatrzysta");
//        }
//            if (secondSum % 2 == 0) {
//                System.out.println("Suma drugich par jest parzysta");
//            } else {
//                System.out.println("Suma drugich par jest niepatrzysta");
//            }
//
//            if (firstSum + secondSum % 2 == 0) {
//                System.out.println("Wszystkie liczby są parzyste");
//            }

        //KLASY
//
//        Model.User RadekYoung = new Model.User("radzio@zxc.com","Radzio","Tescikowy",14);
//
//        Model.User RadekOld = new Model.User("radek@zxc.com","Radek","Testowy2",29);
//        System.out.println("Radek last name is"+" "+RadekOld.lastName);
//        System.out.println(RadekOld.isAdult);
//
//        RadekYoung.getAllInfo();
//        RadekOld.getAllInfo();
//
//        Model.Bug NewBug = new Model.Bug("Some description text...","radek@xyz.com",4,false);
//
//        NewBug.showBugInfo();
//        NewBug.getPriority();

        // STRING DEFINITION WITH CONSTRUCTOR

//        String str1 = new String("Some text...");

        // SHORTCUT
//        String str1 = "Some texxxt...";
//        String str2 = "some text...";
        // STRING METHODS

        // STRICT COMPARISON
//        System.out.println(str1.equals(str2));

        // COMPARISON WITHOUT CASE SENSITIVITY
//        System.out.println(str1.equalsIgnoreCase(str2));

        // UPPER CASE
//        System.out.println(str1.toUpperCase());

       // LOWER CASE
//        System.out.println(str1.toLowerCase());

        // STARTS WITH

//        System.out.println(str1.startsWith("So"));

        // ENDS WITH

//        System.out.println(str1.endsWith("..."));

        // CONTAINS

//        System.out.println(str1.contains("me"));

        // IS BLANK && IS EMPTY

        // IS EMPTY - COUNTS WITH EMPTY SPACES (SPACES)
        // IS BLANK - IGNORES EMPTY SPACES

//        System.out.println("   ".isBlank()); // true
//        System.out.println("   ".isEmpty()); // false

//        // REPLACE
//        String replaceStr1 = str1.replace("me","go");
//        System.out.println(replaceStr1);

        //REPLACE ALL
//
//        String replaceStr2 = str1.replaceAll("x","g");
//        System.out.println(replaceStr2);

//        // SUBSTRING = CUT W JS
//        String substringStr1 = str1.substring(1,3);
//        System.out.println(substringStr1);

        //
//        String textWithWhiteSpaces = "   some text with spaces   ";
//
//        System.out.println(textWithWhiteSpaces.length()); // returns length with empty spaces = 27
//
//       String textWithWhiteSpacesStrip = textWithWhiteSpaces.strip(); // cut all white spaces
//        System.out.println(textWithWhiteSpacesStrip.length()); // 21

        // ACCESS MODIFICATORS

        // ACCESS ONLY IN PACKET SCOPE BY DEFAULT

//        User user = new User("radek@xyz.com", "Radek", "Testowy", 29);
//
////        System.out.println(user.firstName);
////        System.out.println(user.isUserAdult());
//
//        System.out.println(user.getEmail());
//        user.setEmail("radek@zxc.com");
//        System.out.println(user.getEmail());

//        Bug newBug = new Bug("12345678999","radek@xyz.com",5,true);
//
//        System.out.println(newBug.getDescription());
//        System.out.println(newBug.getReporterEmail());
//        System.out.println(newBug.getPriority());
//
//        newBug.setPriority(6);
//        newBug.setDescription("sad");
//        newBug.setReporterEmail("sad.pl");
//        System.out.println(newBug.getDescription());
//        System.out.println(newBug.getReporterEmail());
//        System.out.println(newBug.getPriority());

        // ARRAYS
        // TYPE MUST BE DEFINED
        // SIZE MUST BE DEFINED
// //
//         String[] names = new String[5];

//         System.out.println(names[0]); // null by default

//         names[0] = "Jacek";
//         names[1] = "Monika";
//         names[2] = "Bartek";
//         names[3] = "Sara";
//         names[4] = "Paulina";
////        names[5] = "Adam"; // out of array bounds
//
////        for (int i = 0; i <names.length; i++){
////            System.out.println(names[i]);
////        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }


        //INICJOWANIE ARRAYA
//
//        int[] numbers = new int[5];
////OR
//        int[] newNumbers = {1,2,3,4,5,6};
//
//        System.out.println(numbers.length);
//        System.out.println(newNumbers.length);
//
//         for (String name: names){
//             System.out.println(name.toUpperCase());
//         }
//
//         int number = 10;
//// ++ po zmiennej inkrementuje ją po użyciu
//        System.out.println(number++); // still 10
//        System.out.println(number++); // 11
//
//        //++ przed zmienną inkrementuje ją przed użyciem
//
//        System.out.println(++number);

//        int[] numbers = {1,2,3,4,5};

//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length-1];
//        numbers[numbers.length-1] = first;
//
//        for (int number : numbers){
//            System.out.println(number);



//       int first = numbers[0];
//       int last = numbers[numbers.length-1];
//       numbers[0] = last;
//       numbers[numbers.length-1] = first;
//
//       for (int number : numbers){
//           System.out.println(number);
//       }

    // BEZ ZMIENNYCH

//        numbers[numbers.length-1] = numbers[numbers.length-1] + numbers[0]; // 5+1 = 6
//        numbers[0] = numbers[numbers.length-1] - numbers[0]; // 6-1 = 5
//        numbers[numbers.length-1] = numbers[numbers.length-1] - numbers[0];
//
//        for (int number: numbers){
//            System.out.println(number);
//        }

//        int[] numbers1 = {2,2,3,4,5,7,7,7,8,8,2};
//
//        int odd = 0;
//        int even = 0;
//
//        for (int number : numbers1){
//            if (number % 2 == 0){
//                even +=1;
//            }
//            else {
//                odd +=1;
//            }
//        }
//        System.out.println("Even: " + even);
//        System.out.println("Odd: " + odd);

//    int[] numbers2 = {2,4,1,9,5,2,4,0,5,8};
//    int max;
//
//    for (int i = 0; i<numbers2.length; i++) {
//        max = numbers2[i];
//        for (int j = i+ 1; j<numbers2.length; j++) {
//            if (numbers2[j] > max) {
//                max = numbers2[j];
//                numbers2[j] = numbers2[i];
//                numbers2[i] = max;
//            }
//            }
//        }
//    for (int number: numbers2){
//        System.out.println(number);
//    }

        // DO & DO WHILE LOOP

//        int i = 10;
//
//        // WHILE SPRAWDZA WARUNEK WEJŚCIOWY OD POCZĄTKU
//
//        while(i<20){
//            System.out.println(i);
//            i++;
//        }
//
//        // DO WHILE SPRAWDZA WARUNEK WEJŚCIOWY OD DRUGIEJ ITERACJI
//
//        do {
//            System.out.println("Jestem w do");
//            System.out.println(i);
//            i++;
//        } while(i<20);
//
// User u1 = new User("example.com", "Tomek", "Kowalski", 19);
// // User u2 = new User("example.gr", "Tomek", "Czarnecki", 22);

// DO STATYCZNYCH METOD I PÓL ODWOŁUJEMY SIĘ NAZWĄ KLASY A DO METOD I PÓL OBIEKTU ODWOŁUJEMY SIĘ NAZWĄ OBIEKTU 


// System.out.println(User.getUserCounter());



        // String radekTest = StringUtils.getFormattedText("RadekTestowy");
        // System.out.println(radekTest);

        // System.out.println(WeekUtils.MONDAY);

        // PRZYPADKOWE NADPISANIE WARTOŚCI
        // WeekUtils.Monday = "Sunday";

        // System.out.println(WeekUtils.MONDAY);

// DWA RODZAJE RELACJI MIĘDZY KLASAMI:
// 1. IS A - jest czymś - DZIEDZICZENIE
// 2. HAS A - posiada coś - KOMPOZYCJA

        // POLIMORFIZM - WIELE FORM
        // DO JEDNEGO TYPU REFERENCJI MOŻNA PRZYPISAĆ WIELE FORM
        // ZMIENNA JEST TYPU MATKI A REFERENCJA TYPU DZIECKA

        // Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 16, true);
        // // Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 16, true);
        // // Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 16, true);
        // Computer gamingLaptop = new Laptop("XGames","HP Games",500,128,50);
        // Computer macbook = new Laptop("MacWork","HP Games",500,128,50);

        // Computer[] computers = {officeComputer1,officeComputer2,officeComputer3,gamingLaptop,macbook};

        // for (Computer computer : computers){
        //         computer.switchOff();
        // // PRZY NADPISANYCH METODACH WYWOŁYWANA JEST METODA Z KLASY DZIECKA
        // }

        // JEŚLI METODE POSIADA TYLKO DZIECKO, Z POZIOMU RODZICA NIE MOZNA JEJ WYWOŁAĆ, GDYŻ NIE DZIEDZICZY JEJ W GÓRĘ, NP
        // officeComputer1.showComputerName();
        // ZAMIAST TEGO STOSUJEMY RZUTOWANIE TYPU DZIECKA:

        // ((PC)officeComputer1).showComputerName();

        // ((Laptop)gamingLaptop).setBatteryLevel(50);
        

        // System.out.println(macbook);
        // officeComputer.switchOn();
        // System.out.println(officeComputer.getState());

        // gamingLaptop.switchOn();
        // System.out.println(gamingLaptop.getState());

        // KOMPILATOR W PIERSZEJ KOLEJNOŚCI SPRAWDZA CZY W KLASIE CHILDREN JEST NADPISANA METODA, JEŚLI NIE MA TO WYWOŁA METODE Z PARENTA

        // gamingLaptop.setBatteryLevel(100);

        // officeComputer.switchOn();
        // gamingLaptop.switchOn();

        // System.out.println(gamingLaptop.getState());

        // officeComputer.switchOn(); 

        // officeComputer.setIsPluggedIn(false);

        // officeComputer.switchOn(); 


        //ABSTRAKCJA vs KONKRETNE ROZWIĄZANIA

        // Computer computer = new Computer("AAA", "bbb", 512, 32);

        // officeComputer1.volumeUp();
        // gamingLaptop.volumeUp(50);
        // gamingLaptop.volumeDown(-1);


        // System.out.println(officeComputer1.volumeDown());
        // System.out.println(gamingLaptop.volumeDown(0));
        //     System.out.println(gamingLaptop.volumeDown(-1));

        // INTERFACE

        // Laptop laptop = new Laptop("HP", "HP", 512, 16,60);

        // laptop.playMusic();
        // laptop.stopMusic();
        // laptop.pauseMusic();

        // laptop.sayHello();

        // // JAVA OBSŁUGUJE WIELODZIEDZICZENIE PO INTERFEJSACH

        // laptop.playVideo();
        // laptop.stopVideo();
        // laptop.pauseVideo();

        // TYPY OPAKOWUJĄCE - AUTO- BOXING

        // BOXING SŁUŻY ZMIANIE TYPU PRYMITYWNEGO np. int NA OBIEKR INTEGER, KTÓRY ZAWIERA WSZYSTKIE METODY MOŻLIWE DO WYKONANIA NA OBIEKCIE INTEGER

        // KAŻDA ZMIENNA PRYMITYWNA MA SWÓJ ODPOWIEDNIK OBIEKTOWY/REFERENCYJNY

        // Byte b;
        // Short s;
        // Integer i;
        // Long l;
        // Double d;
        // Character c;
        // Boolean bl;

        // int number = 10;

        // Integer intNumber = 10;
        // System.out.println(intNumber);

        // Double dbl = Double.valueOf(10);

        // // AUTO - UNBOXING

        // int newNumber = intNumber.intValue();

        // List<Integer> numbers = new ArrayList<>();

        // User radek = new User("example@xyz.com", "Radek", "Testowy", 29);
        // User radek2 = new User("example@xyz.com", "Radek", "Testowy", 29);
        // System.out.println(radek);

        // // ODWOŁANIE DO REFERENCJI
        
        // System.out.println(radek.toString());

        // // ODWOŁANIE DO METODY toString(); nadpisanej na klasie User

        // // KAŻDA KLASA DOMYŚLNIE DZIEDZICZY METODY Z OBIEKTU (COŚ JAK PROTOTYPE W JS);

        // // GŁÓWNE 3 METODY DZIEDZICZONE Z KLASY OBJECT TO:
        // // toString();
        // // hashCode();
        // // equals();

        // System.out.println(radek.equals(radek2));

        // // PORÓWNANIE REFERENCJI = FALSE

        // System.out.println(radek.equals(radek2));

        // NADPISANA (WYGENEROWANA) METODA EQUALS Z KLASY USER = TRUE

        // KOMPOZYCJE - NP. SKŁADANIE KOMPUTERA

        // Ram ram = new Ram("Kingston", 16);

        // Computer mac = new Laptop("Mac", "Pro",new Hdd("Toshiba", 512),ram,100);

        // System.out.println(mac.getRam().getSize());

        // BugReporter bugReporter = new BugReporter("Radek", "Testowy","example@xyz.com");


        // Bug bug = new Bug("Something went wrong", 4, true, bugReporter);

        // System.out.println(bug.toString());

        // bug.setOpen(false);

        // System.out.println(bug.toString());

        // KOLEKCJE - ZBIÓR ELEMENTÓW TEGO SAMEGO TYPU


        // ARRAYLIST - W PRZECIWIEŃSTWIE DO ARRAY'A NIE TRZEBA DEFINIOWAĆ ROZMIARU TEJ KOLEKCJI

        // List<String> names = new ArrayList<>();

        // names.add("Radek");
        // names.add("Tomek");
        // names.add("Adam");
        // names.add("Piotr");

        // System.out.println(names);


        //  List<String> names1 = new ArrayList<>();

        //  names1.add("Asia");
        //  names1.add("Bartek");

        // for (String name:names){
        //         System.out.println(name);
        // }

        // names.remove(0); // USUWANIE INDEXEM

        // names.remove("Adam"); // USUWANIE PO KONKRETNYM ELEMENCIE

        // String name = names.get(1); // POBIERANIE Z TABLICY PO INDEXIE

        // int size = names.size(); // ROZMIAR TABLICY

        // boolean isEmpty = names.isEmpty(); // SPRAWDZA CZY LISTA JEST PUSTA

        // boolean isContaining = names.contains("Radek"); // CZY ZAWIERA ZDEFINIOWANY ELEMENT

        // names.addAll(names1); // DODAJE ZAWARTOŚĆ KOLEKCJI B DO KOLEKCJI A

        // // names.removeAll(names1); // ODEJMUJE ZAWARTOŚĆ KOLEKCJI B OD KOLEKCJI A

        // Collections.sort(names); // SORTOWANIE OD A DO Z
        // Collections.reverse(names); // SORTOWANIE OD Z DO A;

        // // KLASA ARRAYLIST DZIEDZICZY PO INTERFEJSIE LIST, DOBRĄ PRAKTYKĄ JEST WIĘC ZDEFINIOWANIE REFERENCJI Z NAJWYŻSZEGO DZIEDZICZONEGO TYPU, TJ. LIST

        // System.out.println(names);

        // List<User> users = new ArrayList<>();
        // users.add(new User("xyz@example.com", "Grzegorz", "Brzeczyszczykiewicz", 44));
        // users.add(new User("zxc@example.com", "Mariusz", "Brzeczyszczykiewicz", 23));
        // users.add(new User("zyx@example.com", "Tomasz", "Brzeczyszczykiewicz", 32));
        // users.add(new User("cdj@example.com", "Bartosz", "Brzeczyszczykiewicz", 46));

        // for (User user: users){
        //         System.out.println(user.getFirstName());
        // }

        // W PRZYPADKU SORTOWANIA OBIEKTÓW KOMPILATOR NIE WIE PO KTÓRYM POLU TEGO DOKONAĆ, W ZWIĄZKU Z CZYM JAKO DRUGI ARGUMENT METODY SORT TRZEBA UŻYĆ METODY .COMPARING Z INTERFEJSU COMPARATOR I OKREŚLIĆ KTÓRĄ WARTOŚCIĄ

        // Collections.sort(users, Comparator.comparing(User::getFirstName)); // PO IMIENIU
        // Collections.sort(users, Comparator.comparingInt(User::getAge)); // PO WIEKU ASC
        // Collections.sort(users, Comparator.comparingInt(User::getAge).reversed()); // PO WIEKU DESC


       // ARRAYLIST = [ELEMENT 1, ELEMENT 2, ELEMENT 3]
        //          [index 1,   index 2,    index 3]


        // LINKEDLIST - LISTA W KTÓREJ KAŻDY ELEMENT ZNA TYLKO POPRZEDNI I NASTĘPNY ELEMENT
        // LINKED LIST = [ELEMENT 1 <-> ELEMENT2 <-> ELEMENT 3] - JEST LEPSZYM ROZWIĄZANIEM GDY LISTA MA DUŻO ELEMENTÓW I KONIECZNIE JEST DODANIE CZEGOŚ PO JEJ ŚRODKU. NIE NASTĘPUJE WTEDY PRZESUNIĘCIE INDEXU W KOLEJNYCH ELEMENTACH, TYLKO ZMIENIANA JEST KOLEJNOŚĆ ICH ODCZYTU

        // List<User> linkedUsers = new LinkedList<>();
        // linkedUsers.add(new User("xyz@example.com", "Grzegorz", "Brzeczyszczykiewicz", 44));
        // linkedUsers.add(new User("zxc@example.com", "Mariusz", "Brzeczyszczykiewicz", 23));
        // linkedUsers.add(new User("zyx@example.com", "Tomasz", "Brzeczyszczykiewicz", 32));
        // linkedUsers.add(new User("cdj@example.com", "Bartosz", "Brzeczyszczykiewicz", 46));

        // System.out.println(linkedUsers);
 
        // SET - TAK SAMO JAK W JS, KOLEKCJA UNIKALNYCH WARTOŚCI.

        // HASHSET NIE GWARANTUJE KOLEJNOŚCI!!!

        // Set<String> names = new HashSet<>();

        // names.add("Radek");
        // names.add("Tomek");
        // names.add("Marcin");
        // names.add("Tadek");
        // names.add("Janusz");
        // names.add("Maciek");
        // names.add("Radek");

        // System.out.println(names.size());

        // System.out.println(names);

        // // TREESET - MOŻNA DO NIEGO KLASYCZNIE DODAWAĆ ELEMENTY, LUB WRZUCIĆ W NIEGO HASHSET, KTÓRY ZOSTANIE POSORTOWANY

        // Set<String> sortedNames = new TreeSet<>(names);

        // System.out.println(sortedNames);


        // TWORZĄC KLASĘ DOBRZE JEST ZAWSZE NADPISYWAĆ METODY TOSTRING, EQUALS I HASHCODE, GDYŻ TAK JAK W TYM PRZYPADKU UMOŻLIWIAJĄ PORÓWNYWANIE OBIEKTÓW MIĘDZY SOBĄ W KLASIE

        
        // Set<User> users = new HashSet<>();
        // users.add(new User("xyz@example.com", "Grzegorz", "Brzeczyszczykiewicz", 44));
        // users.add(new User("xyz@example.com", "Barbara", "Brzeczyszczykiewicz", 44));
        // users.add(new User("zxc@example.com", "Anna", "Brzeczyszczykiewicz", 23));
        // users.add(new User("zyx@example.com", "Tomasz", "Brzeczyszczykiewicz", 32));
        // users.add(new User("cdj@example.com", "Dariusz", "Brzeczyszczykiewicz", 46));
        // users.add(new User("cdj@example.com", "Bartosz", "Brzeczyszczykiewicz", 46));

        // for (User user:users){
        //         System.out.println(user.getFirstName()+" " + user.getLastName());
        // }

        // ABY PORÓWNAĆ ZE SOBĄ ELEMENTY SETA, KLASA MATKA MUSI ZAIMPLEMENTOWAĆ WBUDOWANY INTERFEJS COMPARABLE A NASTĘPNIE NALEŻY NADPISAĆ METODĘ COMPARETO, KTÓRA DEFINIUJE ZASADY PORÓWNYWANIA

        // Set<User> sortedUsers = new TreeSet<>(users);

        // for (User user:sortedUsers){
        //         System.out.println(user.getFirstName());
        // }



        // MAPY - ZBIÓR KEY + VALUE
   

    // HASHMAP - NIE GWARANTUJE KOLEJNOŚCI

//     Map<Integer, String> namesMap = new HashMap<>();

//     namesMap.put(1,"Radek1");
//     namesMap.put(8,"Tadek4");
//     namesMap.put(3,"Wladek3");
//     namesMap.put(7,"Marek7");
//     namesMap.put(9,"Slawek9");
//     namesMap.put(20,"Adam20");
//     namesMap.put(17,"Maciej17");

//     // KLUCZ ZAWSZE MUSI BYĆ UNIKALNY, INACZEJ WARTOŚĆ DLA DANEGO KLUCZA ZOSTANIE NADPISANA.
// //     namesMap.put(9,"Slawek8");

//     System.out.println(namesMap);

//     // TREEMAP - SORTUJE ELEMENTY PO KLUCZU

//         Map <Integer, String> sortedNamesMap = new TreeMap<>(namesMap);

//         System.out.println(sortedNamesMap);

        // LINKEDHASHMAP - GWARANTUJE, ŻE ELEMENTY NIE ZMIENIĄ KOLEJNOŚCI

        // Map <Integer,String> sortedNamesLinkedHashMap = new LinkedHashMap<>();
        // sortedNamesLinkedHashMap.put(8,"Radek8");
        // sortedNamesLinkedHashMap.put(15,"Tomek15");
        // sortedNamesLinkedHashMap.put(39,"Adrian39");
        // sortedNamesLinkedHashMap.put(3,"Damian3");
        // // System.out.println(sortedNamesLinkedHashMap);

        // // MAPA POSIADA ENTRY SET. NIE POBIERAMY DANYCH BEZPOŚREDNIO Z KOLEKCJI A Z JEJ ENTRY SETA

        // for (Map.Entry<Integer, String> entry: sortedNamesLinkedHashMap.entrySet()){
        //         System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        
        BugReporter bugReporter = new BugReporter("Tom","Hanks", "example@xyz.com");

        // 1. CREATE LIST
        List<Bug> bugList = new ArrayList<>();

        bugList.add(new Bug("HIJ", 2, false, bugReporter));
        bugList.add(new Bug("ABC", 4, true, bugReporter));
        bugList.add(new Bug("EFG", 1, false, bugReporter));
        bugList.add(new Bug("CDE", 5, true, bugReporter));
        bugList.add(new Bug("KLM", 3, true, bugReporter));
        bugList.add(new Bug("KLM", 3, true, bugReporter));

       for (Bug bug:bugList){
        System.out.println(bug.getDescription());
       }

        //2. GET UNIQUIE VALUES FROM LIST 
        Set<Bug> uniqueBugList = new HashSet<>(bugList);

        System.out.println(uniqueBugList.size());

        //3. SORT BY BUG DESCRIPTION

        Set<Bug> sortedBugList = new TreeSet<>(uniqueBugList);

        for (Bug bug:sortedBugList){
                System.out.println(bug.getDescription());
        }

    }

  






    }


