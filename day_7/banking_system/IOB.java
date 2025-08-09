package banking_system;

public class IOB extends RBI{

    static double minimumBalance = RBI.minimumBalance;

    public IOB(Account acc, Customer cus){
        super(acc,cus);
    }
    public double getInterestRate(){
        return super.minimumInterest + 3.0;
    }
    public double getWithdrawalLimit(){
        return super.maximumWithdrawal+25000.0;
    }

    public static double minimumBalance_IOB(){
        return minimumBalance;
    }
}
