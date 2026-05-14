package Model;

public class User {

// STATYCZNE, PUBLICZNE POLE - DOSTEPNE Z ZEWNĄTRZ KLASY
private static int userCounter = 0;

    // POLA OBIEKTU -> USTAWIAC NA PRYWATNE, DOBRA PRAKTYKA
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    // METODY

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public boolean isUserAdult(){
       return age>=18;
    }

    public int getUserAge(){
        return age;
    }

    public void greetings(String name){
        System.out.println("Hi " + name + ", nice to see you!");
    }
    public void greetingsFullName(String firstName, String lastName){
        System.out.println("Hi " + firstName + " " + lastName + ", nice to see you!");
    }

    public void howOldAreYou(String name, int age){
        System.out.println("Hi " + name + ", your age is " + age);
    }

    public int yourAgePlus10(int age){
        return age + 10;
    }

    public static int getUserCounter(){
        return userCounter;
    }

    // CONSTRUCTOR, NAME MUST BE THE SAME AS CLASS NAME
    // CONSTRUCTOR HAS NOT SPECIFIED RETURN TYPE
    // TAK WYGLĄDA DEFAULTOWY KONSTRUKTOR

    // DEFAULT = W OBRĘBIE JEDNEGO PROJEKTU
    // PUBLIC = DOSTĘPNY W CAŁYM PROJEKCIE
    // PROTECTED =
    // PRIVATE = DOSTEPNY W OBRĘBIE KLASY

    public User(String email, String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }



    // GETTERS & SETTERS


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email.endsWith(".ru")){
            System.out.println("Russian domains are restricted");
        } else{
        this.email = email;
        }
    }

    // ENKAPSULACJA -> STOSOWANIE GETTERÓW I SETTERÓW DO UZYSKIWANIA/EDYCJI PRYWATNYCH ZMIENNYCH

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
