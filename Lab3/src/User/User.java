package User;

import java.util.Objects;

public class User{
    private int id;
    private String firstname;
    public String lastname;
    private int age;
    private String country;


    public User(int id, String firstname, String lastname, int age, String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.country = country;
    }

    @Override
  public String toString() {
    return "User:" + "id=" + id + ", firstName=" + firstname + ' ' + ", secondName=" + lastname + ' ' + ", age=" + age + ", country=" + country;
  }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ 
            return true;
        }
        if (!(o instanceof User)){
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    public int compareTo(User other, String compare){
        switch(compare){
            case "id":
                return Integer.compare(this.id, other.id);
            case "firstname":
            return Objects.compare(this.firstname, other.firstname, String::compareTo);
            case "lastname":
            return Objects.compare(this.lastname, other.lastname, String::compareTo);
            case "age":
                return Integer.compare(this.age, other.age);
            case "country":
                return Objects.compare(this.country, other.country, String::compareTo); 
            default:
                throw new IllegalArgumentException("Invalid comparison field");
        }
    }

}
