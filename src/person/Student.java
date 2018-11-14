package person;

import java.util.Comparator;
import person.consciousness.Knowledge;

public class Student implements Comparator<Student>{
    
    private String name;
    private Knowledge knowledge;
    
    public Student(String name) {
        this.name = name;
        knowledge = new Knowledge();
    }
    
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return knowledge.getLevel();
    }
    
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getLevel() - o2.getLevel());
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}

