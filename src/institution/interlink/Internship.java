package institution.interlink;

import java.util.*;
import person.Student;

public class Internship {
    
    private String name;
    private ArrayList<Student> enterStudents;
    private List<Student> candidates;
    
    public Internship(String name) {
        this.name = name;
        enterStudents = new ArrayList();
        candidates = new ArrayList();
    }

    public void setStudent(Student student) {
        candidates.add(student);
    }

    public ArrayList<Student> getStudents() {
        return enterStudents;
    }
    
    public void addCandidates(List<Student> candidates) {
        this.candidates = candidates;
        candidates.stream().filter((s) -> (s.getLevel() > calculateMidLevel())).forEachOrdered((s) -> {
            enterStudents.add(s);
        });
    }
    
    private int calculateMidLevel() {
        int sum = 0;
        for (Student s: candidates) {
            sum += s.getLevel();
        }
        return (int)sum / candidates.size(); // середній бал по універу
    }
}
