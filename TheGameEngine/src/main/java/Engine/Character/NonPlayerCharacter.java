package Engine.Character;

import Engine.Items.Item;

public class NonPlayerCharacter extends Character{
    private int movementPattern;

    public NonPlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    public NonPlayerCharacter() {

    }

    public void setMovementPattern(int movementPattern){
        this.movementPattern = movementPattern;
    }

}
