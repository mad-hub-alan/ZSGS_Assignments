package banking_system;

public class SBI extends RBI{

    static double minimumBalance  = RBI.minimumBalance+1000.0;

    public SBI(Account acc, Customer cus){
        super(acc,cus);
    }
    public double getInterestRate(){
        return super.minimumInterest + 1.0;
    }
    public double getWithdrawalLimit(){
        return super.maximumWithdrawal;
    }

    public static double minimumBalance_SBI(){
        return minimumBalance;
    }
}
