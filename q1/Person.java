public class Person {
    //Instance variables attributes
    private String name;
    private int age;
    
    //Default constructor
    public Person(){
        this.name = "Unknown";
        this.age = 0;
        
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
