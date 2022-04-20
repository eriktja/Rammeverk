package Engine.Window;

import java.awt.*;

public class Trail extends GameObject{
    private float alpha = 1.0f;
    private Color color;
    private int width, height;
    float life;
    private Handler handler;

    public Trail(int x, int y, ID id, int width, int height, Color color, Handler handler, float life) {
        super(x, y, id);
        this.width = width;
        this.height = height;
        this.color = color;
        this.handler = handler;
        this.life = life;
    }

    @Override
    public void tick() {
        if(alpha > life){
            alpha -= life - 0.01f;
        }
        else handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setComposite(makeTransparent(alpha));
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g2d.setComposite(makeTransparent(1));

    }

    private AlphaComposite makeTransparent(float alpha){
        int type = AlphaComposite.SRC_OVER;
        return (AlphaComposite.getInstance(type, alpha));
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
