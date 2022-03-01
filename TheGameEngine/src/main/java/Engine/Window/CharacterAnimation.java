package Engine.Window;

public class CharacterAnimation {
    private String source;
    private String color;
    private int height;
    private int width;

    public CharacterAnimation() {
    }

    public CharacterAnimation(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
