package Engine.Character;

public class NonPlayerCharacter extends Character{
    private int movementPattern;

    public NonPlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    public void setMovementPattern(int movementPattern){
        this.movementPattern = movementPattern;
    }
}
