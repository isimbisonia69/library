public class Librarian extends Member {

    public Librarian(String name, String id) {
        super(name, id);
    }

    public Librarian(String name) {
        super(name);
    }

    //librarians pay nothing
    @Override
    public double calculateFees() {
        return 0;
    }
}
