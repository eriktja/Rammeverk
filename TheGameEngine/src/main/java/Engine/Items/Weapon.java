package Engine.Items;

public class Weapon extends Item{

    private int attackDamage;
    private int attackSpeed;

    public Weapon(String name, int attackDamage, int attackSpeed) {
        super(name);
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
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
}
