package Model;

public class User implements Comparable<User> {

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

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
                + ", isAdult=" + isAdult + "]";
    }

    // HASH CODE ZWRACA SPECJALNE ID DLA KAŻDEGO OBIEKTU, ZAWSZE TRZEBA JĄ IMPLEMENTOWAĆ RAZEM Z EQUALS
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + age;
        result = prime * result + (isAdult ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (age != other.age)
            return false;
        if (isAdult != other.isAdult)
            return false;
        return true;
    }

    // ZWRACA 1 GDY PIERWSZY OBIEKT JEST WIĘKSZY NIŻ DRUGI
    // ZWRACA 0 GDY OBIEKTY SĄ TAKIE SAME
    // ZWRACA -1 GDY PIERWSZY OBIEKT JEST MNIEJSZY NIŻ DRUGI
    @Override
    public int compareTo(User u) {
    int compareResult = this.getFirstName().compareTo(u.getFirstName());
    if (compareResult == 0){
        compareResult = this.getLastName().compareTo(u.getLastName());
    }
    return compareResult;
    }

    

}
