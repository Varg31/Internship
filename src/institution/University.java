package institution;

import java.util.*;
import person.Student;
import person.consciousness.Knowledge;

public class University {
    
    private String name;
    private List<Student> studentList;
    
    public University(String name) {
        this.name = name;
        
        studentList = new ArrayList();
    }

    public void setStudent(Student student) {
        studentList.add(student);
    }
    
    public List<Student> getStudents() {
        return studentList;
    }

    public void addStudent(Student student) { 
        student.setKnowledge(new Knowledge((int) (Math.random() * 6)));
        System.out.println(student.getName() + ": " + student.getLevel());
        studentList.add(student);
    }
}
