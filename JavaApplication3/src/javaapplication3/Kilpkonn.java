package javaapplication3;

public class Kilpkonn {
    
    int x;
    int y;
    int suund=1;
    
    public Kilpkonn(int kx, int ky) {
        x = kx;
        y = ky;
    }
    int kysiX() {
        return x;
    }   

    int kysiY() {
        return y;
    }

    int kysiSuund() {
        return suund;
    }

    void keeraParemale() {
        suund++;
        if(suund>4){suund=1;}
    }

    void edasi() {
        if(suund==1){x++;}
        if(suund==2){y++;}
        if(suund==3){x--;}
        if(suund==4){y--;}
    }
    @Override
    public String toString(){
       if(suund==1){return ">";}
       if(suund==2){return "v";}
       if(suund==3){return "<";}
       if(suund==4){return "^";}
       return "?";
    }
    
    public static void main(String[] args) {
        // Et muuta klassi omadusi tuleks nende jaoks koostada klassi meetodid
        // Kilpkonna loomine, asukohaga x = 1; y = 1
        Kilpkonn konn = new Kilpkonn(1, 1);
        // Kilpkonna saab liigutada ühe ühiku võrra
        konn.edasi(); // Uus asukoht x = 2; y = 1
        System.out.println(konn.kysiX());
        System.out.println(konn.kysiY());
        // Kilpkonna suuna muutmine
        konn.keeraParemale();
        konn.keeraParemale();
        // Kilpkonna uus suund peaks olema 3 ehk vasakule
        System.out.println(konn.kysiSuund());
        konn.edasi();
        // Peaks algses kohas tagasi olema
        System.out.println("Asukoht x = " + konn.kysiX() + "; y = " + konn.kysiY());
        
        
        
             
    }
}
