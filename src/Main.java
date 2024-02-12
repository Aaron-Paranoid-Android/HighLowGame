public class Main {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        try {
            p1.setName("Jack");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(p1.getName());

        Player p2 = new Player("Sam");
        System.out.println(p2.getName());
    }
}