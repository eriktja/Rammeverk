package Engine.Character;

public class NonPlayerCharacter extends Character{
    private int movementPattern;
    private int highScorePoints;

    private NonPlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed, int highScorePoints) {
        super(movementSpeed, healthPoints, attackSpeed);
        this.highScorePoints = highScorePoints;
    }

    private NonPlayerCharacter() {
    }


    // Factory methods
    public static NonPlayerCharacter create(){
        return new NonPlayerCharacter();
    }
    public static NonPlayerCharacter create(int movementSpeed, int healthPoints, int attackSpeed, int highScorePoints){
        return new NonPlayerCharacter(movementSpeed, healthPoints, attackSpeed, highScorePoints);
    }


    public void setMovementPattern(int movementPattern){
        this.movementPattern = movementPattern;
    }

    public void setHighScorePoints(int highScorePoints) {
        this.highScorePoints = highScorePoints;
    }

    public int getHighScorePoints() {
        return highScorePoints;
    }

    public boolean killed(){
        return this.getHealthPoints() <= 0;
    }
}
