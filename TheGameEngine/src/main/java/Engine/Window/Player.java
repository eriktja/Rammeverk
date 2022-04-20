package Engine.Window;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject{

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        if(id == ID.Player)
            g.setColor(Color.BLACK);
        else
            g.setColor(Color.RED);
        g.fillRect(x, y, 32, 32);
    }
}
