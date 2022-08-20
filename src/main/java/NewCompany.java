import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompany extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Registering another company...");
        PrintWriter out = response.getWriter();

        String companyName = request.getParameter("name");
        Company c = new Company(companyName);

        Database db = new Database();
        db.add(c);

        RequestDispatcher rd = request.getRequestDispatcher("/newCompanyCreated.jsp");
        request.setAttribute("companyName", c.getName());
        request.setAttribute("allCompanies", db.getCompanies());

        rd.forward(request, response);
    }

}
