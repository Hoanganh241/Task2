package task6;

public class TestAuthor {
    public static void main(String[] args) {
        // Test constructors and toString()
        Author aheck = new Author("Tan Ah Tek", "tek@nowhere.com", 'm');
        System.out.println(ahTeck);
        //Tan Ah Teck (m) at teck@nowhere.com

        // Test Setters and Getters
        ahTeck.setEmail("teck@nowhere.com");
        System.out.println(ahTeck);

        //Tan Ah Teck (m) at ...
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());

        System.out.println("email is: " + ahTeck.getEmail());


    }
}
