package address;

public class Main3 {
    public static void main(String[] args) {
        Address address1 = new Address("London","221B");
        Person person1 = new Person("Herlock Sholmes",address1);

        System.out.println(person1);

    }
}
