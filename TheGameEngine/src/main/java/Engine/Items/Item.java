package Engine.Items;

import Engine.Character.Character;

public class Item {
    private String name;

    protected Item(String name) {
        this.name = name;
    }

    protected Item() {
    }

    // Factory methods
    public static Item createItem(){
        return new Item();
    }

    public static Item createItem(String name){
        return new Item(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void use() {
    }
}
