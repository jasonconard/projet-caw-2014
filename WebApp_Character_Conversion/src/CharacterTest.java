import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CharacterTest {

    @Test
    public void testToJson() throws Exception {
    	Character c = new Character('é');
    	String expectedResult = "{\"é\", \"233\",\"e9\",\"&eacute;\"}";
    	System.out.println(expectedResult);
    	String currentResult = c.toJson(); 
    	System.out.println(currentResult);
    	assertEquals(expectedResult,currentResult);
    	
    }
}
