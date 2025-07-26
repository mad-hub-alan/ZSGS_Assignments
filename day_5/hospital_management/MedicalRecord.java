package hospital_management;

import java.time.LocalDate;

public class MedicalRecord {
    protected int recordId;
    protected String patientName;
    protected LocalDate dateOfVisit;
    protected String diagnosis;

    
    public MedicalRecord(int recordId, String patientName, LocalDate dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }

    public void inputRecordDetails(int recordId, String patientName, LocalDate dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }


    public void displayRecord() {
        System.out.println("------------------------------Medical Record----------------------------------");
        System.out.println("Record Id : "+this.recordId);
        System.out.println("Patient Name : "+this.patientName);
        System.out.println("Date of Visit : "+this.dateOfVisit);
        System.out.println("Diagnosis : "+this.diagnosis);
    }

    
    
}
