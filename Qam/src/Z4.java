public class Z4 {
    private static int dogCount = 0;
    private static int catCount = 0;
    private static int animalCount = 0;

    public static void main(String[] args) {
        createDog("Бобик").run(500);
        new Dog("Бобик").swim(29);

        createCat("Мурзик").run(400);
        new Cat("Мурзик").swim();

        System.out.println("Всего животных: " + animalCount);
        System.out.println("Собак: " + dogCount);
        System.out.println("Котов: " + catCount);
    }

    private static DogV2 createDog(String name) {
        animalCount++;
        dogCount++;
        return new DogV2(name);
    }

    private static CatV2 createCat(String name) {
        animalCount++;
        catCount++;
        return new CatV2(name);
    }
}