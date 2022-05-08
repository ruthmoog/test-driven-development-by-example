public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency() {
        return super.currency();
    }
}
