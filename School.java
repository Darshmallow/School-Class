import java.util.ArrayList;
public class School {
    //fields
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private String name;
    private String principal;
    private String district;

    //constructor
    public School(String name, String principal, String district) {
        this.name = name;
        this.principal = principal;
        this.district = district;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    //add things
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    //remove things
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    //getters
    public String getName() {
        return name;
    }
    public String getDistrict() {
        return district;
    }
    public String getPrincipal() {
        return principal;
    }

    //show all students/teachers
    public void printStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void printTeachers() {
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
}