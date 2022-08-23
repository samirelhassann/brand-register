import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editCompany")
public class EditCompany extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Editing company...");

        Integer companyId = Integer.parseInt(request.getParameter("id"));

        Company company = Database.getCompanyById(companyId);

        RequestDispatcher rd = request.getRequestDispatcher("/formNewCompany.jsp");
        request.setAttribute("companyId", company.getId());
        request.setAttribute("companyName", company.getName());

        rd.forward(request, response);
    }

}
