# M03-Projecte-El-Caixer-autom-tic-Lucas-
Desenvolupar una aplicació que simuli un caixer automàtic d’un banc.

## REQUERIMENTS FUNCIONALS

### Implementar una aplicació que permeti:

● Els clients del banc en el caixer podran fer login: 
1. En iniciar l'aplicació demanarà l'identificador d'usuari i la contrasenya, si és correcte contínua l'aplicació i mostrarà el menú d'opcions; en cas contrari donarà un missatge d'error i no es pot operar. 
2. Si l'usuari no encerta el password un número determinat d'intents l'usuari es bloqueja.

● Els clients dels banc disposaran d’un o diversos comptes. 
1. Els comptes podran ser de dos tipus: comptes corrents o comptes d’estalvis. 
2. Els comptes d’estalvis tenen un tipus d’interès més elevat. Els comptes corrents podran tenir targetes associades.

● El caixer permetrà com a mínim fer les següents operacions:
○ Consultar el saldo del client (per compte i el total dels seus comptes)
○ retirar diners d’un compte del client,
○ ingressar diners a un compte
○ fer transferència de diners, només entre comptes corrents
○ canviar la clau d’accés al caixer,
○ fer logout,
○ ...

● Els diferents moviments que ha fet el client en un dels seus comptes podran ser
consultats. 
1. De cada moviment n’haurem de saber: 
# el tipus (ingrés, transferència, ...),
# la data,
# quantitat diners implicats, ....

● El caixer opera únicament amb bitllets, i en disposa d’una certa quantitat de cada un d’ells. 
1. Les operacions d’extracció i d'ingrés afecten a la quantitat de diners emmagatzemada en el caixer. 
2. Quan es fan operacions d’extracció s’ha de comprovar que l’operació sigui possible segons els bitllets disponibles. 
3. S’ha d’informar al client de les quantitats de bitllets lliurades en l’operació. 
4. Quan es fa un ingrès podem utilitzar un teclat amb botons amb les diferents quantitats per indicar la quantitat dipositada.

● S’haurà d’implementar com a mínim altres 3 funcionalitat al caixer, diferent a les que s’han descrit anteriorment, que considereu que poden ser d’utilitat.

● L’operativa del caixer s’haurà d’implementar a través d’una interfície gràfica.

## REQUERIMENTS TÈCNICS

● Llenguatge de programació JAVA

● Interfície gràfica en Java FX

● Estructura del programa en arquitectura MVC (Model-Vista-Controlador)

● Model estructurat en classes (S’ahurà de dibuixar un Diagrama UML de classes del
Model)

● Gestió d’errors i excepcions

● Codi documentat amb notació Javadoc

● Ús de col·leccions d’objectes ( ArrayList o equivalent) per a la gestió de les llistes
d’objectes en memòria

● Dades d’operativa del programa desats en fitxers de text. Podreu escollir quines
dades voleu emmagatzemar en fitxers (mínim 2 col·leccions/ fitxers) per a
carregar-les en memòria per inicialitzar el model que heu construit

## GESTIÓ DEL PROJECTE

Plataforma Github per compartir codi i documentar el projecte. Es farà seguiment
dels commits del projecte.

## DATA LLIURAMENT

● 05 maig del 2023

● Exposicions del projecte – 08, 09, ... de maig del 2023

## MÈTODE LLIURAMENT I FORMAT

● Link Github codi font en una tasca Moodle

● Documentació del projecte inclosa dins fitxer .README: índex continguts, diagrama
de classes, descripció de les funcionalitats implementades

● Presentació del projecte

## AVALUACIÓ

● Assistència a un 80% sessions de classe (dilluns i dimecres) . No s’avaluarà el
projecte si es supera aquest %.

● Pujada a Github versió modificada del projecte final sessió de classe del dimecres.
No s’avaluarà el projecte si no s’assoleix un mínim de 80% de commits en les dates
previstes.

● Tots els projectes no originals o còpies seran qualificats amb un 0.

● Es farà ús d’una rúbrica d’avaluació que podreu consultar al moodle.
