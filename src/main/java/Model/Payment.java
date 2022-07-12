package Model;

public class Payment {
    private Long id;

    private double amount;

    private AppUser guestAppUser;

    private AppUser hostAppUser;

    private Reservation reservation;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public AppUser getHostAppUser() {
        return hostAppUser;
    }

    public void setHostAppUser(AppUser hostAppUser) {
        this.hostAppUser = hostAppUser;
    }

    public AppUser getGuestAppUser() {
        return guestAppUser;
    }

    public void setGuestAppUser(AppUser guestAppUser) {
        this.guestAppUser = guestAppUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}