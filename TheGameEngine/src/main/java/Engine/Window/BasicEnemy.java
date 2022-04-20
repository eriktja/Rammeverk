package Engine.Window;

import java.awt.*;

public class BasicEnemy extends GameObject {

    private Handler handler;
    private int height = 16;
    private int width = 16;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

        velX = 15;
        velY = 15;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.height) velY *= -1;
        if(x <= 0 || x >= Game.width) velX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, width, height, Color.RED, handler, 0.01f));
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
