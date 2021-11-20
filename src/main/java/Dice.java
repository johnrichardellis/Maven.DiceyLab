import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    // method to take in n number of dies
    // use random number to simulate each dice
    public int throwValue (int numberOfDie) {
        int value = ThreadLocalRandom.current().nextInt(1, 7);
        return value;
    };

    public int tossAndSum () {

    }




}
