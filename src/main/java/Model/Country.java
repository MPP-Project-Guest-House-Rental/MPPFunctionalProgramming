package Model;

import java.util.List;

public class Country {
    private String name;
    private String Abv;
    private List<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbv() {
        return Abv;
    }

    public void setAbv(String abv) {
        Abv = abv;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
