package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.JsonToFile;


@WebServlet("controller.jsp")
public class ConnecteurApp extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException {
		String chaine = req.getParameter("chaine-caractere");
		
		
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
