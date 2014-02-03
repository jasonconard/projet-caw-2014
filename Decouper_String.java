package Mounirit_Controle;

public class Decouper_String {
	
 public Decouper_String(){  System.out.println("découpage de String en chaine caractères");}
	//--------------------------------
	
	      public char[] Decouper( String string_à_découper){	
			
			 
			  String str = string_à_découper;
			  char tableau_de_caratères[] = new char[str.length()];
			 
			  System.out.println("Les caratères récupérés de salmane sont :");
		for(int i=0 ;i<str.length()-1;i++){	  
			  tableau_de_caratères[i] = str.charAt(i);  		  
		                                  }
		return tableau_de_caratères;
			                      }
	//--------------------------------
}


