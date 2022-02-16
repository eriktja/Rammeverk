package Engine;

public class TheGameEngine {
    private Window window;

    public TheGameEngine() {
        Window window = new Window();
    }

    public void createWindow(){
        window.createWindow();
    }

    public void createWindow(int height, int width){
        window.createWindow(height, width);
    }

    public void setFullscreen(){
        window.setFullscreen();
    }

    public void setWindowSize(int height, int width){
        window.setSize(height, width);
    }

    public void setWindowBackground(String background){
        window.setBackground(background);
    }
}
