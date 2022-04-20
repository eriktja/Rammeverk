package Engine.Window;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (GameObject object : handler.objects){
            if(object.getId() == ID.Player)
            {
                // Player key events
                if(key == KeyEvent.VK_W) object.setVelY(-10);
                if(key == KeyEvent.VK_S) object.setVelY(10);
                if(key == KeyEvent.VK_A) object.setVelX(-10);
                if(key == KeyEvent.VK_D) object.setVelX(10);

            }
            if(object.getId() == ID.Enemy)
            {
                // Enemy key events
                if(key == KeyEvent.VK_I) object.setVelY(-10);
                if(key == KeyEvent.VK_K) object.setVelY(10);
                if(key == KeyEvent.VK_J) object.setVelX(-10);
                if(key == KeyEvent.VK_L) object.setVelX(10);

            }

        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        for (GameObject object : handler.objects) {
            if (object.getId() == ID.Player) {
                // Player key events
                if (key == KeyEvent.VK_W) object.setVelY(0);
                if (key == KeyEvent.VK_S) object.setVelY(0);
                if (key == KeyEvent.VK_A) object.setVelX(0);
                if (key == KeyEvent.VK_D) object.setVelX(0);


            }
            if (object.getId() == ID.Enemy) {
                // Enemy key events
                if (key == KeyEvent.VK_I) object.setVelY(0);
                if (key == KeyEvent.VK_K) object.setVelY(0);
                if (key == KeyEvent.VK_J) object.setVelX(0);
                if (key == KeyEvent.VK_L) object.setVelX(0);

            }
        }
    }
}
