public interface iAnimal {
    public String getAnimalType();
    public int getIdTag();
    public void setIdTag(int anIdTag);
    public int getMinTemperature();
    public int getMaxTemperature();
}

class Salamander implements iAnimal {
    public int IdTag;

    public String getAnimalType() {return "Salamander";}
    public int getIdTag() {return IdTag;};
    public void setIdTag(int anIdTag) {this.IdTag = anIdTag;};
    public int getMinTemperature(){return 55;};
    public int getMaxTemperature(){return 65;};
}

