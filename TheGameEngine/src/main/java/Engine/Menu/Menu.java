package Engine.Menu;

import Engine.Button.Button;
import Engine.Window.Window;

import java.awt.*;
import java.util.ArrayList;

public class Menu {
    private Window window;
    ArrayList<Button> buttons;

    public Menu(Window window) {
        this.window = window;
    }

    // Ha egen klasse for button med innhold og lokasjon? overloade på typ run()/exit()?
    public void addButton(Engine.Button.Button button) {
        buttons.add(button);
    }

    public void alignVertical() {

    }
}
