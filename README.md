✈️ Flight-Booking-System

A complete and interactive airline reservation simulation built using Java.
This project demonstrates core concepts such as OOP, exception handling, collection frameworks, business logic implementation, and package-based project architecture.

✨ Features

Passenger registration and validation

Flight creation with source, destination, and seat tracking

Prevents overbooking using custom exceptions

Unique booking ID generation

Fare calculation based on base fare

Booking cancellation with automatic seat restoration

View all bookings made by a passenger

Fully modular project using packages

📁 Project Structure
flight-booking-system/
│
├── com.wipro.fbs.entity
│   ├── Passenger.java          # Passenger details
│   ├── Flight.java             # Flight details and seat tracking
│   └── Booking.java            # Booking record
│
├── com.wipro.fbs.util
│   ├── InvalidPassengerException.java
│   ├── FlightFullException.java
│   ├── BookingNotFoundException.java
│   └── BookingOperationException.java
│
├── com.wipro.fbs.service
│   └── BookingService.java      # Core flight booking logic
│
└── com.wipro.fbs.main
    └── Main.java                # Demonstration workflow

🛠 Technologies Used

Java

OOP Principles

Collections (ArrayList)

Custom Exceptions

Package-based Architecture

🔮 Future Improvements

Add database connection (MySQL / Oracle)

Add dynamic fare calculation (taxes, peak time, discounts)

Add seat selection (Aisle/Window/Middle)

Integrate payment simulation module

Create GUI (JavaFX / Swing) or web UI

Add real-time flight search and filtering

👨‍💻 Author

RAVI PRASATH V

GitHub: https://github.com/raviprasath-2005

📜 License

This project is open-source and available under the MIT License.

🖼 Screenshot (Sample)

<img width="931" height="333" alt="image" src="https://github.com/user-attachments/assets/c7555c0f-d57d-4f4b-852a-7e8117ae274a" />


📘 About

This is a fully functional airline reservation simulation built using Core Java.
The system allows users to:

Validate passenger IDs

Book flights with seat tracking

Prevent overbooking

Generate booking IDs

Cancel bookings safely

View all bookings made by a passenger

It demonstrates practical use of Java classes, objects, exceptions, and business logic, making it an excellent academic or beginner project.

🏷 Topics

java object-oriented-programming collections flight-booking
exception-handling beginner-project console-application
