public class InstrumentToRent extends Instrument
{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    private int quantity;

    public InstrumentToRent(String instrumentName, int chargePerDay)
    {
        super(instrumentName);
        this.chargePerDay=chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
    }
    public void setChargePerDay(int chargePerDay)
    {
        this.chargePerDay=chargePerDay;
    }
    public void setDateOfRent(String dateOfRent)
    {
        this.dateOfRent=dateOfRent;
    }
    public void setDateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn=dateOfReturn;
    }
    public void setNoOfDays(int noOfDays)
    {
        this.noOfDays=noOfDays;
    }
    public void setIsRented(boolean isRented)
    {
        this.isRented=isRented;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getChargePerDay()
    {
        return this.chargePerDay;
    }
    public String getDateOfRent()
    {
         return this.dateOfRent;
    }
    public String getDateOfReturn()
    {
        return this.dateOfReturn;
    }
    public int getNoOfDays()
    {
         return this.noOfDays;
    }
    public boolean getIsRented()
    {
         return this.isRented;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void rent(String customerName,String customerMobileNumber,int customerPAN,String rentedDate,String returnedDate, int noOfRentedDays)
    {
        if(isRented==true) {
            System.out.println("The Instrument is Already Rented by "+super.getCustomerName()+" and will return it on "+getDateOfReturn());
            System.out.println("Contact: "+super.getCustomerMobileNumber());
        }
        else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.dateOfRent=rentedDate;
            this.dateOfReturn=returnedDate;
            this.noOfDays=noOfRentedDays;
            this.isRented=true;
            this.quantity=1;
            System.out.println("Instrument Rented Successfully..");
            System.out.println("Rented By: "+customerName);
            System.out.println("Mobile Number: "+customerMobileNumber);
            System.out.println("Date Of Renting: "+rentedDate);
            System.out.println("Return Date: "+returnedDate);
            System.out.println("No of Days: "+noOfRentedDays);
            System.out.println("Total Charge: "+chargePerDay*noOfRentedDays*quantity);
        }
    }
    public void returnInstrument()
    {
        if(isRented==false) {
            System.out.println("The Instrument is not rented.");
        }
        else {
            super.setCustomerName("");
            super.setCustomerMobileNumber("");
            super.setCustomerPAN(1);
            this.setDateOfReturn("");
            this.setDateOfRent("");
            this.setNoOfDays(1);
            this.setIsRented(false);
        }
    }
    public void display()
    {
        super.display();
        if(isRented==true) {
            System.out.println("Instrument is already rented...");
            System.out.println("Rented By: "+super.getCustomerName());
            System.out.println("Contact: "+super.getCustomerMobileNumber());
            System.out.println("Rented date: "+getDateOfRent());
            System.out.println("Will return on: "+getDateOfReturn());
          
        }
    
    }
    public static void main(String[] args) 
    {
        InstrumentToRent obj=new InstrumentToRent("Cajon.", 3000);
        obj.rent("Jack willam","980004332",8,"Aprill 28","May 02",5);
        obj.returnInstrument();
        obj.display();    
    }
}