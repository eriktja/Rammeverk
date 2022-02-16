import Engine.TheGameEngine;
import Engine.Window;

public class Main {
    public static void main(String[] args) {

        TheGameEngine app = new TheGameEngine();
        app.createWindow();
        app.setFullscreen();
        app.setWindowBackground("bakgrunn.jpg");
        app.setWindowSize(800,600);

    }
}