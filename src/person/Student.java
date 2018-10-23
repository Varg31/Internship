package person;

import person.consciousness.Knowledge;

public class Student {
    
    private String name;
    private Knowledge knowledge;
    
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return knowledge.getLevel();
    }
    
    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
