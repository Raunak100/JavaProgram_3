public class SingleInheritanceDemo {

    static class Animal {
       
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name + " is eating.");
        }

        public String getName() {
            return name;
        }
    }

    static class Dog extends Animal {
       
        public Dog(String name) {
      
            super(name);
        }

        public void bark() {
            System.out.println(getName() + " is barking.");
        }
    }

    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy");

        myDog.eat();

        myDog.bark();
    }
}
