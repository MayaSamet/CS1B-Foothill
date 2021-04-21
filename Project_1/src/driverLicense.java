/**
 *
 * @author MayaSamet
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class driverLicense {

    // *** variables ***
    // instance variables - initialize them with defaults
    String name = "Molly Baloney";
    public String address = "12345 El Monte Road, Los Altos Hills, CA 94022";
    String height = "5\'8\"";
    int weight = 140;
    String hairColor = "Brown";
    String eyeColor = "Green";
    String driverLicenseNumber = "None";

    // static variable
    private static int licenseCount = 1000;

    // *** constructors ***
    // copy constructor
    public driverLicense(driverLicense license){
        setName(license.name);
        setAddress(license.address);
        setHeight(license.height);
        setWeight(license.weight);
        setHairColor(license.hairColor);
        setEyeColor(license.eyeColor);
        setDriverLicenseNumber(license.driverLicenseNumber);
    }

    // 2 overloaded constructors
    public driverLicense(String address,
                         String name,
                         String height,
                         int weight){
        numberGenerator(address);
        setAddress(address);
        setName(name);
        setHeight(height);
        setWeight(weight);
        licenseCount++;
    }

    public driverLicense(String address,
                         String name,
                         String eyeColor,
                         String hairColor){
        numberGenerator(address);
        setAddress(address);
        setName(name);
        setEyeColor(eyeColor);
        setHairColor(hairColor);
        licenseCount++;
    }


    // numberGenerator method
    public void numberGenerator(String address){
        // match state initials by looking for 2 capital letters surrounded by a word boundary
        Pattern p = Pattern.compile("(\\b[A-Z]{2}\\b)");
        Matcher m = p.matcher(address);
        if (m.find()) {
           setDriverLicenseNumber(m.group(1) + licenseCount);
        }
    }

    // method calling accessor and mutator for testing purposes
    public void dataPrinter(){
        System.out.println("***************************************************");
        System.out.println("Driver License Data for " + this.getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Hair Color: " + this.getHairColor());
        System.out.println("Eye Color: " + this.getEyeColor());
        System.out.println("Driver License Number: " + this.getDriverLicenseNumber());
        System.out.println("***************************************************");
    }

    // accessor and mutator methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
