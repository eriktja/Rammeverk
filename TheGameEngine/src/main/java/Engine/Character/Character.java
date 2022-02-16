package Engine.Character;

public class Character {
    private int movementSpeed;
    private int healthPoints;

    public Character() {
    }

    public Character(int movementSpeed, int healthPoints) {
        this.movementSpeed = movementSpeed;
        this.healthPoints = healthPoints;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
