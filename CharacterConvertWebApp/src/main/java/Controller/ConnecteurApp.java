package Controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.JsonToFile;

public class ConnecteurApp extends HttpServlet{

	private static final long serialVersionUID = -7758388960799525831L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		String chaine = req.getParameter("chaine");
		//System.out.println("Chaine = "+chaine);
		JsonToFile jtf;
		try {
			jtf = new JsonToFile(chaine);
			jtf.ecriture();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
