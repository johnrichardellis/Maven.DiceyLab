import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private int numOfDice;

   public Dice(int numOfDice) {
       // sets value to parameter given
       this.numOfDice = numOfDice;
   }

   public int tossAndSum() {
       // create counter for sum
       int sumOfDice = 0;
       // loop through however many dice, each time adding total to current sum to get total sum
       for (int i = 0; i < numOfDice; i++) {
            sumOfDice = sumOfDice + rollDice();
       }
       return sumOfDice;
   }

   public int rollDice() {

       // use math.random to generate random 0 through 5, then adding 1 to get 1-6 instead
       return (int) ((Math.random() * 6) + 1);
   }



   public int getNumOfDice() {
       return numOfDice;
   }


   public void setNumOfDice(int numOfDice) {
       this.numOfDice = numOfDice;
   }


}
