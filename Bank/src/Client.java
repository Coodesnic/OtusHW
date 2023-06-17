import java.util.Objects;
import java.util.ArrayList;
public class Client {
    String name;
    int age;
    ArrayList<Account> accountsList = new ArrayList<Account>();

    public Client() {
    }

    public Client(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



}
