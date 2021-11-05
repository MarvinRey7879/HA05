package HA05;

public class TitForTat implements GefangenenStrategie{

    //Kooperieren = true || Verrat = false
    private boolean firstRound = true;
    private boolean lastDecisionOpponent;

    @Override
    public void setOpponentsLastDecision(boolean decision) {
        this.lastDecisionOpponent = decision;
    }

    @Override
    public boolean getNextDecision() {
        if (this.firstRound){
            this.firstRound = false;
            return true;
        }else {
            return this.lastDecisionOpponent;
        }
    }
}
