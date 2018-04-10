package multiion_pattern.die;

public class Client {
    private static Die die1, die2;

    public static void main(String[] args) {
        die1 = Die.getInstance(1);
        die2 = Die.getInstance(2);
    }
}
