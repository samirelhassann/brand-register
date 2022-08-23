import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/company")
public class CompanyController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Registering another company...");

        String companyName = request.getParameter("name");
        String companyId = request.getParameter("id");

        String message = "";
        Database db = new Database();

        if (companyId != null && !companyId.isEmpty()) {
            Database.updateCompany(Integer.parseInt(companyId), companyName);
            message = "Company updated with success";
        }

        if (companyId == null) {
            Company c = new Company(companyName);
            db.add(c);
            message = "Company created with success";
        }

        RequestDispatcher rd = request.getRequestDispatcher("/newCompanyCreated.jsp");
        request.setAttribute("message", message);
        request.setAttribute("allCompanies", db.getCompanies());

        rd.forward(request, response);
    }

}
