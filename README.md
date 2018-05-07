# t12seminar
ANDMEID SISALDAVA KLASSI EKSEMPLARI KASUTAMINE ISIKUKOODI NÄITEL
Kuna isikukood esitatakse kindlal kujul ning me teame, mida millised numbrid tähendavad ja mis järjekorras numbrid koodis esinevad. Saame
isikukoodist hõlpsasti kätte sünniaja.
-fail isikukood.java, kus toimub isikukoodi läbi käimine, et saada teada, mis andmetega inimese isikukoodiga tegemist on.
-public class isikukood
-public int kuunr()
isikukoodist saame kätte mitmendal kuul inimene sündinud on. Teeme ka kuunimedest massiivi, kuhu
paigutame kuunimed stringidena. Kui isikukoodis on kuunumbriks 5, saame massiivist väärtuseks anda mai.(massiivis esimene kuu "") 

public int kuunr(){
		return Integer.parseInt(andmed.substring(3, 5));
	}

-public int päevanr, sarnaselt kuunumbri leidmisele leiame päevanumbri.

public int päevanr(){//käsk päevanumbri leidmiseks
		return Integer.parseInt(andmed.substring(5, 7));

-public int aastaarv()
-isikukoodi esimene nr viitab soole ja sünni nn sajandile.

if (andmed.substring(0, 1).equals("1")||andmed.substring(0, 1).equals("2")){
			return 1800+Integer.parseInt(andmed.substring(1,3));
		}

-String toString
Moodustame andmetest lause. return päevanr()+". "+kuunimi()+". "+aastaarv();

Eraldi main, kus saame isikukoodi klassis olevaid käske välja kutsuda. 
