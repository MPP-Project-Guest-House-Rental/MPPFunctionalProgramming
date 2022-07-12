package Model;

public class Address {
    private Long id;
    private String zipCode;

    private String streetNumber;

    private String lat;

    private String lon;

    public Address(){}

    public Address(String zipCode, String streetNumber, String lat, String lon) {

        this.zipCode = zipCode;
        this.streetNumber = streetNumber;
        this.lat = lat;
        this.lon = lon;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}