Tund 12 - Seminar

Teema: Veebirakenduse REST-teenuse töö testimise näide

REST (Representational State Transfer) on tarkvaraarhitektuuri stiil, mida kasutatakse hüpermeedia hajussüsteemide valdkonnas, näiteks veebis. 
Ta paneb serveri suhtlema arvutitega üle võrgu REST baasil ja kasutatakse paljudes suurtes ettevõtetes.

Näide REST kasutamisest kasutajanimede andmebaasi süsteemi baasil. 

Kõigepealt luuakse kasutaja kolme omadusega ja sisestatakse serverisse: 

	POST /user
	fname=Markus&lname=Heinsalu&age=20

Peale käsu sisestamist server reageerib ja vastab kuhu ta andmed saatis:

	200 OK
	Location: /user/123
	
Edaspidiseks ligipääsemiseks saab kasutada GET käsku ja eelnevalt genereeritud asukohta:

	GET /user/123
	
Server vastab ja edastab sisestatud andmed:

	200 OK
	<fname>Markus</fname><lname>Heinsalu</lname><age>20</age>
	
Muutmiseks kasutatakse funktsiooni PATCH, millega võib muuta ükskõik millist väärtust andmebaasis. 

	PATCH /user/123
	fname=Margus
	
Et lõpuks uuendust serverisse edasi saata, siis muutub väärtus ja samal ajal teised väärtused andmebaasis samal väljal ei muutu(vanus, asukoht). 

	PUT /user/123
	fname=Margus
	
JAVA's REST funktsiooni lisamine XML faili, mis lubab kasutada JAVA failides omavahelist andmete saatmist:

	<servlet-mapping>
		<servlet-name>Jersey REST Service</servlet-name>
		<url-pattern>/rest/*</url-pattern>
	</servlet-mapping>
	
REST importimiseks JAVA failis kasutame: "package com.sap.formsprocessing.rest;"
REST kliendi loomine JAVAs:

	public static void main(String[] args) {
			RestClient restClient = new RestClient();
			String response = restClient.callService();
			System.out.println(response);
	}