
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain
{
 public static void main(String[] args)
    {

      //  Linkedlist <Contacts>linkedList = new Linkedlist<>();
        LinkedList <Contacts> linkedList = new LinkedList<>();
        Scanner scann = new Scanner(System.in);
        int choice=1;

        while(choice!=0) ///
        {
            Contacts contacts = new Contacts();

            System.out.println("");
            System.out.println("Enetr your choice");
            System.out.println("1 : Insert the Contacts");
            System.out.println("2 : Display all address in contact book");
            System.out.println("3 : Edit existing contact person using their name");
            System.out.println("4 : Delete existing contact person using their name");
            System.out.println("9 : Terminate the application");


            choice = scann.nextInt();

           // String poss;
            switch(choice)
            {
                case 1 :



                    System.out.println("Enter the first name");
                    contacts.setFirstName(scann.next());

                    System.out.println("Enter the last name");
                    contacts.setLastnames(scann.next());

                    System.out.println("Enter the address");
                    contacts.setAddress(scann.next());

                    System.out.println("Enter the city");
                    contacts.setCity(scann.next());

                    System.out.println("Enter the state");
                    contacts.setState(scann.next());


                    System.out.println("Enter the email");
                    contacts.setEmail(scann.next());

                    System.out.println("Enter the zip");
                    contacts.setZip(scann.nextInt());

                    System.out.println("Enter the phone number");
                    contacts.setPhoneNumber(scann.nextLong());

                    linkedList.add(contacts);


                    //insertInfo.insertData(firstName,lastName,address,city,state,email,zip,phoneNumber);
                break;
                case 2:
                    for(int counter=0; counter<linkedList.size(); counter++)
                    {


                        System.out.println("-- Display "+(counter+1)+" Person in Address Book----------");
                        System.out.println(" First name :"+linkedList.get(counter).getFirstName());
                        System.out.println(" Last name  :"+linkedList.get(counter).getLastnames());
                        System.out.println(" Address    :"+linkedList.get(counter).getAddress());
                        System.out.println(" City       :"+linkedList.get(counter).getCity());
                        System.out.println(" State      :"+linkedList.get(counter).getState());
                        System.out.println(" Email ID   :"+linkedList.get(counter).getEmail());
                        System.out.println(" Zip        :"+linkedList.get(counter).getZip());
                        System.out.println(" Phone no   :"+linkedList.get(counter).getPhoneNumber());
                    }
                break;
                case 3:
                    System.out.println("Enter the first name that you want to edit in address book");
                    String checkName = scann.next();
                    for(int counter=0; counter<linkedList.size(); counter++)
                    {

                        if((linkedList.get(counter).getFirstName()).equals(checkName))
                        {
                            System.out.println("Enter the first name");
                            linkedList.get(counter).setFirstName(scann.next());

                            System.out.println("Enter the last name");
                            linkedList.get(counter).setLastnames(scann.next());

                            System.out.println("Enter the address");
                            linkedList.get(counter).setAddress(scann.next());

                            System.out.println("Enter the city");
                            linkedList.get(counter).setCity(scann.next());

                            System.out.println("Enter the state");
                            linkedList.get(counter).setState(scann.next());


                            System.out.println("Enter the email");
                            linkedList.get(counter).setEmail(scann.next());

                            System.out.println("Enter the zip");
                            linkedList.get(counter).setZip(scann.nextInt());

                            System.out.println("Enter the phone number");
                            linkedList.get(counter).setPhoneNumber(scann.nextLong());
                        }

                    }
                break;
                case 4:
                    System.out.println("Enter the first name that you want to delete contact in address book");
                    String checkNameForDelete = scann.next();
                    for(int counter=0; counter<linkedList.size(); counter++)
                    {

                        if((linkedList.get(counter).getFirstName()).equals(checkNameForDelete))
                        {
                            linkedList.remove(counter);
                            System.out.println();
                            System.out.println("Delete contact Successful");
                        }

                    }
                break;


                case 9:
                    choice=0;
                break;
            }

        }

    }

}
