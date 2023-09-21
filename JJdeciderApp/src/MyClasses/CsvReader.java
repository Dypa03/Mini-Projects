package MyClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CsvReader {

	//ATTRIBUTI
	BufferedReader memoriaInLettura;
	FileReader fileInLettura;
	PrintWriter memoriaInScrittura;
	FileWriter fileInScrittura;
	ArrayList<String> letturaFile = new ArrayList<String>();
	ArrayList<String> scritturaFile = new ArrayList<String>();
	
	ArrayList<String> intestazione = new ArrayList<String>();
	
	//COSTRUTTORE
	public CsvReader(String nomeFile) throws FileNotFoundException {
		fileInLettura = new FileReader(nomeFile);
		memoriaInLettura = new BufferedReader(fileInLettura);
	}
	
	//METODI
	
	
	//LEGGI FILE
	public void leggiFile() throws IOException {
		String linea = memoriaInLettura.readLine();
		//intestazione.add(linea);
		
		linea = "";
		while(linea != null) {
			linea = memoriaInLettura.readLine();
			
			//controllo se sono a eof
			if (linea != null) {
				letturaFile.add(linea);
			}
		}//chiude while
	}//chiude leggiFile()
	
	
	//GETTER DELLA LISTA letturafile
		public ArrayList<String> getLetturaFile() {
			return letturaFile;
		}

		
	/*
	//GETTER DELL'INTESTAZIONE
	public ArrayList<String> getLetturaIntestazione() {
		return intestazione;
	}
	*/
		
	//MOSTRA FILE
	public void mostraFile(CsvReader fileCsv) {
		for (int i = 0; i < fileCsv.getLetturaFile().size(); i++) {
			System.out.println(fileCsv.getLetturaFile().get(i));
		}
	}
	
	//SOVRASCRIVI FILE
	/*
	 * public void sovrascrivifile(String intestazione, String nomefile) throws IOException {
		
		fileinscrittura = new FileWriter(nomefile, false);
		memoriainscrittura = new PrintWriter(fileinscrittura);
		
		memoriainscrittura.println(intestazione);
		
		for (int i =0; i < ScritturaFile.size(); i++) {
			
			//SE SONO ALL'ULTIMO SCRIVO SENZA ANDARE A CAPO
			if (i == ScritturaFile.size()-1) {
			memoriainscrittura.print(ScritturaFile.get(i));
			} else {//ALTRIMENTI SCRIVO E VADO A CAPO
			memoriainscrittura.println(ScritturaFile.get(i));
			}
		}
		
		memoriainscrittura.close();
		
	}
	 */
	
	//ACCODA FILE
	//public void accodaFile
	
	
}
