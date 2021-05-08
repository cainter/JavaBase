public class TypeString {
    public static void main(String[] args) {
        String longString = """
                select * from User;
                
                hello world.
                
                """;
        System.out.println(longString);
    }
}
