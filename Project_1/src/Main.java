/**
 *
 * @author MayaSamet
 */

public class Main {
    public static void main(String[] args) {
        // create 3 objects of the driverLicense class using both overloaded constructors
        driverLicense austinLicense = new driverLicense(
                "Knoxville, TN",
                "Austin McEver",
                "6\'2\"",
                203);

        driverLicense alyssaLicense = new driverLicense(
                "1337 Mystery Ave, New York, NY",
                "Alyssa Takahashi",
                "Brown",
                "Black");

        driverLicense almaLicense = new driverLicense(
                "4321 Smooth Pebble St, Palo Alto, CA 94303",
                "Alma Yehezkely",
                "Brown",
                "Red");

        // create a copy of one of the objects using the copy constructor
        driverLicense alyssaLicenseCopy = new driverLicense(alyssaLicense);

        // call all mutator and accessor methods for testing purposes
        austinLicense.dataPrinter();
        alyssaLicense.dataPrinter();
        almaLicense.dataPrinter();
        alyssaLicenseCopy.dataPrinter();


    }

}
