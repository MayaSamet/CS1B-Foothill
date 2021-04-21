/**
 *
 * @author MayaSamet
 */

public class Main {
    public static void main(String[] args) {
        // create 3 objects of the driverLicense class using both overloaded constructors
        driverLicense austinLicense = new driverLicense(
                "Lenoir City, TN",
                "Austin McEver",
                "6\'2\"",
                203);
        System.out.println(austinLicense.driverLicenseNumber+austinLicense.weight);

        driverLicense alyssaLicense = new driverLicense(
                "New York, NY",
                "Alyssa Takahashi",
                "Brown",
                "Black");
        System.out.println(alyssaLicense.driverLicenseNumber+alyssaLicense.eyeColor+alyssaLicense.height);

        driverLicense almaLicense = new driverLicense("3272 Smooth Pebble St, Palo Alto, CA 94303",
                "Alma Morales",
                "Blue",
                "Red");
        System.out.println(almaLicense.driverLicenseNumber+almaLicense.eyeColor+almaLicense.name);


        // create an object using the copy constructor
        driverLicense alyssaLicenseCopy = new driverLicense(alyssaLicense);
        System.out.println(alyssaLicenseCopy.driverLicenseNumber
                + alyssaLicenseCopy.eyeColor
                + alyssaLicenseCopy.hairColor);
        // almaLicense = ;

        // call all mutator and accessor methods for testing purposes

        // create a copy of one of the objects using the copy constructor

    }
}
