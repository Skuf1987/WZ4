class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim() {
        System.out.println(name + " не умеет плавать.");
    }
}