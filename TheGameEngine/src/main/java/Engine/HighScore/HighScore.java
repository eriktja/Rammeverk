package Engine.HighScore;

public class HighScore {
    private double highscore = 0;

    public HighScore() {}

    public double getHighscore() {
        return highscore;
    }

    public void setHighscore(double highscore) {
        this.highscore += highscore;
    }
}
