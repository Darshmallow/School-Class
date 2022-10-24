public class Teacher {
    //fields
    private String firstName;
    private String lastName;
    private String subject;
    private String fullName;

    //constructor
    public Teacher(String first, String last, String subject){
        this.firstName = first;
        this.lastName = last;
        this.subject = subject;
        this.fullName = first + " " + last;
    }

    //toString
    public String toString(){
        return "Name: " + fullName + " Subject: " + subject;
    }

    //getters
    public String getName(){
        return fullName;
    }
    public String getSubject(){
        return subject;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    //setters  <- yay  volleyball is  fun
    public void setSubject(String subject){
        this.subject = subject;
    }
}
