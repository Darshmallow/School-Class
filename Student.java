public class Student {
    //fields
    private String firstName;
    private String lastName;
    private String fullName;
    private int grade;
    private int id;
    private static int ids;

    //constructor
    public Student(String first, String last, int grade){
        this.firstName = first;
        this.lastName = last;
        this.grade = grade;
        this.id = ids;
        this.fullName = first + " " + last;
        ids++;
    }

    //toString
    public String toString(){
        return "Name: " + fullName + " Grade: " + grade;
    }

    //setters
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void raiseGrade(){
        grade++;
    }
    public void setId(int id) {
        this.id = id;
    }

    //getters
    public String getFullName(){
        return fullName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getGrade() {
        return grade;
    }
    public String getFirstName() {
        return firstName;
    }

}
