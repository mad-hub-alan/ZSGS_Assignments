package banking_system;

public class PNB extends RBI{

    static double minimumBalance = RBI.minimumBalance;

    public PNB(Account acc, Customer cus){
        super(acc,cus);
    }
    public double getInterestRate(){
        return super.minimumInterest + 2.0;
    }
    public double getWithdrawalLimit(){
        return super.maximumWithdrawal;
    }

    public static double minimumBalance_PNB(){
        return minimumBalance;
    }
}
