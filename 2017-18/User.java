public class User {
    protected String name;
    protected int age;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUsername() {
        return name + age;
    }
}
