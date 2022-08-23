import java.util.ArrayList;
import java.util.List;

public class Database {

    private static List<Company> companies = new ArrayList<>();

    public void add(Company c) {
        Database.companies.add(c);
    }

    public static List<Company> getCompanies() {
        return companies;
    }

    public static Company getCompanyById(int id) {
        return companies.stream()
                .filter(company -> company.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

    }

    public static void updateCompany(int id, String newName) {
        companies.stream()
                .filter(company -> company.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .setName(newName);
    }

    public static void removeCompanyById(int id) {
        companies.removeIf(company -> company.getId() == id);
    }
}
