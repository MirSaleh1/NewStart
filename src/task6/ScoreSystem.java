package task6;

public class ScoreSystem {
    private static Player[] players = new Player[100];
    private static int count = 0;

    public void addPlayer(Player player) {
        if (count >= players.length) {
            System.out.println("we cant add player list is full");
        }
        for (int i = 0; i < count; i++) {
            if (players[i].getPersonId() == player.getPersonId()) {
                System.out.println("player allready exsits");
                return;
            }
        }
        players[count++] = player;
    }

    public void playGame(Player player, Game game) {
        double addScore = game.calculateScore();
        double temp = player.getTotalScore();
        player.setTotalScore(addScore + temp);
    }

    public void showLeaderboard() {
        bubbleSort();
        int k=1;
      for (int i=count-1;i>=0;i--){
          System.out.println((k++)+"-"+players[i]);
      }
    }
    public void bubbleSort(){
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (players[j].getTotalScore() > players[j + 1].getTotalScore()) {
                    Player player = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = player;
                }
            }
        }
    }
    public void findById(int id){
        if (id<=0){
            System.out.println("invalid id");
            return;
        }
        for (Player p:players){
            if (p.getPersonId()==id){
                p.getInfo();
                return;
            }
        }
    }
}
