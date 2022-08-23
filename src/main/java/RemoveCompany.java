import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeCompany")
public class RemoveCompany extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Removing company...");

        Integer companyId = Integer.parseInt(request.getParameter("id"));

        Database.removeCompanyById(companyId);

        String message = "Company removed successfully";

        RequestDispatcher rd = request.getRequestDispatcher("/newCompanyCreated.jsp");
        request.setAttribute("message", message);
        request.setAttribute("allCompanies", Database.getCompanies());

        rd.forward(request, response);
    }

}
