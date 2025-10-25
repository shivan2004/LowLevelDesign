import java.awt.print.Book;
import java.util.List;
import java.util.UUID;

public class Booking {
    String id;
    User user;
    Show show;
    List<Seat> bookedSeats;
    Payment payment;

    public Booking(String bookingId, Show show, String userId, List<Seat> seats) {
    }

    public Booking createBooking(String userId, Show show, List<Seat> seats) {
        if(isAnySeatAlreadyBooked(show, seats)) {
            throw new SeatPermanentlyUnavailableException();
        }
        
        boolean lockSuccess = seatLockPrivider.lockSeats(seats, show.id, userId);
        if(!lockSuccess) {
            throw new SeatLockFailedException("Failed to lock seats for the user");
        }
        
        String bookingId = UUID.randomUUID().toString();
        Booking newBooking = new Booking(bookingId, show, userId, seats);
        
        showBookings.put(bookingId, newBooking);
        
        return new Booking();
    }

    private boolean isAnySeatAlreadyBooked(Show show, List<Seat> seats) {
        List<Seat> bookedSeats = getBookedSeats(show);
        for(Seat seat : seats) {
            if(bookedSeats.contains(seat)) {
                return true;
            }
        }
        return false;
    }

}
