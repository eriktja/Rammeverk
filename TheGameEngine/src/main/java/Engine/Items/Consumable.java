package Engine.Items;

import Engine.Character.Character;

public class Consumable extends Item{
    private int function;
    private int amount;

    public Consumable(String name, int function, int amount) {
        super(name);
        this.function = function;
        this.amount = amount;
    }

    public int getFunction() {
        return function;
    }

    public void setFunction(int function) {
        this.function = function;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
