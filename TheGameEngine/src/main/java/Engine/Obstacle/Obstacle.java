package Engine.Obstacle;

public class Obstacle {
    private int width;
    private int movementSpeedReduction;
    private int damagePerSecond;
    private int chanceToSpawn;

    public Obstacle(int width, int movementSpeedReduction, int damagePerSecond, int chanceToSpawn) {
        this.width = width;
        this.movementSpeedReduction = movementSpeedReduction;
        this.damagePerSecond = damagePerSecond;
        this.chanceToSpawn = chanceToSpawn;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
