package travel_booking_system.travel.user;

import java.util.Scanner;

import travel_booking_system.travel.booking.Ticket;

public class User {
    private static Scanner scan = new Scanner(System.in);
    private String name;
    private int age;
    private long mobileNo;
    private Ticket myTicket;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void bookTicket(){
        System.out.println("------------------------------------User Details--------------------------------------\n");
        System.out.print("Enter your Name : ");
        this.setName(scan.nextLine());

        System.out.print("\nEnter your Age : ");
        this.setAge(scan.nextInt());

        System.out.print("\nEnter your Mobile Number : ");
        this.setMobileNo(scan.nextLong());

        System.out.println();

        System.out.println("------------------------------------Ticket Booking--------------------------------------\n");
        
        myTicket = new Ticket(); // creating Ticket instance

        String[] dest = {   // destination Array
            "Chennai",
            "Coimbatore",
            "Cochin",
            "Bangalore",
            "Hyderabad",
            "Vizag",
            "Mysore"
        };

        int[] fares = {650,640,760,820,720,690,880};    // fare array

        System.out.println("******* Destination List *******\n");

        for(int i=0; i<dest.length; i++){
            System.out.print(i+". "+dest[i]+"\t");
            if (i %2 != 0) System.out.println(); 
        }

        System.out.print("\n\nChoose the destination you want to go : ");
        int choice = scan.nextInt();
        myTicket.setDestination(dest[choice]);
        myTicket.setFare(fares[choice]);
        myTicket.setTicketId((int)(123456  + Math.ceil(Math.random()*100000)));

        System.out.println("\nTicket Booked Successfully !");
        this.printTicketDetails();
    }

    public void printTicketDetails(){
        System.out.println("\n--------------------Ticket Details---------------------\n");
        System.out.println("Paasenger Name : "+this.name);
        System.out.println("Paasenger Age : "+this.age);
        System.out.println("Paasenger Mobile Number : "+this.mobileNo);
        System.out.println("Ticket Id : "+myTicket.getTicketId());
        System.out.println("Source  : "+Ticket.getSource());
        System.out.println("Destination : "+myTicket.getDestination());
        System.out.println("Fare : "+myTicket.getFare());
        System.out.println("------------------------------------------------------");
    }
}
