package banking_system;

public class SBI extends RBI{

    public SBI(){
        super();
    }
    public double getInterestRate(){
        return super.minimumInterest + 1.0;
    }
    public double getWithdrawalLimit(){
        return super.maximumWithdrawal;
    }
    public double getMinimumBalance(){
        return super.minimumBalance + 1000;
    }
}
