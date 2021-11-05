package HA05;

public class Pavlov implements GefangenenStrategie{

    //Kooperieren = true || Verrat = false
    private boolean lastDecisionOpponent;
    private boolean lastDecisionMe;
    private boolean firstDecision = true;

    @Override
    public void setOpponentsLastDecision(boolean decision) {
        this.lastDecisionOpponent = decision;
    }

    @Override
    public boolean getNextDecision() {
        if (this.firstDecision){
            this.lastDecisionMe = true;
            return true;
        }else {
            if (this.lastDecisionOpponent != lastDecisionMe){
                this.lastDecisionMe = false;
                return false;
            }else {
                this.lastDecisionMe = true;
                return true;
            }
        }

    }
}
