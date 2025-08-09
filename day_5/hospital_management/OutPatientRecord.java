package hospital_management;

import java.time.LocalDate;

public class OutPatientRecord extends MedicalRecord{
    protected String doctorName;
    protected double consultationFee;


    public OutPatientRecord(int recordId, String patientName, LocalDate dateOfVisit, String diagnosis,String doctorName, double consultationFee) {
        super(recordId, patientName, dateOfVisit, diagnosis);
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }


    @Override
    public void displayRecord() {
        System.out.println("------------------------------OutPatient Record----------------------------------");
        System.out.println("Record Id : "+this.recordId);
        System.out.println("Patient Name : "+this.patientName);
        System.out.println("Date of Visit : "+this.dateOfVisit);
        System.out.println("Diagnosis : "+this.diagnosis);
        System.out.println("Doctor Name : "+this.doctorName);
        System.out.println("Consultation Fee : "+this.consultationFee);
    }

    
}
