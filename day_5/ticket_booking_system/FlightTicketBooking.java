package ticket_booking_system;

import java.util.Scanner;

public class FlightTicketBooking extends TicketBooking{
    static Scanner scan = new Scanner(System.in);
    protected String from;
    protected String to;
    protected String passportNo;
    protected Airline airline;
    protected ClassType classType;
    protected String flightNumber;

    public FlightTicketBooking(String passengerName, int passengerAge, int ticketId, String from, String to,
            String passportNo, ClassType classType) {
        super(passengerName, passengerAge, ticketId);
        this.from = from;
        this.to = to;
        this.passportNo = passportNo;
        this.classType = classType;
    }
    public FlightTicketBooking() {

    }

    public static Scanner getScan() {
        return scan;
    }
    public static void setScan(Scanner scan) {
        FlightTicketBooking.scan = scan;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public Airline getAirline() {
        return airline;
    }
    public void setAirline(Airline airline) {
        this.airline = airline;
    }
    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }
    
    @Override
    protected void bookTicket(){
        System.out.println("------------------------Flight Ticket Booking------------------------");
        System.out.println();
        System.out.println("Enter Passenger Name :");
        super.setPassengerName(scan.nextLine());
        System.out.println("Enter Passenger Age :");
        super.setPassengerAge(scan.nextInt());
        scan.nextLine();
        super.setTicketId((int)(41234+ Math.ceil(Math.random()*10000)));
        System.out.println("Enter Passport Number : ");
        setPassportNo(scan.nextLine());
        System.out.println("Enter From Terminal : ");
        setFrom(scan.nextLine());
        System.out.println("Enter To Terminal : ");
        setTo(scan.nextLine());
        System.out.println("-----Available Airlines----");
        System.out.println(" 0. AirIndia");
        System.out.println(" 1. Emirates");
        System.out.println(" 2. Qantas");
        System.out.println(" 3. Lufthansa");
        System.out.println(" 4. Qatar");
        System.out.println(" 5. AirArabia");
        System.out.println(" 6. SpiceJet");
        System.out.println(" 7. Indigo");
        System.out.println();
        System.out.println("Select Airline : ");
        setAirline(Airline.values()[scan.nextInt()]);
        scan.nextLine();
        setFlightNumber(""+(char)(65 +Math.floor(Math.random()*26))+"-"+(int)(Math.ceil(Math.random()*999)));
        System.out.println("-------Classes-------");
        System.out.println(" 0. Business");
        System.out.println(" 1. FirstClass");
        System.out.println(" 2. Economy");
        System.out.println();
        System.out.println("Select Class : ");
        setClassType(ClassType.values()[scan.nextInt()]);
        scan.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n\nTicket Booked Successfully!....Your Ticket Id is : '"+this.ticketId+"'");
        System.out.println(".....Happy Journey!.....");
        System.out.println("");
        this.printTicketDetails();
    }

    @Override
    protected void printTicketDetails(){
        System.out.println("---------------Your Ticket Details---------------");
        System.out.println();
        System.out.println("Passenger Name : "+this.passengerName);
        System.out.println("Passenger Age : "+this.passengerAge);
        System.out.println("Passport Number : "+this.passportNo);
        System.out.println("From Trminal : "+this.from);
        System.out.println("To Terminal : "+this.to);
        System.out.println("Airline Name : "+this.airline);
        System.out.println("Flight Number : "+this.flightNumber);
        System.out.println("Class Type : "+this.classType);
        System.out.println("-------------------------------------------------");
    }
    
}

enum ClassType{
    BUSINESS,
    FIRST,
    ECONOMY
}

enum Airline{
    AIR_INDIA,
    EMIRATES,
    QANTAS,
    LUFTHANSA,
    QATAR,
    AIR_ARABIA,
    SPICEJET,
    INDIGO
}