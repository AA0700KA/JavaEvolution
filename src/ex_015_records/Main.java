package ex_015_records;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Petya", "abc123");

        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user.password());
    }

}
