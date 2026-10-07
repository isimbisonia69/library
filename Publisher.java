public class Publisher extends Member {

    public Publisher(String name, String id) {
        super(name, id);
    }

    public Publisher(String name) {
        super(name);
    }

    //flat fee + 5% of flat fee + 20,000
    @Override
    public double calculateFees() {
        return FLAT_FEE + (0.05 * FLAT_FEE) + 20000;
    }
}
