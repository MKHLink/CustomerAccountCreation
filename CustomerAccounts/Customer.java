public class Customer extends Person 
{
   String customerNumber;
   boolean mailingList;

   public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean mailingList) 
   {
      super(name, address, telephoneNumber);
      this.customerNumber = customerNumber;
      this.mailingList = mailingList;
   }

   public void setCustomerNumber(String customerNumber) 
   {
      this.customerNumber = customerNumber;
   }

   public void setMailOnOff(boolean mailingList) 
   {
      this.mailingList = mailingList;
   }

   public boolean getMailOnOff() 
   {
      return mailingList;
   }

   public String getCustomerNumber() 
   {
      return customerNumber;
   }

   public String toString() 
   {
      String customer = super.toString() + "\nCustomer Number: " + getCustomerNumber() + "\nCustomer MailList: "+ getMailOnOff();
      return customer;
   }
}