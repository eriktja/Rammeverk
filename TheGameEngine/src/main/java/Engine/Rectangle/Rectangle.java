package Engine.Rectangle;

public class Rectangle {
    private int xPos;
    private int yPos;
    private int height;
    private int width;

    public Rectangle(int xPos, int yPos, int height, int width)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.width = width;
    }

    public Rectangle() {}

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
}
