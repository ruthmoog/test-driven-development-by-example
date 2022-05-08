public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency() {
        return super.currency();
    }
}
