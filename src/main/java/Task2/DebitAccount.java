package Task2;

public class DebitAccount<T> extends Account<T> {
    public DebitAccount(T data, double amount) {
        super(data, amount);
    }
}