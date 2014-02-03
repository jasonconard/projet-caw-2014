package Mounirit_Controle;



	//___________________________

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_in_JSON {
	public Write_in_JSON(){
		
		System.out.println("Class d'ecriture dans un fichier JSON");
	}

	public  void Write(String nom_fichier, String String_Json) {
		String cheminDuFichier = nom_fichier;
		
		String jsonContent = String_Json;
		File file = new File(cheminDuFichier);

		try {
			if (!file.exists())
				file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write(jsonContent);
			writer.append("testoppp");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("Erreur: impossible de créer le fichier '"
					+ cheminDuFichier + "'");
		}
	}
}


	//____________________________
	
	
	

