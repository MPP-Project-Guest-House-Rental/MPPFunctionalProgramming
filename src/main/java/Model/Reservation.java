package Model;

import Model.Enum.ReservationStatusEnum;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {
    private Long id;

    private Double calculatedPrice;

    private LocalDate startDate;

    private LocalDate endDate;

    private Guest guest;

    private Property property;

    private String refNumber;

    private ReservationStatusEnum reservationStatus;


    public Reservation(Double calculatedPrice,
                       LocalDate startDate,
                       LocalDate endDate,
                       Guest guest,
                       Property property,
                       String refNumber,
                       ReservationStatusEnum reservationStatus) {
        this.calculatedPrice = calculatedPrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guest = guest;
        this.property = property;
        this.refNumber = refNumber;
        this.reservationStatus = reservationStatus;
    }

    public Reservation() {

    }

    public ReservationStatusEnum getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatusEnum reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public Property getProperty() {
        return property;
    }


    public void setProperty(Property property) {
        this.property = property;
    }

    public Guest getGuest() {
        return guest;
    }


    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Double getCalculatedPrice() {
        return calculatedPrice;
    }

    public void setCalculatedPrice(Double calculatedPrice) {
        this.calculatedPrice = calculatedPrice;
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
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(calculatedPrice, that.calculatedPrice) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(guest, that.guest) && Objects.equals(property, that.property) && Objects.equals(refNumber, that.refNumber) && reservationStatus == that.reservationStatus;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}