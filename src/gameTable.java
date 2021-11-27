import java.util.Random;

public class gameTable {

    public static void main(String args[]){

        //Game one expected winnings and proportion won
        double winnings = 0;
        double wins = 0;
        for(int i = 0; i < 10000; i++) {
            if (gameOne.playGameOne() == -1){
                winnings += -1;
            }else{
                winnings += 1;
                wins++;
            }
        }
        System.out.println("Expected winnings for game one: " + winnings/10000 + " euro");
        System.out.println("Proportions of wins: " + wins / 10000);

        //Game two expected winnings and proportion won
        wins = 0;
        winnings = 0;
        int number = 0;

        for(int i = 0; i < 10000; i++) {
            Random rand = new Random();
            number = rand.nextInt(36);
            if (gameTwo.playGameTwo(number) == -1){
                winnings += -1;
            }else{
                winnings += 35;
                wins++;
            }
        }
        System.out.println("Expected winnings for game two: " + winnings/10000 + " euro");
        System.out.println("Proportions of wins: " + wins / 10000);
    }
}
