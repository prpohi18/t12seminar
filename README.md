# HTML-lehe sidumine REST-teenusega XMLHttpRequesti abil

REST teenuse kasutamine eeldab serveripoolset teenust, mis on võimeline HTTP käskluseid vastu võtma, vastuseandmeid enkodeerima(JSONiks, XMLiks, HTMLiks jne) ning vastust tagastama, ja kliendipoolset implementatsiooni lehe koodis, mis peaks olema võimeline käsklust saatma ning vastu võtma, et sellega hiljem midagi teha, enamasti kasutades JavaScripti, jQueryt, Fetchi jne. 

REST teenusega suhtlemiseks kliendi poolel kasutatakse valdavalt XMLHttpRequest rakendusliidest, mille abil toimub suhtlus brauseri ja serveri vahel. XMLHttpRequest objekti kasutades on võimalik saata päringuid serverile ning tagastada päringute vastusied.

Näide JS implementatsioonist:

<script>
    let xhr = new XMLHttpRequest()
    xhr.onreadystatechange = displayOutput

    xhr.open("GET", "url?"+info, false)
    xhr.send(true)

    function displayOutput(){
        if(xhr.readyState == 4){
            //tee midagi vastusega
        }
    }
</script>

let xhr = new XMLHttpRequest();
Loob uue XMLHttpRequest objekti

xhr.open(meetod, url, async, kasutajanimi, parool)
Spetsifitseerib käskluse sisu
meetod - soovitud HTTP käsklus(GET, POST jne)
url - REST teenuse URL+käsk+sisu
async - käsu täitmise asünkroonsust näitav boolean(true - request tehakse asünkroonselt(script ei jää vastust ootama), false - ei tehta(leht ootab vastuse enne jätkamist))
kasutajanimi - pole kohustuslik, vajadusel
parool - pole kohustuslik, vajadusel

xhr.send()
Käivitab käskluse

xhr.onreadystatechange = funktsioon
Täpsustab funktsiooni, mida käskluse valmidusstaatuse muutumisel käivitada

xhr.response, xhr.responseText ja xhr.responseXML
Tagastab käskluse vastuse sisu vastavalt XMLHttpRequest.responseType väärtusele, stringina ja XML-ina

xhr.status ja xhr.statusText
Tagastab käskluse staatuse vastavalt numbrina ja tekstina