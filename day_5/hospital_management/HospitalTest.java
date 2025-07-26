package hospital_management;

import java.time.LocalDate;
import java.util.Date;

public class HospitalTest {
    public static void main(String[] args) {
        MedicalRecord op = new OutPatientRecord(4, "Vetri", LocalDate.now(), "Stomach Pain", "Srinivasan",500);
        MedicalRecord ip = new InPatientRecord(18, "Surya", LocalDate.now(), "Fever", 24,4, 1500);

        op.displayRecord();
        ip.displayRecord();
    }
}
