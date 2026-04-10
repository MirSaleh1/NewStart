package task6;

public class Player {
    private static int id = 0;
    private String name;
    private double totalScore;
    private int personId;

    public Player(String name, double totalScore) {
        this.personId = ++id;
        this.name = name;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public int getPersonId() {
        return personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public void addScore(int score) {
        if (score <= 0){
            System.out.println("invulde score");
            return;
        }
        this.totalScore+=score;
    }
    public void getInfo(){
        System.out.println("name:"+name+" "+"total socre:"+totalScore);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", totalScore=" + totalScore +
                ", personId=" + personId +
                '}';
    }
}
