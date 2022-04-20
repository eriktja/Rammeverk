package Engine.Window;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.Serial;
import java.util.Random;

public class Game extends Canvas implements Runnable{
    @Serial
    private static final long serialVersionUID = -8754111336500953605L;

    public static final int width = 1280, height = width/ 12 * 9;

    private Thread thread;
    private boolean running = false;
    private Handler handler;
    private HUD hud;
    private Random r;

    public Game() {
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));

        new Window(width, height, "hello", this);
        hud = new HUD();
        r = new Random();

        handler.addObject(new Player(r.nextInt(width), r.nextInt(height), ID.Player, handler));
        for(int i = 0; i < 400; i++){
            handler.addObject(new BasicEnemy(r.nextInt(width), r.nextInt(height), ID.BasicEnemy));
        }
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
        this.requestFocus();
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
                //System.out.println("FPS " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick(){
        handler.tick();
        hud.tick();
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
        hud.render(g);

        g.dispose();
        bs.show();
    }

    public static int clamp(int var, int min, int max){
        if(var >= max)
            return max;
        else if(var <= min)
            return min;
        return var;
    }
}
