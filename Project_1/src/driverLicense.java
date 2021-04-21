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
    public String address = "12345 El Monte Road, Los Altos Hills, CA 12345";
    String height = "5\'8\"";
    int weight = 130;
    String hairColor = "Pink";
    String eyeColor = "Brown";
    String driverLicenseNumber = "None";

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
    public driverLicense(String address, String name, String height, int weight){
        numberGenerator(address);
        this.address = address;
        this.name = name;
        this.height = height;
        this.weight = weight;
        licenseCount++;
    }

    public driverLicense(String address, String name, String eyeColor, String hairColor){
        numberGenerator(address);
        this.address = address;
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        licenseCount++;
    }


    // numberGenerator method
    public void numberGenerator(String address){
        //String state = address.substring(Math.max(address.length() - 2, 0));
        //this.driverLicenseNumber = state + licenseCount;

        // match state initials by looking for 2 capital letters surrounded by a word boundary
        Pattern p = Pattern.compile("(\\b[A-Z]{2}\\b)");
        Matcher m = p.matcher(address);
        if (m.find()) {
            this.driverLicenseNumber = m.group(1) + licenseCount;
        }
    }

    // accessor and mutator methods
}
