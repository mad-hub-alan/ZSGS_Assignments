package hospital_management;

import java.time.LocalDate;

public class InPatientRecord extends MedicalRecord{
    protected int roomNumber;
    protected int no_of_days_admitted;
    protected int roomCharges;

    public InPatientRecord(int recordId, String patientName, LocalDate dateOfVisit, String diagnosis, int roomNumber,
            int no_of_days_admitted, int roomCharges) {
        super(recordId, patientName, dateOfVisit, diagnosis);
        this.roomNumber = roomNumber;
        this.no_of_days_admitted = no_of_days_admitted;
        this.roomCharges = roomCharges;
    }

    protected double calculateTotalCharges(){
        return (this.no_of_days_admitted) * (this.roomCharges);
    }

    @Override
    public void displayRecord() {
        System.out.println("------------------------------Medical Record----------------------------------");
        System.out.println("Record Id : "+this.recordId);
        System.out.println("Patient Name : "+this.patientName);
        System.out.println("Date of Visit : "+this.dateOfVisit);
        System.out.println("Diagnosis : "+this.diagnosis);
        System.out.println("Room No : "+this.roomNumber);
        System.out.println("No.Of Days Admitted : "+this.no_of_days_admitted);
        System.out.println("Room Charges : "+this.roomCharges);
    }

    
    
}
