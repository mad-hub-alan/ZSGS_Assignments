package ticket_booking_system;

import java.util.Scanner;

public class TicketBookingApp {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------------------------Welcome to Ticket Booking System!-----------------------------------------------\n");
        
        TicketBooking booking;

        System.out.println("Press '1' for book Bus Ticket");
        System.out.println("Press '2' for book Train Ticket");
        System.out.println("Press '3' for book Flight Ticket \n");
    
        System.out.println("Enter your Choise : ");
        int mode = scan.nextInt();
        
        switch (mode) {
            case 1:
                booking = new BusTicketBooking();
                booking.bookTicket();
                break;
                case 2:
                booking = new TrainTicketBooking();
                booking.bookTicket();
                break;
                case 3:
                booking = new FlightTicketBooking();
                booking.bookTicket();
                break;
            default:
                System.out.println("Enter valid Option!");
                System.exit(0);
        }

        System.out.println("Thank you for reaching us! See you Again...");
    }
}
