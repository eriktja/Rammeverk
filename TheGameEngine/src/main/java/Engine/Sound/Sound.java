package Engine.Sound;

public class Sound {
    private String path;

    private Sound(String path) {
        this.path = path;
    }

    // Factory methods
    public static Sound create(String path) {
        return new Sound(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void play(){}
}
