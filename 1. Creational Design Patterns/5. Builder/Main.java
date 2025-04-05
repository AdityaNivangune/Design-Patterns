public class Main {
    public static void main(String[] args) {
        User user = new User.userBuilder()
                    .setEmailId("adi@gmail.com")
                    .setUserId(11)
                    .setUserName("Aditya")
                    .build();

        System.out.println(user);
        }
}
