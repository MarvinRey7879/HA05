package HA05;

public class PerKind implements GefangenenStrategie{

    //Kooperieren = true || Verrat = false
    private int counter = 0;
    @Override
    public void setOpponentsLastDecision(boolean decision) {

    }

    @Override
    public boolean getNextDecision() {
        counter++;
        if (this.counter % 3 == 0){
            return false;
        }else {
            return true;
        }
    }
}
