public class Dog {
    //Instance variables attributes
    private String name;
    private String breed;

    //Constructor
    public Dog(String name, String breed) {
        this.name =  name;
        this.breed = breed;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    //setter methods
    public void setName(String newName) {
        this.name= newName;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }
}
