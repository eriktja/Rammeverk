import Engine.Character.Character;
import Engine.Character.PlayerCharacter;
import Engine.Items.Consumable;
import Engine.Items.Item;
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


        Character player = app.createCharacter(1, 100);
        Item healthPot = new Consumable("Health potion", 50, 1);
        player.addToInventory(healthPot);
        player.useItem(healthPot);
    }
}