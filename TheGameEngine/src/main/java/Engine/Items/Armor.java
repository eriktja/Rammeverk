package Engine.Items;

public class Armor extends Item{

    private int healthBonus;
    private int movementSpeedReduction;

    private Armor(String name, int healthBonus, int movementSpeedReduction) {
        super(name);
        this.healthBonus = healthBonus;
        this.movementSpeedReduction = movementSpeedReduction;
    }

    private Armor() {

    }

    // Factory methods
    public static Armor createArmor(){
        return new Armor();
    }
    public static Armor createArmor(String name, int healthBonus, int movementSpeedReduction){
        return new Armor(name, healthBonus, movementSpeedReduction);
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getMovementSpeedReduction() {
        return movementSpeedReduction;
    }

    public void setMovementSpeedReduction(int movementSpeedReduction) {
        this.movementSpeedReduction = movementSpeedReduction;
    }

    @Override
    public void use(){
        this.equip();
    }

    private void equip() {
    }
}
