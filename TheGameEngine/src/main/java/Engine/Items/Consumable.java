package Engine.Items;

public class Consumable extends Item{
    private int function;
    private int amount;

    private Consumable(String name, int function, int amount) {
        super(name);
        this.function = function;
        this.amount = amount;
    }

    private Consumable() {
    }

    // Factory methods
    public static Consumable create(){
        return new Consumable();
    }
    public static Consumable create(String name, int function, int amount){
        return new Consumable(name, function, amount);
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

    @Override
    public void use(){
        this.consume();
    }

    private void consume() {
    }
}
