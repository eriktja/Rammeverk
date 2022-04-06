package Engine.Window.Animations;

public class Animation {
    private String filepath;
    private String color;

    protected Animation() {
    }

    public Animation(String filepath) {
        this.filepath = filepath;
    }

    protected Animation(String source, String color) {
        this.filepath = source;
        this.color = color;
    }

    // Factory methods
    public static Animation create(String source, String color) {
        return new Animation(source, color);
    }
    public static Animation create(String source){
        return new Animation(source);
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
