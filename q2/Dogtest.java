public class Dogtest {
    public static void main(String[] args) {
        Dog buddy = new Dog("Buddy", "Golden Retriever");
        Dog steve = new Dog("Steve", "Bulldog");

        System.out.println("Dog 1: " + buddy.getName() + ", Breed: " + buddy.getBreed());
        System.out.println("Dog 2: " + steve.getName() + ", Breed: " + steve.getBreed());

        //Modifying their attributes
        buddy.setName("Max");
        buddy.setBreed("Labrador");

        steve.setName("Rocky");
        steve.setBreed("Idk what");

        System.out.println("Dog 1: " + buddy.getName() + ", Breed: " + buddy.getBreed());
        System.out.println("Dog 2: " + steve.getName() + ", Breed: " + steve.getBreed());

    }
}
