public class Student extends Member {

    public Student(String name, String id) {
        super(name, id);
    }

    public Student(String name) {
        super(name);
    }

    //if the id exists -> nothing, otherwise 5000
    @Override
    public double calculateFees() {
        if (getId() != null && !getId().isEmpty()) {
            return 0;
        }
        return FLAT_FEE;
    }
}
