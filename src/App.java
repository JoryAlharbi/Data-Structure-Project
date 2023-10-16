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
              
           switch (contactCriteria) { // ask rawan about the return statement !!!!
               
               case 1:
                   String searchName = input.nextLine();
                   phonebook.search(searchName, contactCriteria);
                   break;
               case 2:
                   String searchPhoneNum = input.nextLine();
                   phonebook.search(searchPhoneNum, contactCriteria);
                   break;
               case 3: 
                   String searchEmailAddress = input.nextLine();
                   phonebook.search(searchEmailAddress, contactCriteria);
                   break;
               case 4:
                   String searchAddress = input.nextLine();
                   phonebook.search(searchAddress, contactCriteria);
                   break;
               case 5: 
                   String searchBirthday = input.nextLine();
                   phonebook.search(searchBirthday, contactCriteria);
                   break;
           }
           
          case 3:  
            
              
          case 4: 
            System.out.print("Enter event title: ");
            String eventTitle = input.nextLine();
             System.out.print("Enter contact name: ");
            String contactName = input.nextLine();
             System.out.print("Enter event date and time (MM/DD/YYYY): ");
            String dateTime = input.nextLine();
             System.out.print("Enter event location: ");
            String eventLocation = input.nextLine();
          
            // then event added successfuly after sending to the add event method
            
            
          case 5:  
            System.out.println("Enter search criteria: \n 1.Contact name \n 2. Event title ");
            eventCriteria = input.nextInt();
              
          case 6: 
              
          case 7:  
          
          case 8: break;
        
            
            
            
            
            
        }
        
        
        
        
        
        
    } while (userChoice != 8);
    
    
        
      
    
    
    
    
    
        
        
    }
}
