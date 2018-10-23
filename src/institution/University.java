package institution;

import institution.interlink.Internship;
import java.util.ArrayList;
import person.Student;
import person.consciousness.Knowledge;

public class University {
    
    private String name;
    private static ArrayList<Student> studentList;
    
    public University(String name) {
        this.name = name;
        
        studentList = new ArrayList();
    }

    public void setStudent(Student student) {
        
    }

    public void addStudent(Student student) {
        student.setKnowledge(new Knowledge((int) (Math.random() * 5)));
        System.out.println(student.getLevel());
        studentList.add(student);
    }
    
    public void sendToInternship(Internship internship) {
        studentList.stream().filter((s) -> (s.getLevel() >= 4)).forEachOrdered((s) -> {
            internship.setStudent(s);
        });
    }
}
