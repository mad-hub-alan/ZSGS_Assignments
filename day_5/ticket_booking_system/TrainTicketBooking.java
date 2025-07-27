package ticket_booking_system;

import java.util.Scanner;

public class TrainTicketBooking extends TicketBooking{
    static Scanner scan = new Scanner(System.in);
    protected String fromStation;
    protected String toStation;
    protected int trainNumber;
    protected int pnr;
    protected ClassPref classPreference;

    
    public TrainTicketBooking(String passengerName, int passengerAge, int ticketId, String fromStation, String toStation, int trainNumber, ClassPref classPreference) {
        super(passengerName,passengerAge,ticketId);
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.trainNumber = trainNumber;
        this.classPreference = classPreference;
    }

    public TrainTicketBooking(){

    }


    public String getFromStation() {
        return fromStation;
    }


    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }


    public String getToStation() {
        return toStation;
    }


    public void setToStation(String toStation) {
        this.toStation = toStation;
    }


    public int getTrainNumber() {
        return trainNumber;
    }


    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    
    public void setPnr(int pnr) {
        this.pnr = pnr;
    }


    public ClassPref getClassPreference() {
        return classPreference;
    }


    public void setClassPreference(ClassPref classPreference) {
        this.classPreference = classPreference;
    }
   
    @Override
    protected void bookTicket(){
        System.out.println("-----------------------Train Ticket Booking---------------------");
        System.out.println();
        System.out.println("Enter Passenger Name :");
        super.setPassengerName(scan.nextLine());
        System.out.println("Enter Passenger Age :");
        super.setPassengerAge(scan.nextInt());
        scan.nextLine();
        super.setTicketId((int)(41234+ Math.ceil(Math.random()*10000)));
        System.out.println("Enter From Station : ");
        setFromStation(scan.nextLine());
        System.out.println("Enter To Station : ");
        setToStation(scan.nextLine());
        System.out.println("Enter Train Number : ");
        setTrainNumber(scan.nextInt());
        System.out.println("-----Class Preferences-----");
        System.out.println(" 0. Sleeper");
        System.out.println(" 1. RAC");
        System.out.println(" 2. 3rd AC");
        System.out.println(" 3. 2nd AC");
        System.out.println(" 4. 1st AC");
        System.out.println();
        System.out.println("Enter Appropriate number according to your preference : ");
        setClassPreference(ClassPref.values()[scan.nextInt()]);
        setPnr((int)(53781234+ Math.ceil(Math.random()*10000000)));
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\nTicket Booked Successfully!....Your Ticket Id : '"+this.ticketId+"' & PNR : '"+this.pnr+"'");
        System.out.println(".....Happy Journey!.....");
        System.out.println("");
        this.printTicketDetails();

    }

    protected void printTicketDetails(){
        System.out.println("---------------Your Ticket Details---------------");
        System.out.println();
        System.out.println("Passenger Name : "+this.passengerName);
        System.out.println("Passenger Age : "+this.passengerAge);
        System.out.println("From Station : "+this.fromStation);
        System.out.println("To Station : "+this.toStation);
        System.out.println("Train Number : "+this.trainNumber);
        System.out.println("Class : "+this.classPreference);
        System.out.println("PNR Number : "+this.pnr);
        System.out.println("Ticket Id : "+this.ticketId);
        System.out.println("-------------------------------------------------");

    }
}

enum ClassPref{
    SLEEPER,
    RAC,
    AC_3,
    AC_2,
    AC_1
}