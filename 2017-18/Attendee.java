public class Attendee extends Person {
    private boolean hasPaid;

    Attendee(String name) {
        super(name);
        hasPaid = false;
    }

    Attendee(String name, int age) {
        super(name, age);
        hasPaid = false;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    @Override
    public String toString() {
        return "Attendee " + super.getName() + " has" + (hasPaid ? " paid its registration." : "n't paid its registration.");
    }
}
