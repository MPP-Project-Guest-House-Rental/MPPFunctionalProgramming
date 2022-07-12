package Model;
public class HomeProperty {
    private Long id;

    private Integer bathRoomNumber;

    private Integer bedNumber;

    private Integer bedRoomNumber;

    private String description;

    public HomeProperty(){}

    public HomeProperty(Integer bathRoomNumber, Integer bedNumber, Integer bedRoomNumber, String description) {
        this.bathRoomNumber = bathRoomNumber;
        this.bedNumber = bedNumber;
        this.bedRoomNumber = bedRoomNumber;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBedRoomNumber() {
        return bedRoomNumber;
    }

    public void setBedRoomNumber(Integer bedRoomNumber) {
        this.bedRoomNumber = bedRoomNumber;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Integer getBathRoomNumber() {
        return bathRoomNumber;
    }

    public void setBathRoomNumber(Integer bathRoomNumber) {
        this.bathRoomNumber = bathRoomNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}