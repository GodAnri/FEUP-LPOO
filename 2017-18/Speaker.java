public class Speaker extends Person {
    private int fee = 0;

    Speaker(String name) {
        super(name);
        fee = 0;
    }

    Speaker(String name, int age) {
        super(name, age);
        fee = 0;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + super.getName() + " has a fee value of " + fee + ".";
    }
}
