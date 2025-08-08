package travel_booking_system.travel.booking;

public class Ticket {
    private int ticketId;
    private static String source = "Tenkasi";
    private String destination;
    private double fare;


    public int getTicketId() {
        return ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public static String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public double getFare() {
        return fare;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }

    
}
