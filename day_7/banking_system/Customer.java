package banking_system;

public class Customer {
    private String customerName;
    private long aadhar;
    private String PAN;
    private long contactNumber;
    private String dateOfBirth;
    private String password;

    public Customer(String customerName, String customerID, long aadhar, String PAN, long contactNumber,
            String dateOfBirth,String password) {
        this.customerName = customerName;
        this.aadhar = aadhar;
        this.PAN = PAN;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public Customer(String customerName, String password) {
        this.setCustomerName(customerName);
        this.setAadhar();
        this.setContactNumber();
        this.setPAN();
        this.setDateOfBirth();
        this.setPassword(password);
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAadhar() {
        return aadhar;
    }
    public void setAadhar() {
        this.aadhar = (long)(123456789100l+Math.ceil(Math.random()*876543211234l));
    }

    public String getPAN() {
        return PAN;
    }
    public void setPAN() {
        String pre = ""+(char)(65+Math.floor(Math.random()*26))+(char)(65+Math.floor(Math.random()*26))+(char)(65+Math.floor(Math.random()*26))+(char)(65+Math.floor(Math.random()*26));

        int mid = (int)(1000+Math.ceil(Math.random()*876));

        char post = (char)(65+Math.floor(Math.random()*26));

        this.PAN = pre+mid+post;
    }

    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber() {
        this.contactNumber = (long)(7776543210l+Math.ceil(Math.random()*2000000000l));
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth() {

        String day = ""+(int)(Math.ceil(Math.random()*30));
        String month = ""+(int)(Math.ceil(Math.random()*12));
        String year = ""+(int)(1950+Math.ceil(Math.random()*70));

        this.dateOfBirth = day+"-"+month+"-"+year;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    //method

    public void printCustomerDetails(){
        System.out.println("-----------------Customer Details--------------------");
        System.out.println("Customer Name   : "+this.customerName);
        System.out.println("Customer DOB    : "+this.dateOfBirth);
        System.out.println("Customer Aadhar : "+this.aadhar);
        System.out.println("Customer PAN    : "+this.PAN);
        System.out.println("Contact Number  : "+this.contactNumber);
        System.out.println("----------------------------------------------------");
    }

}
