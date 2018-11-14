package person.consciousness;

public enum LevelTypes {

    LOW(1), MEDIUM(2), HIGH(3), PROFESSIONAL(4);

    private int n;

    LevelTypes(int n) {
        this.n = n;
    }

    public int numeric() {
        return n;
    }

    public static LevelTypes fromNumeric(int n) {
        switch (n) {
            case 1 :
                return LOW;
            case 2 :
                return MEDIUM;
            case 3 :
                return HIGH;
            case 4 :
                return PROFESSIONAL;
            default:
                return MEDIUM;
        }
    }
}
