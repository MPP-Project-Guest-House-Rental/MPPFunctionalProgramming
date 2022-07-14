package Model;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Role{
    private List<Reservation> reservations;

    public Guest(){
        reservations = new ArrayList<>();
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
