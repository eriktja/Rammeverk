package Engine.Button;

/**
 * Creates a Button to be displayed in the Menu
 */
public class Button {
    private String location;
    private String buttonText;


    private Button(String location, String buttonText) {
        this.location = location;
        this.buttonText = buttonText;
    }

    private Button() {}

    // Factory methods
    /**
     * Create a new Button.
     * @param location Where to position the button on the Menu
     * @param buttonText The text displayed on the button
     * @return Button
     */
    public static Button create(String location, String buttonText) {
        return new Button(location, buttonText);
    }

    /**
     * Create a new Button
     * @return Button
     */
    public static Button create() {
        return new Button();
    }

    public void Start() {
    }

    public void Exit() {
    }

    /**
     * Get the position of the Button on the Menu
     * @return position
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the location of the Button on the Menu
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the text displayed on the Button
     * @return buttonText
     */
    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }
}
