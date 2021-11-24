import java.util.Random;

public class roulette {
    int number;
    String colour;
    boolean odd;

    public roulette(){
        Random rand = new Random();
        this.number = rand.nextInt(36);
        if(this.number == 0){
            this.colour = "green";
            this.odd = false;
        }else if(this.number % 2 == 0){
            this.colour = "black";
            this.odd = false;
        }else{
            this.colour = "red";
            this.odd = true;
        }

    }

    public void spin(){
        Random rand = new Random();
        this.number = rand.nextInt(36);
        if(this.number == 0){
            this.colour = "green";
            this.odd = false;
        }else if(this.number % 2 == 0){
            this.colour = "black";
            this.odd = false;
        }else{
            this.colour = "red";
            this.odd = true;
        }
    }


}
