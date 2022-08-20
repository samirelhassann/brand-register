import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listCompanies")
public class ListCompanies extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>The company was registered with success</h1>");
        out.println("<hr/>");
        out.println("<p>All elements in database: </p>");
        out.println("<ol>");

        Database.getCompanies().forEach(company -> out.println("<li>" + company.getName() + "</li>"));

        out.println("</ol>");
        out.println("<br>");
        out.println("</body>");
        out.println("</html>");
    }

}
