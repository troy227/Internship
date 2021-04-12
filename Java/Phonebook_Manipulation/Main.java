package Phonebook_Manipulation;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Display all contacts");
        System.out.println("3.Search contact by phone");
        System.out.println("4.Remove contact");
        System.out.println("5.Exit");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        PhoneBook pb=new PhoneBook();
        switch(choice){
            case 1:
            System.out.println("1.Add Contact");
            System.out.println("Enter the First Name: ");
            String firstName=sc.nextLine();
            System.out.println("Enter the Last Name: ");
            String lastName=sc.nextLine();
            System.out.println("Enter the Phone No.: ");
            long phoneNumber=sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the Email: ");
            String email=sc.nextLine();
            Contact obj=new Contact(firstName,lastName,phoneNumber,email);
            pb.addContact(obj);
            break;

            case 2:
            System.out.println("The contacts in your list are:");
            List<Contact> contactList=pb.viewAllContacts();
            for(Contact c:contactList){
            System.out.println("First Name: "+ c.getFirstName());
            System.out.println("Last Name: "+ c.getLastName());
            System.out.println("Phone No.: "+ c.getPhoneNumber());
            System.out.println("Email: "+c.getEmailId());
            }
            
            break;


            case 3:
            System.out.print("Enter the Phone number to search contact:");
            long searchPhone=sc.nextLong();
            sc.nextLine();
            System.out.println("The contact is:");
            Contact find=pb.viewContactGivenPhone(searchPhone);
            System.out.println("First Name: "+find.getFirstName());
            System.out.println("Last Name: "+find.getLastName());
            System.out.println("Phone No.: "+find.getPhoneNumber());
            System.out.println("Email: "+find.getPhoneNumber());
            break;

            case 4:
            System.out.println("Enter the Phone number to remove :");
            long removePhone=sc.nextLong();
            sc.nextLine();
            System.out.println("Do you want to remove the contact(Y/N)");
            String option=sc.next();
            if(option.equals("Y")){
                pb.removeContact(removePhone);
                System.out.println("The contact is successfully deleted.");

            }
            
            break;
            
            case 5:
            break;
        }
        
        }
        
    }
        
    
}
