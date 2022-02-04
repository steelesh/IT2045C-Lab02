import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int yob;

    public Person(String ID, String firstName, String lastName, String title, int yob){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yob = yob;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) { this.ID = ID; }
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) { this.yob = yob; }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + yob +
                '}';
    }
    public String fullName(){
        return this.firstName + " " + this.lastName;
    }
    public String formalName(){
        return this.title + " " + fullName();
    }
    public int getAge(){
        int age = Calendar.getInstance().get(Calendar.YEAR) - this.yob;
        return age;
    }
    public int getAgeFromYear(int year){
        int age = year - this.yob;
        return age;
    }
    public String toCSV(){
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.yob;
    }
}