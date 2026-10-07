public abstract class Member {
    protected static final double FLAT_FEE = 5000;

    private String name;
    private String id;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member(String name) {
        this.name = name;
    }

    //those are for getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    //every member type calculates its fee in its own way
    public abstract double calculateFees();

    //the toString method to print the member object
    @Override
    public String toString() {
        return "***************" + "\n"
                + "Member Type: " + getClass().getSimpleName() + "\n"
                + "Member Name: " + name + "\n"
                + "Member ID: " + id + "\n";
    }
}
