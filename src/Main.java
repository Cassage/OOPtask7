import Builder.User;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Bobik", "Noob").setPatronymic("Googov").build();
    }
}
