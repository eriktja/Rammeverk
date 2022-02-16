package Engine.Character;

public class NonPlayerCharacter extends Character{
    private int movementPattern;

    public NonPlayerCharacter(int movementSpeed, int healthPoints) {
        super(movementSpeed, healthPoints);
    }

    public void setMovementPattern(){}
}
