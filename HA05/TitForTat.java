package HA05;

public class TitForTat implements GefangenenStrategie{

    //Kooperieren = true || Verrat = false
    private boolean lastDecisionOpponent =  true;

    @Override
    public void setOpponentsLastDecision(boolean decision) {
        this.lastDecisionOpponent = decision;
    }

    @Override
    public boolean getNextDecision() {
        return this.lastDecisionOpponent;
    }
}
