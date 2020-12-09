import java.util.*;

public class ComparePerson {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

addElements(personList);
addElements(personSet);

        System.out.println(personList);
        System.out.println(personSet);


    }

    private static void addElements(Collection collection){
        collection.add(new Person(10, "Boy"));
        collection.add(new Person(21, "Girl"));
        collection.add(new Person(1, "Man"));
        collection.add(new Person(30, "Woman"));

    }
}

class Person implements Comparable<Person>{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.id){
            return 1;
        }else if (this.id < o.id){
            return -1;}
        else {return 0;}
    }
}
