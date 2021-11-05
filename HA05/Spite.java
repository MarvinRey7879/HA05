package HA05;

public class Spite implements GefangenenStrategie{
    //Kooperieren = true || Verrat = false
    private boolean lastDecisionOpponent;
    private boolean wurdeVerraten = false;
    
    @Override
    public void setOpponentsLastDecision(boolean decision) {
        this.lastDecisionOpponent = decision;
    }
    
    @Override
    public boolean getNextDecision() {
        if (this.wurdeVerraten){
            return false;
        }else {
            if (!this.lastDecisionOpponent){
                this.wurdeVerraten = true;
                return false;
            }else {
                return true;
            }

        }
       
    }
}
