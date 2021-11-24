
public class gameTable {

    public static void main(String args[]){
        double winnings = 0;
        double wins = 0;
        for(int i = 0; i < 10000; i++) {
            if (gameOne.playGameOne() == 0){
                winnings += -1;
            }else{
                winnings += 1;
                wins++;
            }
        }
        System.out.println("Expected winnings for game one: " + winnings/10000 + " euro");
        System.out.println("Proportions of wins: " + wins / 10000);
    }
}
