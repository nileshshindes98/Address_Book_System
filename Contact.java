import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    ArrayList<UserData> userData = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    //create method to add Contact
    public void addUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Contact Number: ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter Email_ID: ");
        String emailID = sc.next();

        System.out.print("Enter Address: ");
        String address = sc.next();

        System.out.print("Enter City Name: ");
        String cityName = sc.next();

        System.out.print("Enter StateName: ");
        String stateName = sc.next();

        System.out.print("Enter Postal Code(Zip Code): ");
        int zipCode = sc.nextInt();

        //all data store in list
        UserData data = new UserData(firstName, lastName, phoneNumber, emailID, address, cityName, stateName, zipCode);
        userData.add(data);


    }

    //create method for display added contact

    public void display() {
        System.out.println(userData.size());
        if (userData.size() == 0) {
            System.out.println("No Data Found....Empty Address Book ");
            System.out.println();
        } else {
            for (int i = 0; i < userData.size(); i++) {
                UserData data = (UserData) userData.get(i);
                System.out.println(userData.get(i));
                System.out.println(" ");
            }
        }
    }
    public void update() {
        System.out.println("Enter First And Last Name to Update details ");
        String first_name = sc.next();
        String last_name = sc.next();

        for (int i = 0; i < userData.size(); i++) {
            UserData data = userData.get(i);

            if (first_name.equals(data.firstName) && last_name.equals(data.lastName)) {
                System.out.println("Enter Choice to Update\nEnter 1 for Update Address\n Enter 2 for contact Number \n " + "Enter 3 for Email adderss ");
                int choice =  sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Address: ");
                        String newAddress = sc.next();

                        System.out.print("Enter City Name: ");
                        String newCity = sc.next();

                        System.out.print("Enter State: ");
                        String newState = sc.next();

                        System.out.print("Enter postal code(Zip Code): ");
                        int zip = sc.nextInt();
                        break;

                    case 2:
                        System.out.print("Enter Contact Number: ");
                        long newNumber = sc.nextLong();
                        break;

                    case 3:
                        System.out.print("Enter Email ID: ");
                        String newEmail = sc.next();
                        break;


                }
            }
            else
                System.out.println("No record Found ");
        }
        System.out.println();
    }

    //create method for delete contact
    public void deleteContact() {
        if (userData.size() == 0) {
            System.out.println("No Record Found...Empty Address Book");
        }

        else {
            System.out.print("ENter First Name to delete Contact from addressBook: ");
            String first_name =  sc.next();
            for (int i = 0; i < userData.size(); i++) {
                UserData data = userData.get(i);
                if (first_name.equals(data.firstName)) {
                    userData.remove(i);
                    System.out.println("Contact Delete SuccessFully...");
                }
            }
         }
       }
    }
