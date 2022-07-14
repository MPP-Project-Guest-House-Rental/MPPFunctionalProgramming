package Model;

import java.util.ArrayList;
import java.util.List;

public class Host extends Role{
    private List<Property> properties;

    public Host(){
        properties = new ArrayList<>();
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
