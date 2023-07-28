import java.util.Scanner;
public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("WELCOME ADDRESS BOOK SYSTEM");
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
        contact.addressBook(contact);
while(true){
    System.out.println("" +
            "1:Add new Address Book " +
            "2:Save Address Book to file" +
            "3: load Address book From file" +
            "4:Exit");
    System.out.println("Enter the choice :");
    int choice = sc.nextInt();
    switch (choice){
        case 1 :
            contact.addressBook(contact);
            break;
        case 2:
            System.out.println("Enter the file name to save the address book :");
            String saveFileName =sc.next();
            contact.saveToFile(saveFileName);
            break;
        case 3:
            System.out.print("Enter the file name to load the address book :");
            String loadFromFile = sc.next();
            contact.loadFromFile(loadFromFile);
            break;

        case 4 :
            System.out.println("Existing the address book system");
            System.exit(0);

        default:
            System.out.println("you have entered an invalid choice.");

    }
                }
            }
        }

