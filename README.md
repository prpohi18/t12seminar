
Andmeid sisaldava klassi eksemplari kasutamine iskukoodi näitel

Kui defineerime klassi, siis defineerime seal muutujad ja meetodid. 

Muutujad  - int, String jne

Konstruktor on kood, mis käivitatakse vaikimisi hetkel kui uus objekt luuakse. Näeb välja nagu meetod kuid puudub tagastustüüp ja kannab sama nime mis klass. 

Objekti loomine toimub märksõnaga new.

Juurdepääsuõigused:

Private - saab ligi ainult sama klassi seest, kuid mujalt mitte
Protected - saab ligi nii klassi, package kui alamklassi sees, kuid väljast (veebist) ei saa
Public - igalt poolt saab ligi, ka väljast


Andmete saamine:
Teen muutuja > teen konstruktori > teen objekti. Näiteks teen objekti, kust saadetakse andmed konstruktorisse ja konkstruktor võtab sealt andmed ja paneb need muutujatesse.






    //MUUTUJAD
    protected int isikukood;
 
    //KONSTRUKTOR
    public IK(int isikukood){
        this.isikukood = isikukood;
    }
    
    //OBJEKT
    IK ik1 = new IK(39201030292);

