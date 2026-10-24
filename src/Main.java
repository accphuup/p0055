
/**
 * Main class to run program.
 *
 * @version 23/06/2026
 * @author TuanPHAHE194741
 */
public class Main {

    public static void main(String[] args) {
        DoctorManager manager = new DoctorManager();
        while (true) {
            displayMenu();
            int choice = Validate.checkUserInputSwitchCase("Choose an option: ");
            switch (choice) {

                // Case add doctor.
                case 1:
                    System.out.println("--------- Add Doctor ---------");
                    String code = Validate.checkUserInputString("Enter Code: ");
                    boolean checkAdd = manager.checkCode(code);

                    // Check if code is exists.
                    if (!checkAdd) {
                        String name = Validate.checkUserInputString("Enter Name: ");
                        String specialization = Validate.checkUserInputString("Enter Specialization: ");
                        int availability = Validate.checkUserInputInt("Enter Availability: ");

                        // Create a new Doctor object from the data you just imported.
                        Doctor doctor = new Doctor();

                        // Set data in doctor.
                        doctor.setCode(code);
                        doctor.setName(name);
                        doctor.setSpecialization(specialization);
                        doctor.setAvailability(availability);

                        // Call the function from doctorManager to add doctor to the List.
                        boolean add = manager.addDoctor(doctor);

                        if (add) {
                            System.out.println("Add doctor successful.");
                        }
                    } else {
                        System.out.println("Error.Doctor code: '" + code + "' already exists. Add failed!");
                    }
                    break;

                // Case update doctor by code.
                case 2:
                    System.out.println("--------- Update Doctor ---------");
                    String codeUpdate = Validate.checkUserInputString("Enter Code: ");
                    boolean checkUpdate = manager.checkCode(codeUpdate);

                    // Check if code is exists.
                    if (checkUpdate) {
                        String nameUpdate = Validate.checkInputUpdateString("Enter Name(If blank then not change): ");
                        String specializationUpdate = Validate.checkInputUpdateString("Enter Specialization(If blank then not change): ");
                        int availabilityUpdate = Validate.checkInputUpdateInt("Enter Availability(If blank then not change): ");

                        // Create a new Doctor object from the data you just imported.
                        Doctor doctor = new Doctor();

                        // Set data in doctor.
                        doctor.setCode(codeUpdate);
                        doctor.setName(nameUpdate);
                        doctor.setSpecialization(specializationUpdate);
                        doctor.setAvailability(availabilityUpdate);

                        //Call the function from DoctorManager to update doctor from list.
                        boolean update = manager.updateDoctor(doctor);

                        if (update) {
                            System.out.println("Update doctor successful.");
                        } else {
                            System.out.println("List is empty!");
                        }
                    } else {
                        System.out.println("Not found code to update doctor!");
                    }
                    break;

                // Case delete doctor by code.   
                case 3:
                    System.out.println("--------- Delete Doctor ---------");
                    String codeDelete = Validate.checkUserInputString("Enter code: ");
                    boolean checkDelete = manager.checkCode(codeDelete);

                    // Check if code is exists.
                    if (checkDelete) {

                        //Call the function from DoctorManager to delete doctor from list.
                        boolean delete = manager.deleteDoctor(codeDelete);

                        // Display notification.
                        if (delete) {
                            System.out.println("Delete doctor successful.");
                        } else {
                            System.out.println("List is empty!");
                        }
                    } else {
                        System.out.println("Not found code to delete doctor!");
                    }
                    break;
                    
                // Case search doctor by code.        
                case 4:
                    System.out.println("--------- Search Doctor ---------");
                    String codeSearch = Validate.checkInputUpdateString("Enter text: ");
                    boolean checkSearch = manager.checkCodeSearch(codeSearch);

                    if (checkSearch) {
                        // Call the function from DoctorManager to search in the list.
                        boolean search = manager.searchDoctor(codeSearch);
                        if (!search) {
                            System.out.println("List is empty!");
                        } else {
                            System.out.println("Found the list above.");
                        }
                    } else {
                        System.out.println("Not found code to search doctor!");
                    }
                    break;
                    
                // Case exit program.
                case 5:
                    System.out.println("Exit program...");
                    return;
            }
        }
    }

    /**
     * Method display menu choice.
     */
    public static void displayMenu() {
        System.out.println("======== Doctor Management =========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
    }
}
