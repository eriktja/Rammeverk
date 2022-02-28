package Engine.Obstacle;

public class Obstacle {
    private int movementSpeedReduction;
    private int damagePerSecond;
    private int chanceToSpawn;

    public Obstacle(int movementSpeedReduction, int damagePerSecond, int chanceToSpawn)
    {
        this.movementSpeedReduction = movementSpeedReduction;
        this.damagePerSecond = damagePerSecond;
        this.chanceToSpawn = chanceToSpawn;
    }

    public int getMovementSpeedReduction()
    {
        return movementSpeedReduction;
    }

    public void setMovementSpeedReduction(int movementSpeedReduction)
    {
        this.movementSpeedReduction = movementSpeedReduction;
    }

    public int getDamagePerSecond()
    {
        return damagePerSecond;
    }

    public void setDamagePerSecond(int damagePerSecond)
    {
        this.damagePerSecond = damagePerSecond;
    }

    public int getChanceToSpawn()
    {
        return chanceToSpawn;
    }

    public void setChanceToSpawn(int chanceToSpawn)
    {
        this.chanceToSpawn = chanceToSpawn;
    }
}
