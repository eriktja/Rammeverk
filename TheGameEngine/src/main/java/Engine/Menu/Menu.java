package Engine.Menu;

import Engine.Button.Button;
import Engine.Window.Window;
import java.util.ArrayList;

public class Menu {
    private int height;
    private int width;
    ArrayList<Button> buttons = new ArrayList<>();

    public Menu(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // Ha egen klasse for button med innhold og lokasjon? overloade på typ run()/exit()?
    public void addButton(Engine.Button.Button button) {
        buttons.add(button);
    }

    public void alignVertical() {
    }
}
