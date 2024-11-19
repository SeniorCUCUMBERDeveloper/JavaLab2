package arrayuser;

import User.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;



public class ArrayUser {
    private ArrayList<User> users;


    public ArrayUser() {
        this.users = new ArrayList<>();
    }

    
    public boolean contain(User user) {
        for(User man : users) {
            if(man.equals(user)){
                return true;
            }
        }
        return false;
    }




    public void addUser(User user) {
        if(contain(user)){
            throw new IllegalStateException("User already contains");
        }
        users.add(user);
    }

    public void removeUser(User user) {
        if(!contain(user)){
            throw new IllegalStateException("User not found");
        }
        users.remove(user);
    }



    public void printSortedLastName() {
        if(users.isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        users.stream().sorted(Comparator.comparing(User::getLastname)).forEach(user -> System.out.println(user));
    }

    public void printSortedAge() {
        if(users.isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        users.stream().sorted(Comparator.comparing(User::getAge)).forEach(user -> System.out.println(user));
    }

    public  boolean checkAge(){
        if(users.isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        return users.stream().allMatch(user -> user.getAge() > 7);
    }

    public double averageAge(){
        return users.stream().mapToInt(User::getAge).average().orElseThrow(() -> new IllegalStateException("No age data available"));
    }


    public void CountinCountries(){
        if(users.isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        Map<String, Long> countryCounts = users.stream().collect(Collectors.groupingBy(User::getCountry, Collectors.counting()));
        countryCounts.forEach((country, count) -> System.out.println(country + ": " + count));
    }

}
