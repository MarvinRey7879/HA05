package HA05;

public class DasSpiel {
    public static void main(String[] args) {
        GefangenenDilemma gd =  new GefangenenDilemma(new TitForTat(), new PerKind());
        gd.spiele(100);
    }
}
