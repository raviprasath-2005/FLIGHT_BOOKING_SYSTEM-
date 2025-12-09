package com.wipro.fbs.service; 
import com.wipro.fbs.entity.*; 
import java.util.ArrayList; 
import com.wipro.fbs.util.*; 
public class BookingService { 
    private ArrayList<Passenger> passengers; 
    private ArrayList<Flight> flights; 
    private ArrayList<Booking> bookings; 
 
    public BookingService(ArrayList<Passenger> passengers,ArrayList<Flight> flights,ArrayList<Booking> 
bookings) { 
        this.passengers = passengers; 
        this.flights = flights; 
        this.bookings = bookings; 
    } 
    public boolean validatePassenger(String passengerId)throws InvalidPassengerException { 
        for (Passenger i : passengers) { 
            if (i.getPassengerId().equals(passengerId)) { 
                return true; 
            } 
        } 
        throw new InvalidPassengerException(); 
    } 
    public Flight findFlight(String flightId)throws BookingOperationException { 
        for (Flight i:flights) { 
            if (i.getFlightId().equals(flightId)) { 
                return i; 
            } 
        } 
        throw new BookingOperationException(); 
    } 
    public double calculateFare(Flight flight) { 
        double tax=10*flight.getBaseFare(); 
        return flight.getBaseFare()+tax; 
    } 
    public Booking bookFlight(String passengerId,String flightId,String date)throws Exception { 
        validatePassenger(passengerId); 
        Flight flight = findFlight(flightId); 
        if (flight.getAvailableSeats()<=0) { 
            throw new FlightFullException(); 
        } 
        double fare=calculateFare(flight); 
        String bookingId="RV"+(bookings.size()+1); 
        Booking newBooking=new Booking(bookingId,passengerId,flightId,fare,date); 
        bookings.add(newBooking); 
        flight.setAvailableSeats(flight.getAvailableSeats()-1); 
 
        return newBooking; 
    } 
    public void cancelBooking(String bookingId)throws BookingNotFoundException { 
        Booking f=null; 
 
        for (Booking b:bookings) { 
            if (b.getBookingId().equals(bookingId)) { 
                f=b; 
                break; 
            } 
        } 
        if (f == null) 
            throw new BookingNotFoundException(); 
        Flight flight=null; 
        for (Flight i:flights) { 
            if (i.getFlightId().equals(f.getFlightId())) { 
                flight = i; 
                break; 
            } 
        } 
        flight.setAvailableSeats(flight.getAvailableSeats()+1); 
        bookings.remove(f); 
    } 
    public void printPassengerBookings(String passengerId) { 
        for (Booking i:bookings) { 
            if (i.getPassengerId().equals(passengerId)) { 
                System.out.println("Booking ID: "+i.getBookingId()+", Flight: "+i.getFlightId()+", Date: 
"+i.getTravelDate()+", Fare: "+i.getFare()); 
            } 
        } 
    } 
} 
