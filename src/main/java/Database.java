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
}
