package Engine.Window.Rectangle;

public class Obstacle extends Rectangle {
    private int movementSpeedReduction;
    private int damagePerSecond;
    private int chanceToSpawn;

    private Obstacle(int xPos, int yPos, int height, int width, int movementSpeedReduction, int damagePerSecond, int chanceToSpawn)
    {
        super(xPos, yPos, height, width);
        this.movementSpeedReduction = movementSpeedReduction;
        this.damagePerSecond = damagePerSecond;
        this.chanceToSpawn = chanceToSpawn;
    }

    /*
    // add standard values to object?
    private Obstacle(int movementSpeedReduction, int damagePerSecond, int chanceToSpawn)
    {
        this.movementSpeedReduction = movementSpeedReduction;
        this.damagePerSecond = damagePerSecond;
        this.chanceToSpawn = chanceToSpawn;
    }
    */
    private Obstacle() {

    }

    // Factory methods
    public static Obstacle create(){
        return new Obstacle();
    }

    public static Obstacle create(int xPos, int yPos, int height, int width, int movementSpeedReduction, int damagePerSecond, int chanceToSpawn){
        return new Obstacle(xPos, yPos, height, width, movementSpeedReduction, damagePerSecond, chanceToSpawn);
    }

    public int getMovementSpeedReduction() {
        return movementSpeedReduction;
    }

    public void setMovementSpeedReduction(int movementSpeedReduction) {
        this.movementSpeedReduction = movementSpeedReduction;
    }

    public int getDamagePerSecond() {
        return damagePerSecond;
    }

    public void setDamagePerSecond(int damagePerSecond) {
        this.damagePerSecond = damagePerSecond;
    }

    public int getChanceToSpawn() {
        return chanceToSpawn;
    }

    public void setChanceToSpawn(int chanceToSpawn) {
        this.chanceToSpawn = chanceToSpawn;
    }
}
