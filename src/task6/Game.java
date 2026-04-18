package task6;

public class Game {
    private static int id=0;
    private String name;
    private int gameId;
    private String difficulty;
    private double baseScore;

    public Game(String name, String difficulty, double baseScore) {
        this.name = name;
        this.difficulty = difficulty.toLowerCase();
        this.baseScore = baseScore;
        this.gameId=++id;
    }

    public String getName() {
        return name;
    }

    public int getGameId() {
        return gameId;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public double getBaseScore() {
        return baseScore;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateScore(){
        if ("easy".equalsIgnoreCase(difficulty))return baseScore;
        if ("medium".equalsIgnoreCase(difficulty))return baseScore*2;
        if ("Hard".equalsIgnoreCase(difficulty))return baseScore*3;
        return 0;
    }
}
