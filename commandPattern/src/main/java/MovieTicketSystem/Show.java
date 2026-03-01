package MovieTicketSystem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Show {

    private String id;

    private Movie movie;

    private Screen screen;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private ConcurrentHashMap<Seat,SeatStatus> seatAvailabilityMap;

    public Show(){
        seatAvailabilityMap=new ConcurrentHashMap<>();
    }

    public boolean lockSeats(List<Seat> seats){
        for (int i=0;i<seats.size();i++){
            if(seatAvailabilityMap.get(seats.get(i).getSeatNo()).equals(SeatStatus.AVAILABLE)){
                seatAvailabilityMap.put(seats.get(i),SeatStatus.LOCKED);
            }
            else {
                for(int j=0;j<i;j++){
                    seatAvailabilityMap.put(seats.get(j),SeatStatus.AVAILABLE);
                }
                return false;
            }

        }
        return true;
    }



}
//
//Movie  -id,name, runtime
//City - id,name,code
//Theatre - id, name, Screens
//Screen - id, seats
//Show - id, movie, screen, startTime,endTime(include date), seatAvailabilityMap
//Seat - id, SeatType, seatNumber
//SeatType<Enum> - Regular,Premium
//SeatStatus<Enum> - Booked, Available,Locked
//Booking - bookingid, show, seats,BookingStatus, bookeddate
//BookingStatus  - CONFIRMED, TIMEOUT, PENDING