package person.consciousness;

public class Qualification {
    private final LevelTypes level;
    private Knowledge knowledge;
    
    public Qualification(LevelTypes level) {
        this.level = level;
        //knowledge = new Knowledge(level.numeric());
        setUpKnowledge();
    }
    
    public int getLevel() {
        return knowledge.getLevel();//level.numeric();
    }
    
    private void setUpKnowledge() {
        int knowledgeLevel = level.numeric();
        knowledge = new Knowledge(knowledgeLevel * 3);
    }
    
    public Knowledge getKnowledge() {
        return knowledge;
    }
}
