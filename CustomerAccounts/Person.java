public class Person 
{
   String name;
   String address;
   String telephoneNumber;

   public Person(String name, String address, String telephoneNumber) 
   {
      this.name = name;
      this.address = address; 
      this.telephoneNumber = telephoneNumber;
   }  

   public Person()
   {
      this.name = "";
      this.address = "";
      this.telephoneNumber = "";
   }

   public void setName(String name) 
   {
      this.name = name;
   }

   public void setAddress(String address) 
   {
      this.address = address;
   }

   public void setTelephoneNumber(String telephoneNumber)   
   {
      this.telephoneNumber = telephoneNumber;
   }

   public String getName() 
   {
      return name;
   }

   public String getAddress()
   {
      return address;
   }

   public String getPhoneNumber() 
   {
      return telephoneNumber;
   }

   public String toString() 
   {
      String person = "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhoneNumber: " + getPhoneNumber();
      return person;
   }
}