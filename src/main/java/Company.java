import java.util.concurrent.ThreadLocalRandom;

public class Company {

    private int id;
    private String name;

    public Company(String name) {
        this.id = ThreadLocalRandom.current().nextInt(1, 99999);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
