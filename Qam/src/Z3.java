class DogV2 extends Dog {

    public DogV2(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть больше 10 м.");
        }
    }
}

class CatV2 extends Cat {

    public CatV2(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim() {
        super.swim();
    }
}

