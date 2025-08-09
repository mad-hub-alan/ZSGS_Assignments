package ticket_booking_system;

public class TicketBooking {
    protected String passengerName;
    protected int passengerAge;
    protected int ticketId;

    public TicketBooking(String passengerName,int passengerAge, int ticketId) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.ticketId = ticketId;
    }
    public TicketBooking(){

    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    protected void bookTicket(){
        System.out.println("Booking Ticket!");
    }

    protected void printTicketDetails(){
        System.out.println("Ticket Booking Successfully!");
    }
}
