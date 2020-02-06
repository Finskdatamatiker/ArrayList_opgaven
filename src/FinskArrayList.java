import java.util.Arrays;

public class FinskArrayList {

    /**
     * klassen får et array som et felt med 0 elementer som default.
     * Det opfører sig som en arrayliste, når man bruger metoderne
     */
    private int[] liste = new int[0];

    public FinskArrayList(){}

    public int[] getListe() { return liste; }
    public void setListe(int[] liste) { this.liste = liste; }

    /**
     * Metoden tilføjer et element til array.
     * Jeg laver et nyt array med et ekstra tomt element, kopierer over det gamle
     * array og tilføje det nye element i det sidste index.
     * Jeg ændrer værdien af feltet "list" til at være dette nye array
     * @param value det nye element, som tilføjes
     */
    public void add(int value){
        int[] liste2 = new int[liste.length +1];
        for (int i = 0; i < liste.length; i++) {
            liste2[i] = liste[i];
        }
        liste2[liste2.length - 1] = value;
        liste = liste2;
    }

    /**
     * Metoden fjerner et element ved at kopiere elementerne fra det gamle array
     * og når vi kommer til det element, som skal fjernes, laver vi ikke noget.
     * "nyIndex" følger "i", bortset fra den runde, hvor der ikke sker noget.
     * Dermed er "nyIndex" 1 mindre end "i" resten af array.
     * Hvis index ikke matcher med array, kastes der exception.
     * Jeg ændrer værdien af feltet "list" til at være dette nye array
     * @param index index på det element, som skal fjernes
     */
    public void remove(int index) {

        int[] liste2 = new int[liste.length -1];

        if (index > liste.length - 1 || index < 0){
            throw new IndexOutOfBoundsException();
        }

        else {
                int nyIndex = 0;
                for (int i = 0; i < liste.length; i++) {
                    if (index != i) {
                        liste2[nyIndex] = liste[i];
                        nyIndex++;
                    }
                }
                liste = liste2;
            }
    }

    /**
     * Metoden laver et nyt array, som får kopieret elementer fra det gamle array.
     * Det nye array har index "nyIndex".
     * Når vi kommer til det index, hvor vi skal indsættes et nyt element,
     * sætter vi elementet i det nye array og elementet fra det gamle array til
     * det næste index i det nye array.
     * Andre elementer kopiererer vi bare over.
     * Jeg ændrer værdien af feltet "list" til at være dette nye array.
     * @param index index, hvori det nye element skal sættes i
     * @param value det nye element
     */
    public void addTilIndex(int index, int value) {

        if (index >= liste.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        int[] liste2 = new int[liste.length + 1];
        int nyIndex = 0;
        for (int i = 0; i < liste.length; i++) {
            if(i == index) {
                liste2[nyIndex] = value;
                liste2[nyIndex + 1] = liste[i];
                nyIndex++;
            }
            else liste2[nyIndex] = liste[i];
            nyIndex++;
        }
        liste = liste2;
    }

    public int size(){
        return liste.length;
    }

    public void clear(){
        liste = new int[0];
    }

    @Override
    public String toString() {
        return "listens laengde " + liste.length +
                ", værdier " + Arrays.toString(liste);
    }
}
