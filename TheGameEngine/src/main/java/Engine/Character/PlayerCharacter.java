package Engine.Character;

public class PlayerCharacter extends Character{
    public String moveLeft;
    public String moveRight;
    public String attack;
    public String jump;
    public String useConsumable;

    public PlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    public PlayerCharacter() {

    }

    public void setMoveLeftButton(String button){
        moveLeft = button;
    }
    public void setMoveRightButton(String button){
        moveRight = button;
    }
    public void setAttackButton(String button){
        attack = button;
    }
    public void setJumpButton(String button){
        jump = button;
    }
    public void setUseConsumable(String button) {
        useConsumable = button;
    }
}
