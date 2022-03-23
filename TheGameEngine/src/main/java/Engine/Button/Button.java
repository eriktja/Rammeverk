package Engine.Button;

/**
 * This is a button class.
 * @author simenerbest.
 * */
public class Button {
    private String location;
    private String buttonText;

    /**
     * @param location aoskodkasod
     *                 okasodkaosd
     *
     * @param buttonText apsokdoaks
     *                   oaksodkas
     *                   okasodkas
     *                   kjemnpebra
     * {@code Menu}
     *                   lollert
     * */
    public Button(String location, String buttonText) {
        this.location = location;
        this.buttonText = buttonText;
    }

    /**
     * @throws IncompatibleClassChangeError
     *
     * Using {@code @code} alone, indentation will be lost, but you don't have to
     * escape special characters:
     *
     * {@code An annotation <code>@Foo</code>; and a generic List<String>}.
     *
     * */
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
