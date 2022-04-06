package Engine.Button;

public class Button {
    private String location;
    private String buttonText;

    private Button(String location, String buttonText) {
        this.location = location;
        this.buttonText = buttonText;
    }

    private Button() {}

    // Factory methods
    public static Button create(String location, String buttonText) {
        return new Button(location, buttonText);
    }
    public static Button create() {
        return new Button();
    }

    public String getLocation() {
        return location;
    }

    public void Start() {
    }

    public void Exit() {
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }
}
