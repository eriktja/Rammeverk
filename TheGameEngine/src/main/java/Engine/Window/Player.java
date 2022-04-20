package Engine.Window;

import java.awt.*;

public class Player extends GameObject{


    public Player(int x, int y, ID id) {
        super(x, y, id);

        velY = 1;
        velX = 1;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 32, 32);
    }
}
