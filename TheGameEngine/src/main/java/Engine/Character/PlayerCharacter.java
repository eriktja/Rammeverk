package Engine.Character;

public class PlayerCharacter extends Character{
    public String moveLeft;
    public String moveRight;
    public String attack;
    public String jump;
    public String useConsumable;

    private PlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    private PlayerCharacter() {

    }

    // Factory methods
    public static PlayerCharacter createCharacter(){
        return new PlayerCharacter();
    }
    public static PlayerCharacter createCharacter(int movementSpeed, int healthPoints, int attackSpeed){
        return new PlayerCharacter(movementSpeed, healthPoints, attackSpeed);
    }

    // Keyboard inputs
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

    public boolean isDead(){
        return this.getHealthPoints() == 0;
    }
}
