package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    
    private String name;
    private ArrayList<Student> enterStudents;
    private ArrayList<String> nameList;
    
    public Internship(String name) {
        this.name = name;
        enterStudents = new ArrayList();
        nameList = new ArrayList();
    }

    public void setStudent(Student student) {
        enterStudents.add(student);
    }

    public ArrayList<String> getStudents() {
        enterStudents.forEach((s) -> { nameList.add(s.getName()); });
        
        return nameList;
    }
}
