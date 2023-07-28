import java.io.Serializable;

public class UserData implements Serializable {

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
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

