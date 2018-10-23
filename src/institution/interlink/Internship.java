package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    
    private String name;
    private ArrayList<Student> enterStudents;
    
    public Internship(String name) {
        this.name = name;
        enterStudents = new ArrayList();
    }

    public void setStudent(Student student) {
        enterStudents.add(student);
    }

    public String getStudents() {
        for (Student s: enterStudents) {
            return s.getName() + "\n";
        }
        return "There are no students  with enough knowledge level.";
    }
}
