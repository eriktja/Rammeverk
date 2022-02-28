import Engine.Character.Character;
import Engine.Character.NonPlayerCharacter;
import Engine.Character.PlayerCharacter;
import Engine.Items.Armor;
import Engine.Items.Consumable;
import Engine.Items.Item;
import Engine.Items.Weapon;
import Engine.TheGameEngine;
import Engine.Window.Window;

public class Main {
    public static void main(String[] args) {

        TheGameEngine app = new TheGameEngine();
        app.createWindow();
        app.setFullscreen();
        app.setWindowBackground("bakgrunn.jpg");
        app.setWindowSize(800,600);

        Window window = new Window();


        Character player = app.createCharacter(1, 100, 1);
        Item healthPot = new Consumable("Health potion", 50, 1);
        player.addToInventory(healthPot);
        player.useItem(healthPot);

        PlayerCharacter character1 = new PlayerCharacter(1,2,3);
        character1.setMovementSpeed (100);
        character1.setHealthPoints (100);
        character1.setAttackSpeed (1);
        character1.setMoveLeftButton("KeyEvent.VK_LEFT");
        character1.setMoveRightButton("KeyEvent.VK_RIGHT");
        character1.setAttackButton("KeyEvent.VK_SPACE");
        character1.setJumpButton("KeyEvent.VK_UP");

        Character character2 = new NonPlayerCharacter(1,2,3);
        character2.setMovementSpeed (100);
        character2.setHealthPoints (100);
        character2.set
        character2.setItemDropChance(item: healthPotion ,chance: 40);

        Item  rustyShortSword = new Weapon("Rusty  shortsword",9, 3);
        Item  wornLeatherBoots = new Armor("Worn  Leather  Boots", 10, 0);
        Item  tornPants = new  Armor("Torn  Pants", 0, 0);
        character.addItem(rustyShortSword);
        character.addItem(wornLeatherBoots);
        character.addItem(tornPants);


    }
}