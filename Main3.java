public class Main3 {
    public static void main(String[] args) {
        Book book = new Book("0001", "FEMINIST", "GIHOZO IKUZWE");
        System.out.println(book);

        Member[] members = {
            new Publisher("Alice Press", "P001"),
            new Student("Bob", "S123"),
            new Student("Carol"),
            new Librarian("Dave", "L001")
        };

        for (Member m : members) {
            System.out.println(m);
            System.out.println("Fee: " + m.calculateFees() + "\n");
        }
    }
}
