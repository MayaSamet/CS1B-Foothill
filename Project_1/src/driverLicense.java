/**
 *
 * @author MayaSamet
 */

public class driverLicense {
    // *** variables ***
    // instance variables
    String name;
    public String address;
    String height;
    int weight;
    String hairColor;
    String eyeColor;
    String driverLicenseNumber;

    // static variable
    private static int licenseCount = 1000;

    // *** constructors ***
    // copy constructor
    public driverLicense(driverLicense license){
        this.name = license.name;
        this.address = license.address;
        this.height = license.height;
        this.weight = license.weight;
        this.hairColor = license.hairColor;
        this.eyeColor = license.eyeColor;
        this.driverLicenseNumber = license.driverLicenseNumber;
    }

    // 2 overloaded constructors
    public driverLicense(String address, String name, int weight){
        numberGenerator(address);
        this.address = address;
        this.name = name;
        this.weight = weight;
        licenseCount++;
    }

    public driverLicense(String address, String name, String eyeColor){
        numberGenerator(address);
        this.address = address;
        this.name = name;
        this.eyeColor = eyeColor;
        licenseCount++;
    }


    // numberGenerator method
    public void numberGenerator(String address){
        String state = address.substring(Math.max(address.length() - 2, 0));
        this.driverLicenseNumber = state + licenseCount;
    }

    // accessor and mutator methods
}
