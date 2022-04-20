package Engine.Window;

import java.awt.*;
import java.io.Serial;

public class Game extends Canvas implements Runnable{
    @Serial
    private static final long serialVersionUID = -8754111336500953605L;

    public static final int width = 640, height = width/ 12 * 9;

    public Game() {
        new Window(width, height, "hello", this);
    }

    public synchronized void start(){

    }

    @Override
    public synchronized void run() {

    }

}
