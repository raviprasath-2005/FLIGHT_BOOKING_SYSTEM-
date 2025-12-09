package com.wipro.fbs.util; 
public class InvalidPassengerException extends Exception { 
public String toString() { 
return "Passenger does not found"; 
} 
} 
public class FlightFullException extends Exception { 
public String toString() { 
return "seats not available for this flight"; 
} 
} 
public class BookingNotFoundException extends Exception { 
public String toString() { 
return "BookingNotFoundException: Booking ID not found or already cancelled!"; 
} 
} 
public class BookingOperationException extends Exception { 
public String toString() { 
        return "Invalid booking operation"; 
    } 
}
