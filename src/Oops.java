class User {
    private int id;
    private String email;
    private String password;
    private float progress;

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    User(int id, String email, String password, float progress) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.progress = progress;
    }
    //rules to remember
    //getter method ->to get the data
    //class-abstractclass-interface diff to token level

    public int getId() {
        return this.id;
    }

    //setter method-> to set data
    public int getId(int id) {
        return this.id = id;
    }

    public class Oops {
        public static void main(String[] args) {
            User userOne = new User(1, "nihal208@gmail.com", "123445", 80.0f);
            System.out.println("user email is:" + userOne.email);
        }

    }
}
