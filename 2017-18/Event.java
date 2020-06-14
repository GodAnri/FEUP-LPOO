import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Event {
    private String title, date, description;
    private List<Person> audience;

    Event(String title) {
        this.title = title;
        this.date = "";
        this.description = "";
        audience = new ArrayList<>();
    }

    Event(String title, String date) {
        this.title = title;
        this.date = date;
        this.description = "";
        audience = new ArrayList<>();
    }

    Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        audience = new ArrayList<>();
    }

    Event(Event event) {
        this.title = event.getTitle();
        this.date = event.getDate();
        this.description = event.getDescription();
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

    public List<Person> getAudience() {
        return audience;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addPerson(Person person) {
        for (Person p : audience) {
            if (p.getName().equals(person.getName()))
                return;
        }
        audience.add(person);
    }

    public int getAudienceCount() {
        return audience.size();
    }

    @Override
    public String toString() {
        return title + " is a " + description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) &&
                Objects.equals(date, event.date) &&
                Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }
}
