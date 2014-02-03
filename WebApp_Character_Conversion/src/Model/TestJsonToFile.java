package creation_fichier;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestJsonToFile {

	@Test
	public void testDoublon() throws IOException {
		String chaine = "aea";
		JsonToFile jtf = new JsonToFile(chaine);
		assertTrue(jtf.verificationDoublon(chaine.charAt(1), 1));
		assertFalse(jtf.verificationDoublon(chaine.charAt(2), 2));
	}
	
	@Test
	public void testRecuperation() throws IOException {
		String chaine = "abcdef";
		JsonToFile jtf = new JsonToFile(chaine);
		assertEquals(6, jtf.getCaracteres().size());
	}

	
	
}
