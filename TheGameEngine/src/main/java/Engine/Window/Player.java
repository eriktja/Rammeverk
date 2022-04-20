package Engine.Window;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject{

    Random r = new Random();
    Handler handler;
    int height = 32;
    int width = 32;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.width - 48);
        y = Game.clamp(y, 0, Game.height - 70);

        collision();
    }

    private void collision(){
        for(GameObject object : handler.objects){
            if(object.getId() == ID.BasicEnemy){
                // Collision
                if(getBounds().intersects(object.getBounds())){
                    HUD.health -= 2;
                }
            }
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
