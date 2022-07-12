package Model;

import Model.Enum.ApprovedStatus;
import Model.Enum.Type;

import java.util.List;
import java.util.Objects;


public class Property {
    private Long id;

    private String title;

    private Type type;

    private Address address;

    private Double pricePerNight;

    private ApprovedStatus approvedStatus;

    private Boolean availabiltyStatus;

    private Integer capacity;

    private HomeProperty homeProperty;

    private Host host;

    private List<Reservation> reservations;
    public Property(String title,
                    Type type,
                    String description,
                    Address address,
                    Double pricePerNight,
                    ApprovedStatus approvedStatus,
                    Boolean availabiltyStatus,
                    Integer capacity,
                    HomeProperty homeProperty,
                    Host host) {
        this.title = title;
        this.type = type;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.approvedStatus = approvedStatus;
        this.availabiltyStatus = availabiltyStatus;
        this.capacity = capacity;
        this.homeProperty = homeProperty;
        this.host = host;
    }

    public Property(){}

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Property(Boolean availabiltyStatus,Double pricePerNight){
        this.availabiltyStatus=availabiltyStatus;
        this.pricePerNight=pricePerNight;
    }
    public Property(String title, Type type, Address address, Double pricePerNight, ApprovedStatus approvedStatus, Boolean availabiltyStatus, Integer capacity, List<Reservation> reservations, HomeProperty homeProperty) {
        this.title = title;
        this.type = type;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.approvedStatus = approvedStatus;
        this.availabiltyStatus = availabiltyStatus;
        this.capacity = capacity;
        this.homeProperty = homeProperty;
        this.reservations = reservations;
    }

    public HomeProperty getHomeProperty() {
        return homeProperty;
    }

    public void setHomeProperty(HomeProperty homeProperty) {
        this.homeProperty = homeProperty;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getAvailabiltyStatus() {
        return availabiltyStatus;
    }

    public void setAvailabiltyStatus(Boolean availabiltyStatus) {
        this.availabiltyStatus = availabiltyStatus;
    }

    public ApprovedStatus getApprovedStatus() {
        return approvedStatus;
    }

    public void setApprovedStatus(ApprovedStatus approvedStatus) {
        this.approvedStatus = approvedStatus;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(id, property.id) && Objects.equals(title, property.title) &&
                type == property.type && Objects.equals(address, property.address) &&
                Objects.equals(pricePerNight, property.pricePerNight) && approvedStatus == property.approvedStatus &&
                Objects.equals(availabiltyStatus, property.availabiltyStatus) &&
                Objects.equals(capacity, property.capacity) && Objects.equals(homeProperty, property.homeProperty) &&
                Objects.equals(host, property.host);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}