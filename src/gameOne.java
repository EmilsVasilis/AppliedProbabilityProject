

/* Betting on Red. This games involves just one bet. You bet 1$ on red. If the ball lands on
red you win 1$ (that is you get back 2$: the one you bet and the one you win), otherwise
you lose */
public class gameOne {

    public static int playGameOne(){
        roulette roulette = new roulette();
        if(roulette.colour.equals("red")){
            return 2;
        }
        return 0;
    }

}
