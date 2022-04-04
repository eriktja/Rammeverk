package Engine.Window.Animations;

public class Sprite {
    String filePath;

    private Sprite(String filePath) {
        this.filePath = filePath;
    }

    private Sprite(){
    }

    public static Sprite create(){
        return new Sprite();
    }

    public static Sprite create(String filePath){
        return new Sprite(filePath);
    }
}
