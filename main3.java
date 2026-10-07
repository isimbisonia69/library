public class Main3 {
    public static void main(String[] args) {
        Book book = new Book("0001", "FEMINIST", "GIHOZO IKUZWE");
        System.out.println(book);

        Member[] members = {
            new PublisherMember("Alice Press", "P001"),
            new StudentMember("Bob", "S123"),
            new StudentMember("Carol"),          
            new LibrarianMember("Dave", "L001")
        };


        for (Member m : members) {
            System.out.println(m);
            System.out.println("Fee: " + m.calculateFees() + "\n");
        }
    }
}