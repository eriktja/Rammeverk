package Engine.Items;

public class Weapon extends Item{

    private int attackDamage;
    private int attackSpeed;

    private Weapon(String name, int attackDamage, int attackSpeed) {
        super(name);
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    private Weapon() {

    }

    // Factory methods
    public static Weapon createWeapon(){
        return new Weapon();
    }
    public static Weapon createWeapon(String name, int attackDamage, int attackSpeed){
        return new Weapon(name, attackDamage, attackSpeed);
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Override
    public void use(){
        this.equip();
    }

    private void equip() {
    }
}
