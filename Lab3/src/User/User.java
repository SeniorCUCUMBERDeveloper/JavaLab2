package User;



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

}
