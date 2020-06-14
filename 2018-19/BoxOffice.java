import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    private static BoxOffice instance;
    private static List<Concert> concerts;
    private static List<Integer> tickets;
    private BoxOffice() {
        instance = this;
        concerts = new ArrayList<>();
        tickets = new ArrayList<>();
    }
    public static List<Ticket> buy(Concert concert, int num_tickets) throws InvalidTicket {
        List<Ticket> ret = new ArrayList<>();
        if (instance == null)
            new BoxOffice();
        int ticket;
        for (int i = 0; i < concerts.size(); i++)
        {
            if (concerts.get(i).equals(concert)) {
                while (num_tickets > 0)
                {
                    ticket = tickets.get(i);
                    ret.add(new Ticket(ticket,concert));
                    num_tickets--;
                    tickets.remove(i);
                    tickets.add(i,ticket + 1);
                }
                return ret;
            }
        }
        concerts.add(concert);
        tickets.add(1);
        while (num_tickets > 0)
        {
            ticket = tickets.get(tickets.size() - 1);
            ret.add(new Ticket(ticket,concert));
            num_tickets--;
            tickets.remove(tickets.size() - 1);
            tickets.add(ticket + 1);
        }
        return ret;

    }
}
