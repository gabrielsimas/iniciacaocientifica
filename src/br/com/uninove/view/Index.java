package br.com.uninove.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.uninove.dao.DaoProfessor;
import br.com.uninove.pojo.OrmProfessor;

@WebServlet(urlPatterns="/teste")
public class Index extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DaoProfessor dao = new DaoProfessor();
		OrmProfessor professor = new OrmProfessor();
		
		List<Object> lista = dao.listaObjetos(" Where nome like ?", new Object[] {"j%"} );
		professor = (OrmProfessor) lista.get(0);
		professor.setNome("jonnat");
//		professor.setEmail("jonnathanvb@gmail.com");
		dao.update(professor);
		
		PrintWriter writer = resp.getWriter();
		
		
		writer.println("<html><body>");
	
		for (Object obj : lista) {
			OrmProfessor orm = (OrmProfessor) obj;
			writer.println( orm.getNome() + "<br />");
			
		}

		writer.println("</body></html>");
	}

}
