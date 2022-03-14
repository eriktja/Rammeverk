import Engine.Button.Button;
import Engine.Character.NonPlayerCharacter;
import Engine.Character.PlayerCharacter;
import Engine.HighScore.HighScore;
import Engine.Items.Armor;
import Engine.Items.Consumable;
import Engine.Items.Item;
import Engine.Items.Weapon;
import Engine.Menu.Menu;
import Engine.Rectangle.Obstacle;
import Engine.Rectangle.Rectangle;
import Engine.Window.Animations.CharacterAnimation;
import Engine.Window.Animations.RectangleAnimation;
import Engine.Window.Window;

import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        // Scenario 1
        Window window = Window.create();
        window.setFullscreen();
        window.setBackground("Background");

        // Scenario 2
        Window window1 = Window.create(800, 600);
        window1.setBackground("blue");

        // Scenario 3
        Menu menu = new Menu(window);
        Button start = new Button("center", "Start Game");
        Button quit = new Button("center","Quit");
        menu.addButton(start);
        menu.addButton(quit);

        // Scenario 4
        PlayerCharacter character = PlayerCharacter.create();
        character.setMovementSpeed(100);
        character.setHealthPoints(100);
        character.setAttackSpeed(1);
        character.setMoveLeftButton("KeyEvent.VK_LEFT");
        character.setMoveRightButton("KeyEvent.VK_RIGHT");
        character.setAttackButton("KeyEvent.VK_SPACE");
        character.setJumpButton("KeyEvent.VK_UP");

        PlayerCharacter mainCharacter = PlayerCharacter.create();
        mainCharacter.setMovementSpeed(100);
        mainCharacter.setHealthPoints(100);
        mainCharacter.setAttackSpeed(1);
        mainCharacter.setMoveLeftButton("KeyEvent.VK_LEFT");
        mainCharacter.setMoveRightButton("KeyEvent.VK_RIGHT");
        mainCharacter.setAttackButton("KeyEvent.VK_SPACE");
        mainCharacter.setJumpButton("KeyEvent.VK_UP");

        PlayerCharacter character2 = PlayerCharacter.create(100, 100, 1);
        character2.setMoveLeftButton("KeyEvent.VK_LEFT");
        character2.setMoveRightButton("KeyEvent.VK_RIGHT");
        character2.setAttackButton("KeyEvent.VK_SPACE");
        character2.setJumpButton("KeyEvent.VK_UP");

        // Scenario 5
        NonPlayerCharacter npc = NonPlayerCharacter.create();
        npc.setMovementSpeed(100);
        npc.setHealthPoints(100);
        npc.setMovementPattern(50);
        npc.addToInventory(Weapon.create("BIG FUCKING GUN 3000", 10, 1));

        NonPlayerCharacter enemy = NonPlayerCharacter.
                create(100, 100, 1, 10);
        enemy.setMovementPattern(30);
        npc.addToInventory(Weapon.create("BB-gun", 1, 1));

        // Scenario 6
        PlayerCharacter character1 = PlayerCharacter.create();
        character1.setMovementSpeed(100);
        character1.setHealthPoints(100);
        character1.setAttackSpeed(1);
        character1.setJumpHeight(100);

        // Scenario 7
        Item rustyShortSword = Weapon.create("Rusty short-sword", 9, 3);
        Item wornLeatherBoots = Armor.create("Worn Leather Boots", 10, 0);
        Item tornPants = Armor.create("Torn Pants", 0, 0);

        character.addToInventory(rustyShortSword);
        character.addToInventory(wornLeatherBoots);
        character.addToInventory(tornPants);

        // Scenario 8
        character.setUseConsumable("KeyEvent.VK_E");
        Item healthPotion = Consumable.create("Health Potion", 1,50);
        character.addToInventory(healthPotion);

        // Scenario 9
        npc.setHighScorePoints(10);

        HighScore highScore = HighScore.create();
        highScore.setHighscore(npc.getHighScorePoints());

        // Scenario 10

        // Scenario 11
        Obstacle lava = Obstacle.create(10, 0, 1, 5, 15, 10, 20);
        Rectangle platform = Rectangle.create(250, 100,10,10);
        // Scenario 12

        // Scenario 13

        // Scenario 14

        // Scenario 15
        CharacterAnimation playerAnimation = new CharacterAnimation("image.jpg");
        PlayerCharacter player = PlayerCharacter.create();
        player.setCharacterAnimation(playerAnimation);

        // Scenario 16
        CharacterAnimation playerAnimation1 = new CharacterAnimation();
        playerAnimation1.setColor("102, 255, 102");
        PlayerCharacter player1 = PlayerCharacter.create();
        player1.setCharacterAnimation(playerAnimation);

        //Scenario 17
        RectangleAnimation rectangleAnimation = new RectangleAnimation("lavaImage.jpg");
        lava.setRectangleAnimation(rectangleAnimation);



/*
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
*/
    }
}