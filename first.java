// BlueWhale class can not inherit both Mammals and MarineAnimals as Java does not support multiple inheritance

class Mammals {
    void print1() {
        System.out.println("I am a mammal.");
    }
}

class MarineAnimals {
    void print2() {
        System.out.println("I am a marine animal.");
    }
}

class BlueWhale extends Mammals // Multiple inheritance not supported in Java, so can't inherit both Mammals ans
                                // MarineAnimals
{
    void print3() {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}

public class first {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        MarineAnimals marineAnimal = new MarineAnimals();
        BlueWhale blueWhale = new BlueWhale();

        mammal.print1(); // function of Mammals by the object of Mammal
        marineAnimal.print2(); // function of MarineAnimal by the object of MarineAnimal
        blueWhale.print3(); // function of Blue Whale by the object of BlueWhale
        blueWhale.print1(); // function of each of its parent by the object of BlueWhale
    }
}
