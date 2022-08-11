public class PreferredCustomer extends Customer 
{
   double purchase;
   double discount;

   public PreferredCustomer(String name, String address, String telephoneNumber, String customerNumber,boolean mailingList, double purchase) 
   {
      super(name, address, telephoneNumber, customerNumber, mailingList);
      this.purchase = purchase;

      if (purchase >= 2000)
      setDiscount(10);

      else if (purchase >= 1500)
      setDiscount(7);

      else if (purchase == 1000)
      setDiscount(6);

      else if (purchase >= 500)
      setDiscount(5);
   }

   public void setPurchase(double purchase) 
   {
      this.purchase = purchase;
   }

   private void setDiscount(double discount) 
   {
      this.discount = discount;
   }

   public double getPurchase() 
   {
      return purchase;
   }

   public double getDiscount() 
   {
      return discount;
   }

   public String toString()
   {
      String preferredCustomer = super.toString() + "\nPurchase" + getPurchase() + "\nDiscount " + getDiscount();
      return preferredCustomer;
   }
}