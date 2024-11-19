import arrayuser.ArrayUser;
import User.User;

public class Main {
    public static void main(String[] args) {
        ArrayUser arrayUser = new ArrayUser();

        
        User user1 = new User(1, "Alice", "Smith", 25, "USA");
        User user2 = new User(2, "Bob", "Johnson", 30, "USA");
        User user3 = new User(3, "Jane", "Doe", 22, "Canada");
        User user4 = new User(4, "Emily", "Davis", 28, "Canada");
        User user5 = new User(5, "Michael", "Brown", 19, "USA");

        
        arrayUser.addUser(user1);
        arrayUser.addUser(user2);
        arrayUser.addUser(user3);
        arrayUser.addUser(user4);
        arrayUser.addUser(user5);
        System.out.println("Users sorted by last name:");


        arrayUser.printSortedLastName();
        System.out.println("\nUsers sorted by age:");


        arrayUser.printSortedAge();
        System.out.println("\nAll users are older than 7: " + arrayUser.checkAge());


        System.out.println("\nAverage age of users: " + arrayUser.averageAge());


        System.out.println("\nCount of users in countries: ");

        arrayUser.CountinCountries();
        

        arrayUser.removeUser(user3);
        System.out.println("\nAfter removing Jane Doe:");
        arrayUser.printSortedLastName();
    }
}
