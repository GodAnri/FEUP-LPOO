public class InvalidTicket extends Exception {
    private int number;
    InvalidTicket(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
