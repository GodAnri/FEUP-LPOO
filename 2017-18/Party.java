import java.util.ArrayList;
import java.util.List;

public class Party extends Event {
    private String title, date, description;
    private List<Person> audience;

    Party(String title, String date, String description) {
        super(title, date, description);
        audience = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void addPerson(Person person) {
        for (Person p : audience) {
            if (p.getName().equals(person.getName()))
                return;
        }
        audience.add(person);
    }

    public void addEvent(Event event) {
        for (Person p : event.getAudience())
        {
            addPerson(p);
        }
    }

    public int getAudienceCount() {
        return audience.size();
    }
}
