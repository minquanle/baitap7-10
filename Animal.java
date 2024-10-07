abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract boolean move();
}

class Walking extends Animal {
    public Walking(String name) {
        super(name);
    }
    @Override
    public boolean move() {
        return true;
    }
}

class Swimming extends Animal {
    public Swimming(String name) {
        super(name);
    }
    @Override
    public boolean move() {
        return true;
    }
}

class Pig extends Walking {
    public Pig(String name) {
        super(name);
    }
    public boolean move() {
        return true;
    }
}
class Fish extends Swimming {

    public Fish(String name) {
        super(name);
    }
    public boolean move() {
        return true;
    }
}
class Duck extends Animal {
    Walking walking;
    Swimming swimming;
    public Duck(String name) {
        super(name);
        this.walking = new Walking(name);
        this.swimming = new Swimming(name);
    }
    public boolean move() {
        return walking.move() && swimming.move();
    }
}
