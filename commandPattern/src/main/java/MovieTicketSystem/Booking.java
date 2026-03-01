package MovieTicketSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

    private String id;
    private Show show;
    private BookingStatus bookingStatus;
    private List<Seat> seats;
    private LocalDateTime bookedDate;
}
