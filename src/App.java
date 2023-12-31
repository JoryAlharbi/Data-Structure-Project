package s.project1;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);  // to read from the user
    Phonebook phonebook = new Phonebook(); //created a new phonebook for the user 
    int userChoice,  contactCriteria, eventCriteria;
    
    do {
        // showing the menu for the user
     System.out.println("Welcome to the Linked Tree Phonebook! \n Please choose an option:");  
         System.out.println("1. Add a contact");  
         System.out.println("2. Search for a contact");  
         System.out.println("3. Delete a contact");  
         System.out.println("4. Schedule an event");  
         System.out.println("5. Print event details");  
         System.out.println("6. Print contacts by first name");  
         System.out.println("7. Print all events alphabetically");  
         System.out.println("8. Exit");
         System.out.print("Enter your choice:");
  
        userChoice = input.nextInt(); // user enter their choice 
        
        switch (userChoice) { // based on their choice, 'switch' will direct them to the right code
            
          case 1: // 1. user is asked to fill the new contact info
              System.out.print("Enter the contact's name: ");
              String name = input.nextLine(); // nextLine because of print
              System.out.print("Enter the contact's phone number: ");
              String phoneNumber = input.nextLine();
              System.out.print("Enter the contact's email address: ");
              String emailAddress = input.nextLine();
              System.out.print("Enter the contact's address: ");
              String address  = input.nextLine();
              System.out.print("Enter the contact's birthday: ");
              String birthday = input.nextLine();
              System.out.print("Enter any notes for the contact: ");
              String notes = input.nextLine();
              
              Contacts contact = new Contacts(name,phoneNumber,emailAddress,address,birthday,notes); // 2. create a new contact obj
              
             if ( phonebook.AddContact(contact) ) // sending the new obj to the 'add method'
              System.out.println("Contact added successfully"); // the add method return true if the contact is added successfully
             
             break;
              
          case 2: // user choose what they want to base their search on 
              System.out.println("Choose search critiria: ");
              System.out.println("1. Name: ");
              System.out.println("2. Phone Number: ");
              System.out.println("3. Email Address: ");
              System.out.println("4. Address: ");
              System.out.println("5. Birthday: ");
              
              contactCriteria = input.nextInt(); // user choice 
              
           switch (contactCriteria) { 
               
               case 1:
                   String searchName = input.nextLine();
                   if (! phonebook.search(searchName, contactCriteria)) 
                       System.out.println("Contact not found");
                   break;
               case 2:
                   String searchPhoneNum = input.nextLine();
                  if (!phonebook.search(searchPhoneNum, contactCriteria))
                            System.out.println("Contact not found");
                   break;
               case 3: 
                   String searchEmailAddress = input.nextLine();
                 if (!phonebook.search(searchEmailAddress, contactCriteria))
                           System.out.println("Contact not found");
                   break;
               case 4:
                   String searchAddress = input.nextLine();
                   if (!phonebook.search(searchAddress, contactCriteria))
                             System.out.println("Contact not found");
                   break;
               case 5: 
                   String searchBirthday = input.nextLine();
                  if (!phonebook.search(searchBirthday, contactCriteria))
                            System.out.println("Contact not found");
                   break;
           }
           
           break; 
           
          case 3: 
              System.out.print("Enter the name of the contact you want to delete: ");
              String nameToDelete = input.nextLine();
              
              Delete(nameToDelete);
              
            break;
              
          case 4: 
            System.out.print("Enter event title: ");
            String eventTitle = input.nextLine();
            System.out.print("Enter contact name: ");
            String contactName = input.nextLine();
             System.out.print("Enter event date and time (MM/DD/YYYY): ");
            String dateTime = input.nextLine();
             System.out.print("Enter event location: ");
            String eventLocation = input.nextLine();
            System.out.print("Enter event location: ");
            String eventLocation = input.nextLine();
            
          Event e = new Event(eventTitle, dateTime,eventLocation,contactName);
          
           if (AddEvent(e))
               System.out.println("Event added successfully");
           else 
                System.out.println("There is a time conflict with other event! please choose another time");
            
            break; 
            
          case 5:  
            System.out.println("Enter search criteria: \n 1.Contact name \n 2. Event title "); // user need to choose what do they want to base their search on 
            eventCriteria = input.nextInt();
            
          if (eventCriteria == 1 ) // search based on contact name
          { System.out.print("Enter contact name:");
          String cName = input.nextLine();         
          if(! searchEvent(cName,eventCriteria));
             System.out.print("Could not find any events scheduled with this contact");
          }      // end if
         
          if (eventCriteria == 2 ) // search based on event title
          {    System.out.print("Enter the title of your event: ");
           String eTitle = input.nextLine();
             if(! searchEvent(eTitle,eventCriteria));
             System.out.print("Could not find this event ");
          }      // end if
        
            break;
              
          case 6: 
              System.out.print("Enter the first name: ");
              String firstName = input.nextLine();
                 phonebook.printallContacts_ByFisrtName(firstName); 
                      break;
          case 7: 
          phonebook.PrintEvent();
          
       break;
            
            
        }
        
        
                 System.out.print("Enter your choice:");
                 userChoice = input.nextInt();
        
        
    } while (userChoice != 8);
    
        
        
    }
}
