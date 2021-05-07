import java.util.ArrayList;
import java.util.List;

public class HenHouse {
    List<Hen> hens = new ArrayList<>();

    //region Constructor/Getters/Setters
    HenHouse() {}

    public List<Hen> getHens() {
        return hens;
    }

    public void setHens(List<Hen> hens) {
        this.hens = hens;
    }
    //endregion

    //Calls a method for each hen in the list.
    public void eggs(){
        this.hens.forEach(Hen::hasEgg);
    }

}
