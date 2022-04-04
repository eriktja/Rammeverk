package Engine.Window.Animations;

public class CharacterAnimation extends Animation{
    private int height;
    private int width;


    public CharacterAnimation() {
    }

    public CharacterAnimation(String source) {
        super(source);
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
