package Engine.Window.Animations;

public class RectangleAnimation extends Animation{


    private RectangleAnimation(String source, String color) {
        super(source, color);
    }

    public static RectangleAnimation create(String source, String color){
        return new RectangleAnimation(source, color);
    }


}
