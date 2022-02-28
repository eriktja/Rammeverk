package Engine.Character;
import Engine.Items.Item;
import java.util.ArrayList;

public class Character {
    private int movementSpeed;
    private int healthPoints;
    private int attackSpeed;
    private ArrayList<Item> inventory = new ArrayList<>(); // Might move this to playerCharacter

    public Character() {
    }

    public Character(int movementSpeed, int healthPoints, int attackSpeed) {
        this.movementSpeed = movementSpeed;
        this.healthPoints = healthPoints;
        this.attackSpeed = attackSpeed;
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

    public void addToInventory(Item item){
        inventory.add(item);
    }

    public void useItem(Item item){
        if(inventory.contains(item)){
            item.use();
            inventory.remove(item);
        }
        else
            System.out.println("Item not in inventory");
    }
}
