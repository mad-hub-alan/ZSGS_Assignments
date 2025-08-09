package day_9.exception_10;

import java.util.Scanner;

/*
 10. Write a Java program to manage a voting system where a person must be at least 18 years old 
 to be eligible to vote. Use a custom exception to handle the scenario 
 when an ineligible person tries to register for voting. 
 Display appropriate messages for eligible and ineligible voters.
 */

public class Exception_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------------------------------VOTING APPLICATION-----------------------------------\n");
        System.out.print("Enter Your Age : ");
        int age = scan.nextInt();

        System.out.println("\n 1. INDIAN");
        System.out.println(" 2. NRI");
        System.out.println(" 0. OTHERS");
        System.out.print("\n\n Choose Your Nationality(1/2/0) : "); 
        Nationality nationality = Nationality.values()[scan.nextInt()];
        System.out.println();

        boolean isEligibleToVote = false;

        try{
            isEligibleToVote = validateVoter(age, nationality);
        }catch(IneligibleAgeToVoteException ex){
            ex.printStackTrace();
        }catch(InValidNationalityException ex){
            ex.printStackTrace();
        }

        if(isEligibleToVote) System.out.println("\n\n----Your Eligible to Vote!----\n\n");

        scan.close();
    }

    public static boolean validateVoter(int age, Nationality nationality) throws IneligibleAgeToVoteException,InValidNationalityException{
        if(age < 18){
            throw new IneligibleAgeToVoteException("You must be atleast 18 years to Vote!");
        }
        if((nationality == Nationality.values()[0])){
            throw new InValidNationalityException("You must be Indian or NRI to Vote!");
        }
        return true;
    }
}
