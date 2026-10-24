
/**
 * Doctor class to declare object.
 * 
 * @version 23/06/2026
 * @author TuanPHAHE194741
 */
public class Doctor {
    
    /**
     * Attribute code;
     */
    private String code;
    
    /**
     * Attribute name;
     */
    private String name;
    
    /**
     * Attribute specialization;
     */
    private String specialization;
    
    /**
     * Attribute availability;
     */
    private int availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
}
