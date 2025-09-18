class Dog {
    private String name;
    private String breed;

    // Constructor
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "Bulldog");
        Dog d2 = new Dog("Bruno", "German Shepherd");

        // Update attributes
        d1.setName("Tiger");
        d1.setBreed("Pug");

        d1.display();
        d2.display();
    }
}
