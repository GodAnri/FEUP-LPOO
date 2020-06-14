import java.util.Objects;

public abstract class Person extends User implements Comparable {
    Person(String name) {
        super(name);
    }

    Person(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 1;
        if (o == null || getClass() != o.getClass()) return 0;
        Person person = (Person) o;
        if (age == person.age && Objects.equals(name, person.name))
            return 1;
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
