import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Initialize variables
        School uhill = new School("Uhill", "Mr. Zaremba", "Vancouver");
        Student s1 =  new Student("1", "a", 8);
        Student s2 =  new Student("2", "b", 8);
        Student s3 =  new Student("3", "c", 9);
        Student s4 =  new Student("4", "d", 9);
        Student s5 =  new Student("5", "e", 10);
        Student s6 =  new Student("6", "f", 10);
        Student s7 =  new Student("7", "g", 11);
        Student s8 =  new Student("8", "h", 11);
        Student s9 =  new Student("9", "i", 12);
        Student s10 =  new Student("10", "j", 12);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        Teacher t1 = new Teacher("one", "two", "Math");
        Teacher t2 = new Teacher("three", "four", "Computer");
        Teacher t3 = new Teacher("five", "six", "Science");
        //add teachers & students in the school
        for (int i = 0; i < 10; i++){
            uhill.addStudent(students.get(i));
        }
        uhill.addTeacher(t1);
        uhill.addTeacher(t2);
        uhill.addTeacher(t3);

        //display
        System.out.println("The following are the students in school");
        uhill.printStudents();
        System.out.println("The following are the teachers in school");
        uhill.printTeachers();

    }
}
