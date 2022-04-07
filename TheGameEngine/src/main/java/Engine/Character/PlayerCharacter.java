package Engine.Character;

/**
 * Used to create the player controlled character.
 */
public class PlayerCharacter extends Character{
    private static PlayerCharacter instance = null;
    private String moveLeft;
    private String moveRight;
    private String attack;
    private String jump;
    private String useConsumable;

    private PlayerCharacter(int movementSpeed, int healthPoints, int attackSpeed) {
        super(movementSpeed, healthPoints, attackSpeed);
    }

    private PlayerCharacter() {

    }


    // Implementation of singleton-pattern

    /**
     * Create an instance of the PlayerCharacter class.
     * If an instance is created earlier this will be returned
     * @return instance of PlayerCharacter
     */
    public static PlayerCharacter create(){
        if(PlayerCharacter.instance == null)
            PlayerCharacter.instance = new PlayerCharacter();
        return PlayerCharacter.instance;
    }

    /**
     * Create an instance of the PlayerCharacter class.
     * If an instance is created earlier this will be returned
     * @param movementSpeed movement speed of the character
     * @param healthPoints amount of health points
     * @param attackSpeed attack speed of the character
     * @return instance of PlayerCharacter
     */
    public static PlayerCharacter create(int movementSpeed, int healthPoints, int attackSpeed){
        if(PlayerCharacter.instance == null){
            PlayerCharacter.instance = new PlayerCharacter();
        }
        instance.setMovementSpeed(movementSpeed);
        instance.setMovementSpeed(healthPoints);
        instance.setMovementSpeed(attackSpeed);
        return PlayerCharacter.instance;
    }

//    public static PlayerCharacter createCharacter(){
//        return new PlayerCharacter();
//    }
//    public static PlayerCharacter createCharacter(int movementSpeed, int healthPoints, int attackSpeed){
//        return new PlayerCharacter(movementSpeed, healthPoints, attackSpeed);
//    }

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
