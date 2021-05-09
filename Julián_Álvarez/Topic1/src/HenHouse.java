import java.util.ArrayList;
import java.util.List;

public class HenHouse implements IBuildings {
    private final List<Hen> hens = new ArrayList<>();

    @Override
    public void addAnimal(IAnimals animals) {
        this.hens.add((Hen)animals);
    }

    @Override
    public void generateAnimalProduct(){
        this.hens.forEach(Hen::generateProduct);
    }

}
