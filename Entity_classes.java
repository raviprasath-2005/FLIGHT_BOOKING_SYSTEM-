package com.wipro.fbs.entity; 
 
public class Passenger { 
    private String passengerId; 
    private String name; 
    private String contactNumber; 
 
    public Passenger(String passengerId, String name, String contactNumber) { 
        this.passengerId = passengerId; 
        this.name = name; 
        this.contactNumber = contactNumber; 
    } 
 
    public String getPassengerId() { 
        return passengerId; 
    } 
 
    public void setPassengerId(String passengerId) { 
        this.passengerId = passengerId; 
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    public String getContactNumber() { 
        return contactNumber; 
    } 
 
    public void setContactNumber(String contactNumber) { 
        this.contactNumber = contactNumber; 
    } 
} 
 
public class Flight { 
    private String flightId; 
    private String source; 
    private String destination; 
    private int totalSeats; 
    private int availableSeats; 
    private double baseFare; 
 
    public Flight(String flightId, String source, String destination, 
                  int totalSeats, int availableSeats, double baseFare) { 
        this.flightId = flightId; 
        this.source = source; 
        this.destination = destination; 
        this.totalSeats = totalSeats; 
        this.availableSeats = availableSeats; 
        this.baseFare = baseFare; 
    } 
 
    public String getFlightId() { 
        return flightId; 
    } 
 
    public void setFlightId(String flightId) { 
        this.flightId = flightId; 
    } 
 
    public String getSource() { 
        return source; 
    } 
 
    public void setSource(String source) { 
        this.source = source; 
    } 
 
    public String getDestination() { 
        return destination; 
    } 
 
    public void setDestination(String destination) { 
        this.destination = destination; 
    } 
 
    public int getTotalSeats() { 
        return totalSeats; 
    } 
 
    public void setTotalSeats(int totalSeats) { 
        this.totalSeats = totalSeats; 
    } 
 
    public int getAvailableSeats() { 
        return availableSeats; 
    } 
 
    public void setAvailableSeats(int availableSeats) { 
        this.availableSeats = availableSeats; 
    } 
 
    public double getBaseFare() { 
        return baseFare; 
    } 
 
    public void setBaseFare(double baseFare) { 
        this.baseFare = baseFare; 
    } 
} 
 
public class Booking { 
    private String bookingId; 
    private String passengerId; 
    private String flightId; 
    private double fare; 
    private String travelDate; 
 
    public Booking(String bookingId, String passengerId, String flightId, 
                   double fare, String travelDate) { 
        this.bookingId = bookingId; 
        this.passengerId = passengerId; 
        this.flightId = flightId; 
        this.fare = fare; 
        this.travelDate = travelDate; 
    } 
 
    public String getBookingId() { 
        return bookingId; 
    } 
 
    public void setBookingId(String bookingId) { 
        this.bookingId = bookingId; 
    } 
 
    public String getPassengerId() { 
        return passengerId; 
    } 
 
    public void setPassengerId(String passengerId) { 
        this.passengerId = passengerId; 
    } 
 
    public String getFlightId() { 
        return flightId; 
    } 
 
    public void setFlightId(String flightId) { 
        this.flightId = flightId; 
    } 
 
    public double getFare() { 
        return fare; 
    } 
 
    public void setFare(double fare) { 
        this.fare = fare; 
    } 
 
    public String getTravelDate() { 
        return travelDate; 
    } 
 
    public void setTravelDate(String travelDate) { 
        this.travelDate = travelDate; 
    } 
}
