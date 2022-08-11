import java.util.*;

public class Main 
{
   public static void main(String[] args) 
   {
      String name,address,phone,id;
      double spending,mail;
      boolean mailList;
       
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name: ");
      name = input.nextLine();
      System.out.println("Enter address: ");
      address = input.nextLine();
      System.out.println("Enter phone number: ");
      phone = input.nextLine();
      System.out.println("Enter Customer Id : ");
      id = input.nextLine();
      System.out.println("Receive mail? Press 1 for yes or 2 for no");
      mail = input.nextDouble();
      if(mail == 1)
      {
         mailList = true;
      }
      else 
      {
         mailList = false;
      }
      System.out.println("Enter net spending amount: ");
      spending = input.nextDouble();
      
   
   
      PreferredCustomer customer = new PreferredCustomer(name, address, phone,id, mailList, spending);
   
      System.out.println("\nCustomer Number " + customer.getCustomerNumber() + "\n" +                          
                           "Name: " + customer.getName() + "\n" +
                           "Address: " + customer.getAddress() + "\n" +
                           "Telephone: " + customer.getPhoneNumber() + "\n" +
                           "On mailing list: " + customer.getMailOnOff() + "\n" +
                           "Amount: " + customer.getPurchase() + "\n" +
                           "Discount level: " + customer.getDiscount());   
   }
}