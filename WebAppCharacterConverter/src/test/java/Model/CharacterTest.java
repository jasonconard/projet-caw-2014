package Model;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.lang3.*;
import static org.junit.Assert.*;
 
public class CharacterTest {

    @Test
    public void testToJson() throws Exception {
    	Character c = new Character('é');
    	c.init();
    	String expectedResult = "{\"é\", \"233\",\"e9\",\"&eacute;\"}";
    	System.out.println(expectedResult);
    	String currentResult = c.toJson(); 
    	System.out.println(currentResult);
    	assertEquals(expectedResult,currentResult);
    	
    }
    
    @Test
    public void testCharToDec() throws Exception {
    	Character c = new Character('é');
    	c.charToDec();
    	int expectedResult = 233;
    	System.out.println(expectedResult);
    	int currentResult = c.getCharDec();
    	System.out.println(currentResult);
    	assertEquals(expectedResult,currentResult);
    	
    }
    
    @Test
    public void testCharToHex() throws Exception {
    	Character c = new Character('é');
    	c.charToHex();
    	String expectedResult = "e9";
    	System.out.println(expectedResult);
    	String currentResult = c.getCharHexa();
    	System.out.println(currentResult);
    	assertEquals(expectedResult,currentResult);
    	
    }
    @Test
    public void testCharToHtml() throws Exception {
    	Character c = new Character('é');
    	c.charToHtml();
    	String expectedResult = "&eacute;";
    	System.out.println(expectedResult);
    	String currentResult = c.getCharHtml(); 
    	System.out.println(currentResult);
    	assertEquals(expectedResult,currentResult);
    	
    }
}
