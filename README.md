# pgdp-exercises
Dieses Repository enthält ergänzende Übungen für das Modul PGdP. Die Materialien sollen zusätzliche Übungsmöglichkeiten bieten. Beachte bitte, dass diese Materialien privat erstellt wurden und nicht von der Universität offiziell anerkannt sind.

Falls ihr einen Fehler findet, könnt ihr das unter Issue melden.

# Setup in (in IntelliJ)
- Das Repository kann durch den Befehl `git clone https://github.com/SaiThanhma/pgdp-exercises` bzw. in IntelliJ unter 'Get from version control' mit dem gleichen Link heruntergeladen werden.
- Der `src` und `test` Ordner soll nun in der IDE als `Sources Root` bzw. `Test Sources Root` makiert werden. Diese Optionen findet ihr, indem ihr mit der rechten Maustaste auf den jeweiligen Ordner klickt und dann unter `Mark Directory as` auswählt.

# Aufgabenstellung
- Die Aufgaben behandeln folgende Themen: Rekursion, (einfach) Verkettet Listen, Vererbung, Polymorphie, Generics, Interface (`Iterator<T>`, `Comparable<T>`).
- Prinzipiell sind alle Aufgaben mit Rekusion lösbar. Deswegen solltest du zur Übung so gut wie möglich auf Schleifen verzichten. Du kannst so viele Hilfsfunktionen definieren wie du willst.
  
## LinkedList

### Iterator

- Vervollständige die Klasse `Iterator` für die Klasse LinkedList, indem du Funktionen `Iterator(ListElement<T> e)`, `boolean hasNext()`, `T next()` implementierst.

### reverse

- Die Methode `void reverse()` soll die Liste umkehren, sodass das erste Element dann das Letzte ist, das zweite dann das Vorletzte usw..

### contains:

- `boolean contains(T value)`soll zurückgeben, ob der Parameter `value` in der Liste vorhanden ist.
- Hinweis: Da wir mit Generics arbeiten sollst du hier die Methode `boolean equals()` verwenden. `==` würde nur überprüfen, ob die Speicheradressen übereinstimmen.

## SortedList

### Invariante

- Die Klasse SortedList ist eine Unterklasse von LinkedList und besitzt folgende Invariante: Alle Listenelemente sind aufsteigend sortiert.

### insert

- Die Methode`void insert(T value)`soll `value`in die Liste hinzufügen, sodass die Invariante beibehalten bleibt.
- Hinweis: Da T mit`T extends Comparable<T>` eingrenzt wird, kannst du zum Vergleichen `int compareTo(T o)` verwenden.

## TribonacciList

Für diese Aufgabe definieren wir die Tribonacci-Folge wie folgt:

$$
a_n :=
\begin{cases} 
    1, & \text{falls } n \in \\{0, 1, 2\\\} \\
    a_{n-1} + a_{n-2} + a_{n-3}, & \text{falls } n \geq 3 
\end{cases}
$$

Die Liste soll nun die Folge repräsentieren. Beispielsweise könnte die Liste so aussehen:

[1] → [1] → [1] → [3] → [5] → [9]

### insert

`void insert(Integer n)` soll von der Oberklasse überschrieben werden und die nächsten n Folgenglieder an die Liste anhängen. Würden wir für die Liste oben`insert(3)` aufrufen, bekämen [1] → [1] → [1] → [3] → [5] → [9] → [17] → [31] → [57] als neue Liste.

## StringList

Java speichert seine Strings im sogenannten **String Intern Pool** im Heap ab, sodass jeder String während der Laufzeit in diesem Pool auch nur einmal existiert. Manchmal will man dieses Verhalten nicht haben. Dazu gibt es Klassen wie StringBuilder und StringBuffer. 

Alternativ kann dies auch mit verketteten Listen realisiert werden, ähnlich wie im Tutorium gezeigt. Unsere Liste besitzt als `value` ein `char[]`.  Das Aneinanderreihen (Konkatenieren) aller`char[]`repräsentiert dann unseren String.

Beispiel:

[tsch] → [üssik] → [o] → [ws] → [ki]

Unser String wäre demnach “tschüssikowski”.

Du darfst die vorgegebene Methode `String toString()` in dieser Aufgabe benutzen (auch wenn es bisschen sinnlos dann ist unseren String als Liste zu implementieren).

