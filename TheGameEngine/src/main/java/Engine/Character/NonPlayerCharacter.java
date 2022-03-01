package Engine.Character;

import Engine.Items.Item;

public class NonPlayerCharacter extends Character{
    private int movementPattern;
    private int highScorePoints;

    public NonPlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed, int highScorePoints) {
        super(movementSpeed, healthPoints, attackSpeed);
        this.highScorePoints = highScorePoints;
    }

    public NonPlayerCharacter() {

    }

    public void setMovementPattern(int movementPattern){
        this.movementPattern = movementPattern;
    }

    public void setHighScorePoints(int highScorePoints)
    {
        this.highScorePoints = highScorePoints;
    }

    public int getHighScorePoints()
    {
        return highScorePoints;
    }

    public int killed(){
        return highScorePoints;
    }
}
