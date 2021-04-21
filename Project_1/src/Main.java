/**
 *
 * @author MayaSamet
 */

public class Main {
    public static void main(String[] args) {
        // create 3 objects of the driverLicense class using both overloaded constructors
        driverLicense austinLicense = new driverLicense("CA", "Austin McEver", 203);
        System.out.println(austinLicense.driverLicenseNumber+austinLicense.weight);

        driverLicense alyssaLicense = new driverLicense("CA", "Alyssa Takahashi", "Brown");
        System.out.println(alyssaLicense.driverLicenseNumber+alyssaLicense.eyeColor);
        // almaLicense = ;

        // call all mutator and accessor methods for testing purposes

        // create a copy of one of the objects using the copy constructor

    }
}