Es ist auch möglich das ohne die toString Methode zu verwenden, jedoch schwerer.

### isPalindrom

- Diese Methode soll zurückgeben, ob die Liste welche unseren String repräsentiert, ein  Palindrom ist.
- Ein Wortpalindrom ist ein Wort, das rückwärts gelesen dasselbe Wort ergibt bzw. es ist in der Mitte des Wortes gespiegelt.

### reverse

- Die Methode soll die Liste so umkehren, sodass der repräsentierte String auch umgekehrt wird.. Deswegen überschreiben wir unsere Methode, da wir ihr nun eine andere Bedeutung geben.
    
    Beispiel: [tsch] → [üssik] → [o] → [ws] → [ki] $\implies$
     [ik]→[sw] →  [o] →  [kissü]  →[hcst]
    

### contains

- Wir überschreiben die Methode auch hier von der Oberklasse.. Diese soll nicht nun mehr überprüfen, ob der Parameter in eines der Listenelemente ist, sondern die Methode `boolean contains(char[] value)` soll ausgeben, ob `value` ein substring ist von unserer Liste.

## NumberList

Diese Liste soll nun eine Zahl verkehrt herum repräsentieren. Beispielsweise würde die Zahl 54321 als Liste so aussehen: [1] → [2] → [3] → [4] → [5]. (Least significant digit als erstes Element).

Dabei gilt folgendes für alle `value` der Listenelemente:  $0 ≤= value ≤= 9$. Außerdem soll die Liste keine führende Nullen besitzen.

### insert

- `insert(Integer value)` soll `value` an die Liste anhängen. Dabei soll mit least significant digit angefangen werden (Zuerst Einerstelle, dann Zehnerstelle, dann Hunderterstelle usw.)
    
    Beispiel: Wenn wir auf der Liste oben `insert(9876)` aufrufen, sieht unsere Liste dann so aus
    
    [1] → [2] → [3] → [4] → [5] → [6] → [7] → [8] → [9]
    
    Unsere List soll wie gesagt keine Zahl repräsentieren die führende Nullen hat. Außerdem sollen negative Zahlen nicht eingefügt werden.
    

### crossSum

- Die Methode`Integer crossSum()` soll die Quersumme berechnen, indem sie alle Listenelemente addiert und zurückgibt.

### add

- Die Methode`NumberList add(NumberList first, NumberList second)` nimmt als Eingabe zwei Listen und gibt eine neue Liste zurück, welche die Addition von first und second darstellen soll.
  Beispiel: [5] -> [7] -> [1] + [2] -> [9] $\implies$  [7] -> [6] -> [2]
- Tipp: Schaue dir noch einmal an, wie schriftliches Addieren funktioniert. Nach einem ähnlichen Prinzip kannst du die Methode implementieren.

# Testing
Die Tests wurden mit JUnit geschrieben und überprüfen nur das input/output Verhalten der jeweilligen Methoden. Außerdem decken die Tests nicht jeden Fall ab und es wurde nicht explizit auf edge cases überprüft.

1. Zur Test-Klassse navigieren
   - Im test Ordner sind viele Klassen vorhanden, die jeweils die entsprechende Klasse im src Ordner testen.
   - Finde die Testklasse, die du ausführen möchtest.

2. Add Junit to classpath (in IntelliJ)
   - Nun kann es sein, dass `import org.junit.Test` rot makiert ist.
   - Du kannst mit der Maus über das rot makierte Statement gehen und dir werden dann Optionen angezeigt. Klicke nun auf "Add 'JUnt4 to classpath' und dann auf 'OK'.

3. Ausführen
   - Nun kannst du die ganze Klasse oder spezifische Testmethoden ausführen.
   - (in IntelliJ) findest du den entsprechenden Run-Button auf der linken Seite.

## Useful Links:

Recusion:

- https://www.youtube.com/watch?v=ngCos392W4w&

Linkedlist:

- https://www.youtube.com/watch?v=WwfhLC16bis&

Vererbung:

- https://www.youtube.com/watch?v=cp0J3jeBM6Y

Generics:

- https://www.youtube.com/watch?v=K1iu1kXkVoA

Iterator:

- https://www.youtube.com/watch?v=G3uNYHtn83c

String Pool (nicht wichtig):

- https://live.rbg.tum.de/w/EIDI/4000 Time: 1:39
