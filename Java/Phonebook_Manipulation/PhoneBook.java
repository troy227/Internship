package Phonebook_Manipulation;
import java.util.*;
public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();
    
    public void setPhoneBook(List<Contact> pb){
        this.phoneBook=pb;
    }

    public List<Contact> getPhoneBook(){
        return phoneBook;
    }

    public void addContact(Contact contactObj){
        getPhoneBook().add(contactObj);
    }

    public List<Contact> viewAllContacts(){
        return getPhoneBook();
    }

    public Contact viewContactGivenPhone(long phoneNumber){
        for(Contact obj: getPhoneBook()){
            if(obj.getPhoneNumber()==phoneNumber){
                return obj;
            }
            
        }
        return null;

    }
    public boolean removeContact(long phoneNumber){
        for(Contact obj: getPhoneBook()){
            if(obj.getPhoneNumber()==phoneNumber){
            getPhoneBook().remove(obj);
            return true;

            }
        }
        return false;

    }
}
