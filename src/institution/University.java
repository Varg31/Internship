package institution;

import institution.interlink.Internship;
import java.util.ArrayList;
import java.util.List;
import person.Student;
import person.consciousness.Knowledge;

public class University {
    
    private String name;
    private List<Student> studentList;
    
    public University(String name) {
        this.name = name;
        
        studentList = new ArrayList();
    }

    public void setStudents(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        student.setKnowledge(new Knowledge((int) (Math.random() * 6)));
        System.out.println(student.getName() + ": " + student.getLevel());
        studentList.add(student);
    }
    
    public void sendToInternship(Internship internship) {
        int sum = 0;
        sum = studentList.stream().map((s) -> s.getLevel()).reduce(sum, Integer::sum);
        
        int mid = (int)sum / studentList.size(); // середній бал по універу
        
        studentList.stream().filter((s) -> (s.getLevel() > mid)).forEachOrdered((s) -> {
            internship.setStudent(s);
        });
    }
}
