import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Company {

    private int id;
    private String name;

    private Date createdDate;

    public Company(String name) {
        this.id = ThreadLocalRandom.current().nextInt(1, 99999);
        this.name = name;
        this.createdDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
