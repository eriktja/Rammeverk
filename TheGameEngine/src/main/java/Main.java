import Engine.Character.Character;
import Engine.Character.NonPlayerCharacter;
import Engine.Character.PlayerCharacter;
import Engine.Items.Armor;
import Engine.Items.Consumable;
import Engine.Items.Item;
import Engine.Items.Weapon;
import Engine.Window.Window;

public class Main {
    public static void main(String[] args) {

        Window window = new Window();
        window.createWindow();
        window.setFullscreen();
        window.setBackground("bakgrunn.jpg");
        window.setSize(800,600);

        Character player = new PlayerCharacter(1, 100, 1);
        Item healthPot = new Consumable("Health potion", 50, 1);
        player.addToInventory(healthPot);
        player.useItem(healthPot);

        PlayerCharacter playerCharacter = new PlayerCharacter(1,2,3);
        playerCharacter.setMovementSpeed (100);
        playerCharacter.setHealthPoints (100);
        playerCharacter.setAttackSpeed (1);
        playerCharacter.setMoveLeftButton("KeyEvent.VK_LEFT");
        playerCharacter.setMoveRightButton("KeyEvent.VK_RIGHT");
        playerCharacter.setAttackButton("KeyEvent.VK_SPACE");
        playerCharacter.setJumpButton("KeyEvent.VK_UP");

        NonPlayerCharacter npc = new NonPlayerCharacter(1,2,3);
        npc.setMovementSpeed (100);
        npc.setHealthPoints (100);
        npc.setMovementPattern(1);
        npc.addToInventory(new Consumable("HealthPotion", 1,1) );

        Item rustyShortSword = new Weapon("Rusty shortsword",9, 3);
        Item wornLeatherBoots = new Armor("Worn Leather Boots", 10, 0);
        Item tornPants = new  Armor("Torn Pants", 0, 0);
        playerCharacter.addToInventory(rustyShortSword);
        playerCharacter.addToInventory(wornLeatherBoots);
        playerCharacter.addToInventory(tornPants);

    }
}