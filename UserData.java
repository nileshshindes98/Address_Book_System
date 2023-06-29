public class UserData {

        //declare user contact details data
        String firstName;
        String lastName;
        long phoneNumber;
        String emailID;
        String address;
        String cityName;
        String stateName;
        int zipCode;



        //Constructor created
        public UserData(String firstName, String lastName, long phoneNumber, String emailID, String address, String cityName, String stateName, int zipCode) {
            //assign parameter
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.emailID = emailID;
            this.address = address;
            this.cityName = cityName;
            this.stateName = stateName;
            this.zipCode = zipCode;
        }


    /*public String toString() {
        return "Address Book ::  " +
                " " + firstName +
                " " + lastName +
                " " + phoneNumber +
                " " + emailID +
                " " + address +
                " " + cityName +
                " " + stateName +
                " " + zipCode + "\n";



    }

     */

        public String toString() {
            System.out.println();
            return "First Name: " + firstName + " \nLast Name: " + lastName + " \nContact number: "+ phoneNumber + " \nEmail ID: " + emailID + " \nAddress: " + address + " \nCity Name: " + cityName + " \nState Name: " + stateName + " \nPostal Code(Zip Code): " + zipCode + "\n";

        }

    }

