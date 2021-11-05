package HA05;
import java.util.Random;

public class Randomm implements GefangenenStrategie{
    //Kooperieren = true || Verrat = false
    //klasse musste umbennant werden aufgrund der Random Klasse von Java
    @Override
    public void setOpponentsLastDecision(boolean decision) {

    }

    @Override
    public boolean getNextDecision() {
        Random ran = new Random();
        return ran.nextBoolean();
    }
}
