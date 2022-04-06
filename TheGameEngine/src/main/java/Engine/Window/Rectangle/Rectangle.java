package Engine.Window.Rectangle;

import Engine.Window.Animations.RectangleAnimation;

public class Rectangle {
    private int xPos;
    private int yPos;
    private int height;
    private int width;
    private RectangleAnimation rectangleAnimation;
    private boolean collision;

    protected Rectangle(int xPos, int yPos, int height, int width, boolean collision)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.width = width;
        this.collision = collision;
    }

    public Rectangle(int xPos, int yPos, int height, int width) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.width = width;
        this.collision = true;
    }

    protected Rectangle() {}

    // Factory methods
    public static Rectangle create(){
        return new Rectangle();
    }

    public static Rectangle create(int xPos, int yPos, int height, int width, boolean collision){
        return new Rectangle(xPos, yPos, height, width, collision);
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public RectangleAnimation getRectangleAnimation() {
        return rectangleAnimation;
    }

    public void setRectangleAnimation(RectangleAnimation rectangleAnimation) {
        this.rectangleAnimation = rectangleAnimation;
    }
}
