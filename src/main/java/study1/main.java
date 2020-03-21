package study1;

public class main {
    public static void main (String[] args) {
        User ivanUser = new User(20,"Иван");
        User mariaUser = new User("Мария Иванова");

        mariaUser.setAge(-5);

        sayHelloFromUsers(ivanUser, mariaUser);

        ivanUser.sayHello();
        mariaUser.sayHello();

        ivanUser.setAge(21);
        mariaUser.setNameUser("Мария Петрова");

        sayHelloFromUsers(ivanUser, mariaUser);

        int currentMariaAge = mariaUser.getAge();
        mariaUser.setAge(currentMariaAge);
    }
    private static void sayHelloFromUsers(User...users) {
        for (User user : users) {
            user.sayHello();
        }
    }
}

