import java.util.*;
import java.lang.*;

import static java.lang.String.valueOf;

public interface iAnimal{
    public String getAnimalType();
    public int getIdTag();
    public void setIdTag(int anIdTag);
    public int getMinTemperature();
    public int getMaxTemperature();
    public int compare(iAnimal a, iAnimal b);
}

class Salamander implements iAnimal, Comparator<iAnimal> {
    private int IdTag;

    public String getAnimalType() {return "Salamander";}
    public int getIdTag() {return IdTag;};
    public void setIdTag(int anIdTag) {this.IdTag = anIdTag;};
    public int getMinTemperature(){return 55;};
    public int getMaxTemperature(){return 65;};
    public int compare(iAnimal a, iAnimal b) {
        return valueOf(a.getIdTag()).compareTo(valueOf(b.getIdTag()));
    }
}

// Erik Hernandez Rodriguez's Hamster
class Hamster implements iAnimal, Comparator<iAnimal> {

    private int anIdTag;
    private int minTemp = 65;
    private int maxTemp = 75;

    public String getAnimalType() {
        return "Hamster";
    }

    public int getIdTag() {
        return anIdTag;
    }

    public void setIdTag(int anIdTag) {
        this.anIdTag = anIdTag;

    }
    public int getMinTemperature() {
        return minTemp;
    }

    public int getMaxTemperature() {
        return maxTemp;
    }

    public int compare(iAnimal a, iAnimal b) {
        return valueOf(a.getIdTag()).compareTo(valueOf(b.getIdTag()));
    }

}


