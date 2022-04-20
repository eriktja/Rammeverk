package Engine.Window;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.Serial;

public class Game extends Canvas implements Runnable{
    @Serial
    private static final long serialVersionUID = -8754111336500953605L;

    public static final int width = 640, height = width/ 12 * 9;

    private Thread thread;
    private boolean running = false;
    private Handler handler;

    public Game() {
        new Window(width, height, "hello", this);

        handler = new Handler();
        handler.addObject(new Player(100,100,ID.Player));
        handler.addObject(new Player(200,100,ID.Player));

    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop(){
        try {
            thread.join();
            running = false;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1){
                tick();
                delta--;
            }
            if(running){
                render();
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer = System.currentTimeMillis();
                System.out.println("FPS " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick(){
        handler.tick();
    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.YELLOW);
        g.fillRect(0,0,width, height);

        handler.render(g);

        g.dispose();
        bs.show();
    }

}
