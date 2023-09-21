import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	
    	ArrayList<String> film = new ArrayList<String>();
    	ArrayList<String> serie = new ArrayList<String>();
    	ArrayList<String> anime = new ArrayList<String>();
    	ArrayList<String> giochi = new ArrayList<String>();
    	ArrayList<String> libri = new ArrayList<String>();
    	ArrayList<String> progettiCodici = new ArrayList<String>();
    	
    	try {
            // Creazione di un oggetto BufferedReader per leggere il file CSV
            BufferedReader reader = new BufferedReader(new FileReader("/Users/dypa/eclipse-workspace/JJdeciderApp/src/activities.csv"));

            String line;
            ArrayList<ArrayList<String>> activityLists = new ArrayList<>();

            // Leggi ogni riga dal file CSV
            while ((line = reader.readLine()) != null) {
                // Dividi la riga in elementi separati dal punto e virgola
                String[] elements = line.split(";");

                // Crea una nuova lista per l'attuale riga
                ArrayList<String> activityList = new ArrayList<>();

                // Aggiungi gli elementi alla lista dell'attuale riga
                for (String element : elements) {
                    activityList.add(element);
                }

                // Aggiungi la lista all'elenco complessivo
                activityLists.add(activityList);
            }

            // Aggiungi gli elementi letti dalle righe del CSV alle liste corrispondenti
            film.addAll(activityLists.get(0));
            serie.addAll(activityLists.get(1));
            anime.addAll(activityLists.get(2));
            giochi.addAll(activityLists.get(3));
            libri.addAll(activityLists.get(4));
            progettiCodici.addAll(activityLists.get(5));
            // ... e così via per le altre categorie

            // Esegui il codice che hai bisogno di fare con le liste di attività

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    	//System.out.println(film.get(0));
    	
    	//activities
    	ArrayList<String>[] activities = new ArrayList[6];
    	activities[0] = film;
        activities[1] = serie;
        activities[2] = anime;
        activities[3] = giochi;
        activities[4] = libri;
        activities[5] = progettiCodici;
        
     
        int activity = (int) (Math.random()*activities.length);
        int specific_activity = (int) (Math.random()*activities[activity].size());
        
        System.out.println(activities[activity].get(specific_activity));
       
       
    }//chiude main
    
    
}
