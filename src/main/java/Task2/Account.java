package Task2;
public abstract class Account<T> {

    private T data;
    private double amount;

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s; Сумма: %.2f руб.", data, amount);
    }

}