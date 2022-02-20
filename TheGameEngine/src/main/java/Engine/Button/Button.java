package Engine.Button;

public class Button {
    private String location;
    private String buttonText;

    public Button(String location, String buttonText) {
        this.location = location;
        this.buttonText = buttonText;
    }

    public String getLocation() {
        return location;
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
