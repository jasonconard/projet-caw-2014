package Mounirit_Controle;

public class Class_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Write_in_JSON RJ = new Write_in_JSON(); // Class écriture en Json
		Decouper_String D_S = new Decouper_String(); // Class découpage de String en tableau de chars
		 
		 // Récuperer un String de SALMANE
		
		//---- ICI IL ME FAUT LE NOM DE LA FONCTION DE SALMANE POUR L' APPELER
		
		//______________________________________________________
		
		
		
		 // Découper Le string
		char[] t = D_S.Decouper("Le String récuperé de salmane") ;
		for (int j=0;j<t.length;j++){System.out.println(t[j]);} // Affichage
		//______________________________________________________
		
		
	   	 // Chercher le codage de chaque caractére chez Quentin
		
		//---- ICI IL ME FAUT LE NOM DE LA FONCTION DE SALMANE POUR L' APPELER
		
		//______________________________________________________
		
		 
		   
		 // Remplire un fichier JSON
		  RJ.Write("fichierJson", "Ce String est récuperé de la class de quentin"); // Le nom de fichier est : "test"
		 //______________________________________________________
		
		
		
		
		 

	}

}
