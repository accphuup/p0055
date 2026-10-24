
import java.util.ArrayList;

/**
 * DoctorManager class to add, update, select, search Doctor.
 *
 * @version 23/06/2026
 * @author TuanPHAHE194741
 */
public class DoctorManager {

    /**
     * Encapsulation: keep doctors use in DoctorManager class.
     */
    private ArrayList<Doctor> doctors = new ArrayList<>();

    /**
     * Method check code is exists.
     *
     * @param code data from user enter.
     * @return true or false value.
     */
    public boolean checkCode(String code) {
        for (Doctor dt : doctors) {
            if (dt.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method add doctor to list.
     *
     * @param doctor data from user enter.
     * @return true value.
     */
    public boolean addDoctor(Doctor doctor) {
        doctors.add(doctor);
        return true;
    }

    /**
     * Method update doctor by code.
     *
     * @param updateDoctor data from user enter.
     * @return true or false value.
     */
    public boolean updateDoctor(Doctor updateDoctor) {

        // Check doctors empty.
        if (doctors.isEmpty()) {
            return false;
        }

        for (Doctor dt : doctors) {
            if (dt.getCode().equalsIgnoreCase(updateDoctor.getCode())) {

                //Check updateName is blank.
                if (!updateDoctor.getName().equalsIgnoreCase("")) {
                    dt.setName(updateDoctor.getName());
                }

                //Check updateSpecialization is blank.
                if (!updateDoctor.getSpecialization().equalsIgnoreCase("")) {
                    dt.setSpecialization(updateDoctor.getSpecialization());
                }

                //Check updateAvailability is blank.
                if (updateDoctor.getAvailability() != -1) {
                    dt.setAvailability(updateDoctor.getAvailability());
                }
            }
        }
        return true;
    }

    /**
     * Method delete doctor by code.
     *
     * @param deleteDoctor code from user enter.
     * @return true or false value.
     */
    public boolean deleteDoctor(String deleteCode) {

        // Check doctors empty.
        if (doctors.isEmpty()) {
            return false;
        }
        Doctor foundFromCode = null;
        for (Doctor dt : doctors) {

            // Check code to found data need remove.
            if (dt.getCode().equalsIgnoreCase(deleteCode)) {
                foundFromCode = dt;
                break;
            }
        }

        // Remove data.
        doctors.remove(foundFromCode);
        return true;
    }

    /**
     * Method check code is exists.
     *
     * @param code data from user enter.
     * @return true or false value.
     */
    public boolean checkCodeSearch(String code) {

        // Check if code is blank.
        if (code == "") {
            return true;
        }
        for (Doctor dt : doctors) {
            if (dt.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method search doctor by code.
     *  
     * @param searchCode from user enter.
     * @return false or true value.
     */
    public boolean searchDoctor(String searchCode) {

        //Check doctors empty.
        if (doctors.isEmpty()) {
            return false;
        }
        ArrayList<Doctor> results = new ArrayList<>();

        //Check searchCode is blank then display all
        if (searchCode.equals("")) {
            results.addAll(doctors);
        } else {
            
            // Check doctor by code.
            for (Doctor dt : doctors) {
                if (dt.getCode().equalsIgnoreCase(searchCode)) {
                    results.add(dt);
                }
            }
        }
        displayResult(results);
        return true;
    }
    
    /**
     * Method display list from search by code.
     * 
     * @param results list code found.
     */
    private void displayResult(ArrayList<Doctor> results){
        System.out.printf("%-10s%-25s%-25s%-15s\n", "Code", "Name", "Specialization", "Availability");
        for(Doctor dt: results){
            System.out.printf("%-10s%-25s%-25s%-15d\n", dt.getCode(), dt.getName(), dt.getSpecialization(), dt.getAvailability());
        }
    }
}
