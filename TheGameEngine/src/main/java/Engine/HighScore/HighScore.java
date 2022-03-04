package Engine.HighScore;

public class HighScore {
    private static HighScore instance;
    private double highscore = 0;

    private HighScore() {}

    public static HighScore create(){
        if(instance == null)
            instance = new HighScore();
        return instance;
    }

    public double getHighscore() {
        return highscore;
    }

    public void setHighscore(double highscore) {
        this.highscore += highscore;
    }
}
