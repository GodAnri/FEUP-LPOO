import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private List<Act> acts;
    private String city, country, date;

    Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void addAct(Act act) {
        acts.add(act);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(acts, concert.acts) &&
                Objects.equals(city, concert.city) &&
                Objects.equals(country, concert.country) &&
                Objects.equals(date, concert.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acts, city, country, date);
    }

    public boolean isValid(Ticket ticket) {
        return ticket.getConcert().equals(this);
    }

    public boolean participates(Act act) {
        for (Act a : acts)
        {
            if (a.equals(act))
                return true;
            else if (a.getClass() == Band.class)
            {
                for (Act artist : ((Band) a).getArtists()) {
                    if (artist.equals(act))
                        return true;
                }
            }
        }
        return false;
    }
}
