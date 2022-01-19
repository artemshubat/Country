public class ountry {

    public String title;
    public int populationSize;
    public int areaInSquareKilometers;
    public int nameOfTheCapital;
    public int accessToTheSea;

    public void setName(String title); {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }
    public int getPopulationSize() {
        return populationSize;
    }
    public void setAreaInSquareKilometers (int areaInSquareKilometers); {
        this.areaInSquareKilometers = areaInSquareKilometers;
    }
    public int getPopulationSize() {
        return areaInSquareKilometers;
    }
    public void setOfTheCapital (int ofTheCapital); {
        this.nameOfTheCapital = nameOfTheCapital;
    }
    public int getPopulationSize(); {
        return ofTheCapital;
    }
    public abstract void setAccessToTheSea(int accessToTheSea); {
        this.accessToTheSea = accessToTheSea;
    }
    public int getPopulationSize() {
        return accessToTheSea;
    }

}
