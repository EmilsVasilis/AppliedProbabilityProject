
public class gameTable {

    public static void main(String args[]){
        int wins = 0;
        for(int i = 0; i < 10000; i++) {
            if (gameOne.playGameOne() == 0){
                wins += -1;
            }else{
                wins += 1;
            }
        }
        System.out.println(wins);
    }
}
