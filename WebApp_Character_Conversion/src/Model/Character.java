package Model;
import org.apache.commons.lang3.*;

public class Character { 

	//Attribut
	private char charId;
	private int charDec;
	private String charHexa;
	private String charHtml;

	//Constructor
	public Character(char charId){
		this.charId=charId;
	}

	/*Getter and Accessor*/
	public char getCharId()				{ return this.charId; 	}
	public void setCharId(char charId) 	{ this.charId = charId;	}
	public int getCharDec() 			{ return this.charDec;	}
	public void setCharDec(int charDec) { this.charDec = charDec;}
	public String getCharHexa()			{ return this.charHexa;}
	public void setCharHexa(String charHexa) 	{ this.charHexa = charHexa; }
	public String getCharHtml() 		{ return this.charHtml;	}
	public void setCharHtml(String charHtml) { this.charHtml = charHtml;}

	/*converter*/
	public void charToDec()	{ charToHex(); setCharDec(Integer.parseInt(getCharHexa(), 16)); }
	public void charToHex()	{ setCharHexa(Integer.toHexString((int) charId)); }
	public void charToHtml(){ setCharHtml(StringEscapeUtils.escapeHtml4(charId+""));} 

	/*Initialize*/
	public void init(){
		charToDec();
		charToHex();
		charToHtml();
	}
	
	/*returns data in JSON format*/	
	public String toJson(){
		/*initialize*/
		init();
		String s="";
		s+="{\""+this.charId+"\", \""+getCharDec()+"\",\""+getCharHexa()+"\",\""+getCharHtml()+"\"}";
		return s;
	}

	/*Example*/
	public static void main(String args[]){
		Character c = new Character('é');
		
		/*initialize*/
		c.init();

		/*View*/
		System.out.println("Character : " + c.getCharId());
		System.out.println("CharToDeci : "+ c.getCharDec());
		System.out.println("CharToHexa : "+ c.getCharHexa());
		System.out.println("CharToHtml : "+ c.getCharHtml());

		/*ToJson*/
		String json = c.toJson();
		System.out.println("Format JSON :" + json);
	}
}