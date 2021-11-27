public class gameTwo {

    /* Betting on a Number. This game involves only one bet. You bet 1$ on a particular number,
    say 23; if the ball lands on that number you win 35$, otherwise you lose */
    public static int playGameTwo(int number){
        roulette roulette = new roulette();
        if(roulette.number == number){
            return 35;
        }
        return -1;
    }
}
