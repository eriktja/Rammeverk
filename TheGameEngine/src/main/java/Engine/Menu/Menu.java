package Engine.Menu;

import Engine.Window.Window;

import java.awt.*;
import java.util.ArrayList;

public class Menu {
    private Window window;
    int height, width;
    ArrayList<Button> buttons;

    public Menu(Window window, int height, int width) {
        this.window = window;
        this.height = height;
        this.width = width;
    }

    // Ha egen klasse for button med innhold og lokasjon? overloade på typ run()/exit()?
    public void addButton(Button button) {
        buttons.add(button);
    }
}
