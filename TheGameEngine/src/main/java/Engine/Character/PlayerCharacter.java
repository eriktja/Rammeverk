package Engine.Character;

public class PlayerCharacter extends Character{
    public String moveLeft;
    public String moveRight;
    public String attack;
    public String jump;

    public PlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    public void setMoveLeftButton(String button){}
    public void setMoveRightButton(String button){}
    public void setAttackButton(String button){}
    public void setJumpButton(String button){}
}
