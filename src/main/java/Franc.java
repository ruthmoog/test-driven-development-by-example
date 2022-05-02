public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    protected String currency() {
        return super.currency();
    }
}
