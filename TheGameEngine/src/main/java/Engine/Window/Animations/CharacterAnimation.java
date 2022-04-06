package Engine.Window.Animations;

public class CharacterAnimation extends Animation{
    private int height;
    private int width;


    private CharacterAnimation() {
    }

    public CharacterAnimation(String filepath) {
        super(filepath);
    }

    private CharacterAnimation(String source, String color, int height, int width) {
        super(source, color);
        this.height = height;
        this.width = width;
    }

    // Factory methods
    public static CharacterAnimation create(String source, String color, int height, int width) {
        return new CharacterAnimation(source, color, height, width);
    }
    public static CharacterAnimation create(String source){
        return new CharacterAnimation(source);
    }

    public static CharacterAnimation create() {
        return new CharacterAnimation();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
