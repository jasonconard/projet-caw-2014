package creation_fichier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Character;

public class JsonToFile {

	private BufferedWriter bw;
	private ArrayList<String> caracteres;
	
	
	private final String fichier = "json_file.txt";
	private String chaineATraiter;
	
	public JsonToFile(String chaine) throws IOException{
		creationWriter();
		caracteres = new ArrayList<>();
		this.chaineATraiter = chaine;
		recuperation();
	}
	
	private boolean verificationDoublon(char chaineAVerifier, int indice){
		for(int i = 0; i < indice; i++){
			if(this.chaineATraiter.charAt(i) == chaineAVerifier){
				return false;
			}
		}
		return true;
	}
	
	private void recuperation(){
		for(int i = 0; i < chaineATraiter.length(); i++){
			Character c = new Character(chaineATraiter.charAt(i));
			if(verificationDoublon(chaineATraiter.charAt(i), i))
					caracteres.add(c.toJson());
		}
		
	}
	
	private void creationWriter() throws IOException{
		try{
			bw = new BufferedWriter(new FileWriter("json_file.txt"));
		}catch(IOException ieo){
			throw new IOException("Erreur creation fichier "+ fichier);
		}
	}
	
	
	void affichageConsole(){
		System.out.println("{ \""+ this.chaineATraiter +"\" : ");
		System.out.println("[");
		
		for(int i = 0; i < caracteres.size(); i++){
			if(i == (caracteres.size() - 1))
				System.out.println("\t"+caracteres.get(i) + "\n");
			else
				System.out.println("\t"+caracteres.get(i) + ",\n");
		}

		
		System.out.println("]");
		System.out.println("}");
	}
	
	public void ecriture() throws IOException{
		bw.write("{ \""+ this.chaineATraiter +"\":\n {");
		bw.write("[");
		
		for(int i = 0; i < caracteres.size(); i++){
			if(i == (caracteres.size() - 1))
				bw.write("\t"+caracteres.get(i) + "\n");
			else
				bw.write("\t"+caracteres.get(i) + ",\n");
		}
		
		bw.write("]");
		bw.write("}");
		bw.close();
	}
	
	public static void main(String [] args){
		try {
			JsonToFile jtf = new JsonToFile("aea");
			jtf.affichageConsole();
			jtf.ecriture();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
