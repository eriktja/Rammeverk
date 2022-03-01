package Engine.Window.Animations;

public class Animation {
    private String filepath;
    private String color;

    public Animation() {
    }

    public Animation(String source) {
        this.filepath = source;
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
