public class User {
    // POLA OBIEKTU
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // METODY

    void getFullName(){
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo(){
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    boolean isUserAdult(){
       return age>=18;
    }

    int getUserAge(){
        return age;
    }

    void greetings(String name){
        System.out.println("Hi " + name + ", nice to see you!");
    }
    void greetingsFullName(String firstName, String lastName){
        System.out.println("Hi " + firstName + " " + lastName + ", nice to see you!");
    }

    void howOldAreYou(String name, int age){
        System.out.println("Hi " + name + ", your age is " + age);
    }

    int yourAgePlus10(int age){
        return age + 10;
    }

    // CONSTRUCTOR, NAME MUST BE THE SAME AS CLASS NAME
    // CONSTRUCTOR HAS NOT SPECIFIED RETURN TYPE
    // TAK WYGLĄDA DEFAULTOWY KONSTRUKTOR

    User(String email, String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

}
