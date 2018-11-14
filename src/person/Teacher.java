package person;

import person.consciousness.*;

public class Teacher {
    private final String name;
    private final Qualification qualification;
    
    public Teacher(String name) {
        this.name = name;
        qualification = new Qualification(createQualification());
    }
    
    public Knowledge getKnowledge() {
        return qualification.getKnowledge();
    }
    
    public String getName() {
        return name;
    }
    
    public int getQualificationLevel() {
        System.out.println(qualification.getLevel());
        return qualification.getLevel();
    }
    
    public Knowledge teach() {
        int level = (int)(Math.random() * 10);
        //System.out.println("Teacher level: " + getQualificationLevel());
        return new Knowledge(level);
    }
    
    private LevelTypes createQualification() {
        int level = (int)(Math.random() * 5);
        return LevelTypes.fromNumeric(level);
    }
}
