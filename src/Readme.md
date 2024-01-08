#Űrhajó töltőállomás - Hamar Patrik

Ebben a feladatban a Hold körül keringő Űrhajók számára épített töltőállomás működését mutatom be. Az űrállomásra a kapitányok több típusú hajtóművet is tölthetnek és külöböző típusú üzemanyagokból válszthatnak. A hajók üres tankkal érkeznek és tele tankkal távoznak, és hajótípustől függően az állapotuk minden tankolásnál 5%-ot romlik, ha eléri a 0%-ot az állomások a hajtóművet ki kell cserélni.




##Töltőállomás program I.
---
A töltőállomás űrhajókat vesz be. Ha megtankolják őket tele leszenek és állapotuk 5%-ot romlik. Az űrhajókat a kapitányuk alapján azonosítják. Az űrhajókat is is lehet venni (kapitány név alapján) a töltőállomásról.

###Technikai specifikáció:
---
Tömben tájoljuk az űrhajókat. Alapértelmezetten 5 dokkoló állomás áll rendelkezésre. Nem kell optimalizálni, hogy a megtanklt űrhajó helyére vegyünk be új űrhajót, folyamatossan rakjuk a tömbe az űrhajókat. A kiadásnál annyit kell megcsinálni, hogy az űrhajók ki kell venni a tömbből. Jelezzük, ha az összes dokkoló állomás megtelt. A töltőállomás és az űrhajó is egy külön-külön osztály a modelben az űrhajó az alany, amit a kapitány nevével azonosítanak, és a toltőállomás tankol metódusban tankoljuk meg őket.


##Töltőállomás program II.
---
Az állomáson most már csak Hidrogént lehet tankolni és az állomás adott fajtájú űrhajókra akar specializálódni. A tankolás során a hajók ugyan úgy tele lesznek, de különböző típusú hajók máshogy kopnak.

Starship: -1,5%
Shepard: -5%
Moon: -7,5%