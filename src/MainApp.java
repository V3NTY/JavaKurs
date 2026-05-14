import Model.Bug;
import Model.User;
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

        System.out.println(WeekUtils.MONDAY);

        // PRZYPADKOWE NADPISANIE WARTOŚCI
        // WeekUtils.Monday = "Sunday";

        // System.out.println(WeekUtils.MONDAY);

    }

    }


