package MovieTicketSystem;

public class Seat {

    private String id;
    private SeatType seatType;
    private String seatNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}
