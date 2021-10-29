package Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,"Roman",33);
        int hCode =person.hashCode();
        System.out.println(hCode);
        Person person1 = new Person(6,"Roman",33);
        hCode = person1.hashCode();
        System.out.println(hCode);
    }
}
