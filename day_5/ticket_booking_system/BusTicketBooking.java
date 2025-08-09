package ticket_booking_system;

import java.util.Scanner;

public class BusTicketBooking extends TicketBooking{
    static Scanner scan = new Scanner(System.in);
    protected String fromStop;
    protected String toStop;

    public BusTicketBooking(String passengerName, int passengerAge, int ticketId, String fromStop, String toStop) {
        super(passengerName, passengerAge, ticketId);
        this.fromStop = fromStop;
        this.toStop = toStop;
    }
    public BusTicketBooking(){
        super();
    }

    public String getFromStop() {
        return fromStop;
    }

    public void setFromStop(String fromStop) {
        this.fromStop = fromStop;
    }

    public String getToStop() {
        return toStop;
    }

    public void setToStop(String toStop) {
        this.toStop = toStop;
    }

    @Override
    protected void bookTicket(){
        System.out.println("-----------------------Bus Ticket Booking-------------------");
        System.out.println();
        System.out.println("Enter Passenger Name :");
        super.setPassengerName(scan.nextLine());
        System.out.println("Enter Passenger Age :");
        super.setPassengerAge(scan.nextInt());
        super.setTicketId((int)(81234+ Math.ceil(Math.random()*10000)));
        scan.nextLine();
        System.out.println("Enter your Pick-up Stop : ");
        setFromStop(scan.nextLine());
        System.out.println("Enter your Destination Stop :");
        setToStop(scan.nextLine());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n\nTicket Booked Successfully!....Your Ticket Id is : '"+this.ticketId+"'");
        System.out.println(".....Happy Journey!.....");
        System.out.println("");
        this.printTicketDetails();
    }

    @Override
    protected void printTicketDetails(){
        System.out.println("---------------Your Ticket Details---------------");
        System.out.println();
        System.out.println("Passenger Name : "+passengerName);
        System.out.println("Passenger Age : "+passengerAge);
        System.out.println("Pick-up stop  : "+fromStop);
        System.out.println("Destination stop: "+toStop);
        System.out.println("Ticket Id : "+ticketId);
        System.out.println("-------------------------------------------------");
    }
        
}
