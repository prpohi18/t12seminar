# t12seminar

*Objektorienteerituse head ning tülikad küljed:

Plussid: Kood on lihtsasti loetav ja arusaadav. Tiimiga töötamisel saavad erinevad inimesed erinevate klassidega tegeleda. Klasse on võimalik taaskasutada ja üldistades kasutada paljudes erinevates kohtades. Pikas perspektiivis on hea säilitada ja ümber ehitada, kuna koostatud väiksematest klassidest, mille ümber ehitamine ei lõhu tervet koodibaasi

Miinused: Liiga palju klasse muudab koodi ebaefektiivseks, ridade arv võib mõttetult suureks kasvada. Võib tekkida klasside duplikeerimine. Testimine muutub keerulisemaks hästi struktureeritud ja paljude klassidega koodis. Kulub väga palju aega efektiivse klasside ja meetodite süsteemi välja töötamiseks.

*Spring boot jaoks vajalikud failid:
pom.xml

src- main->	-java- (projekti nimi) - nimi.java
	->	-resources - public  - fail.html
target- 1)boot3-10-SNAPSHOT.jar, BOOT3-1.0-SNAPSHOT.jar.original
	2)*classes
	3)*maven-archiver
	4)*maven-status
	5)*generated-sources

Tegevused: 
mvn clean
mvn package
java -jar -Dserver.port=40383 target/boot3-1.0-SNAPSHOT.jar

