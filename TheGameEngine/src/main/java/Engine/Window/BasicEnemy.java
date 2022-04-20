package Engine.Window;

import java.awt.*;
import java.util.Random;

public class BasicEnemy extends GameObject {
    private static int counter = 0;
    private Random r = new Random();
    private Handler handler;
    private int height = 16;
    private int width = 16;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

        counter++;

        velX = 5;
        velY = 5;
        if(counter % 2 == 0) velX *= -2;
        if(counter % 3 == 0) velY *= -2;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.height) velY *=  -1;
        if(x <= 0 || x >= Game.width) velX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, width, height, Color.RED, handler, 0.1f));
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
