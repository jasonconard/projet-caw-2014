package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class JsonToFile {

	private BufferedWriter bw;
	private ArrayList<String> caracteres;
	
	
	private final String fichier = "json_file.json";
	private String chaineATraiter;
	
	public JsonToFile(String chaine) throws IOException{
		creationWriter();
		caracteres = new ArrayList<String>();
		this.chaineATraiter = chaine;
		recuperation();
	}
	
	boolean verificationDoublon(char chaineAVerifier, int indice){
		for(int i = 0; i < indice; i++){
			if(this.chaineATraiter.charAt(i) == chaineAVerifier){
				return false;
			}
		}
		return true;
	}
	
	ArrayList<String> getCaracteres(){
		return this.caracteres;
	}
	
	void recuperation(){
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
	
	
	String chaineAAfficher(){
		String chaine = new String();
		chaine+="{ \"tableau\":\n";
		chaine+="[\n";
		
		for(int i = 0; i < caracteres.size(); i++){
			if(i == (caracteres.size() - 1))
				chaine +="\t"+caracteres.get(i) + "\n";
			else
				chaine+="\t"+caracteres.get(i) + ",\n";
		}
		chaine+="]\n";
		chaine+="}";
		return chaine;
	}
	
	public void ecriture() throws IOException{
		bw.write(this.chaineAAfficher());
		bw.close();
	}
	
	public static void main(String [] args){
		try {
			JsonToFile jtf = new JsonToFile("aea");
			System.out.println(jtf.chaineAAfficher());
			jtf.ecriture();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
