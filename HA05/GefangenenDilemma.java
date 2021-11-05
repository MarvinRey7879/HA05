package HA05;

public class GefangenenDilemma {
    //Kooperieren = true || Verrat = false
    GefangenenStrategie spieler1;
    GefangenenStrategie spieler2;

    int strafpunkteSpieler1 = 0;
    int strafpunkteSpieler2 = 0;

    public GefangenenDilemma(GefangenenStrategie strategie1, GefangenenStrategie strategie2){
        this.spieler1 = strategie1;
        this.spieler2 = strategie2;
    }
    public void spiele(int n){
        for (int i = 0; i<=n;i++){
            // geht auch ohne die Variabeln aber zur veranschaulichung benutze ich die
            boolean spieler1Kooperiert = spieler1.getNextDecision();
            boolean spieler2Kooperiert = spieler2.getNextDecision();

            if (spieler2Kooperiert && spieler1Kooperiert){
                strafpunkteSpieler1 += 2;
                strafpunkteSpieler2 += 2;
            }

            else if (!spieler1Kooperiert && !spieler2Kooperiert){
                strafpunkteSpieler1 += 4;
                strafpunkteSpieler2 += 4;
            }

            else if (!spieler2Kooperiert && spieler1Kooperiert){
                strafpunkteSpieler2++;
                strafpunkteSpieler1 += 6;
            }
            else{
                strafpunkteSpieler1++;
                strafpunkteSpieler2 += 6;
            }
            spieler1.setOpponentsLastDecision(spieler2Kooperiert);
            spieler2.setOpponentsLastDecision(spieler1Kooperiert);
        }
        System.out.println("Spieler1 hat: " + strafpunkteSpieler1 + " Strafpunkte \n" +"Spieler2 hat: " + strafpunkteSpieler2 + " Strafpunkte \n"  );
    }

}
