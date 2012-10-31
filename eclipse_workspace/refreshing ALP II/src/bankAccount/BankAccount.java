/* Dieses Interface beschreibt die Methoden eines Bankkontos */
public interface Konto  {

	/*Die Methode "einzahlen" spiegelt Einzahlvorgang auf einem Bankkonto wider
	und gibt dabei einen boolschen Wert zurueck. True = Einzahlung erfolgreich; 
	False = Einzahlung nicht erfolgreich */
	public boolean einzahlen (double betrag);

	/*Die Methode "auszahlen" spiegelt den Auszahlvorgang von einem Bankkonto wieder
	und gibt dabei je nach dem ob dieser erfolgreich war oder nicht, den entsprechenden
	boolschen Wert zurueck */
	public boolean auszahlen (double betrag);

	/*Die Methode "Kontostand_abfragen", soll das aktuelle Guthaben des Kontos als double-Wert
	zurueckgeben*/
	public float kontostand_abfragen();

	/*Die Methode "Jahreszinsen" addiert auf das aktuelle Guthaben einen zum Konto zugehoerigen 
	Zinssatz*/
	public void Jahreszinsen();

	/*Die Methode "zinsesZins" berechnet unter Angabe einer Anzahl von Jahren die Zinsen, 
	die man erhaelt, wenn sich am Gutenhaben und am Zinssatz nichts aendert. Hier wird auch 
	der Zineszins mit beruecksichtigt */
	public float  zinsesZins(int Jahr);
}
