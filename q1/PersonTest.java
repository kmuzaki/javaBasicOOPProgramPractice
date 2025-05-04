public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Billy", 18);
        Person person2 = new Person("Alice", 21);

        System.out.println("Person 1 identity: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("");

        System.out.println("Person 2 identity: ");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
