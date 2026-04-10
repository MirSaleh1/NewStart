package task6;

public class Main {

    public static void main(String[] args) {

        ScoreSystem sc=new ScoreSystem();
        Player p1=new Player("Ali",0);
        Player p2=new Player("Aysel",15);
        Player p3=new Player("Kamran",45);

        Game g1=new Game("Flappy Bird","EASY",15);
        Game g2=new Game("Subway Runner","Meduim",35);
        Game g3=new Game("Pubg Mobile","hard",50);

        sc.addPlayer(p1);
        sc.addPlayer(p2);
        sc.addPlayer(p3);

        sc.playGame(p1,g1);
        sc.playGame(p2,g3);
        sc.playGame(p3,g2);

        System.out.println(p1.getTotalScore());
        System.out.println(p2.getTotalScore());
        System.out.println(p3.getTotalScore());

        sc.showLeaderboard();

    }
}
