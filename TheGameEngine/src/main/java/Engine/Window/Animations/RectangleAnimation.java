package Engine.Window.Animations;

public class RectangleAnimation extends Animation{

    public RectangleAnimation(String filepath) {
        super(filepath);
    }
    private RectangleAnimation(String source, String color) {
        super(source, color);
    }

    public static RectangleAnimation create(String source, String color){
        return new RectangleAnimation(source, color);
    }

    public static RectangleAnimation create(String source){
        return new RectangleAnimation(source);
    }

}
