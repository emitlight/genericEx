package genericEx;

public class Generic01 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>();

        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        landAnimal.add(new Sparrow());

        for (int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
    }
}
