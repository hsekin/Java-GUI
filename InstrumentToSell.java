import javax.swing.JLabel;

public class InstrumentToSell extends Instrument 
{
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;
    
    public InstrumentToSell(String instrumentName,int price)
    {
        super(instrumentName);
        this.price=price;
        this.sellDate="";
        this.discountPercent=0;
        this.isSold=false;
    }
    public void setPrice(int price)
    {
    if(isSold==false) {
            this.price=price;
        }
        else {
            System.out.println("The instrument is  sold.");
        }
    }
    public void setSellDate(String sellDate)
    {
        this.sellDate=sellDate;
    }
    public void setDiscountPercent(int discountPercent)
    {
        this.discountPercent=discountPercent;
    }
    public void setIsSold(boolean isSold)
    {
        this.isSold=isSold;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getSellDate()
    {
        return this.sellDate;
    }
    public int getDiscountPercent()
    {
        return this.discountPercent;
    }
    public boolean getIsSold()
    {
        return this.isSold;
    }
    public void sellInstrument(String customerName, String customerMobileNumber, int customerPAN, String sellDate,int discountPercent)
    {
        if(isSold==true) {
            System.out.println("The Instrument is sold to "+super.getCustomerName());
            System.out.println("Contact number: "+super.getCustomerMobileNumber());
            System.out.println("Customer PAN number: "+super.getCustomerPAN());

        }
        else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.sellDate=sellDate;
            this.discountPercent=discountPercent;
            this.isSold=true;
            this.price=price - (price*discountPercent/100);
        }
    }
    public void display()
    {
        super.display();
        System.out.println("The price of the instrument is "+this.price);
        if(isSold==true) {
            System.out.println("The instrument is sold to "+super.getCustomerName()+" on "+this.sellDate );
        }
    }
    public static void main(String[] args)
    {
        InstrumentToSell obj=new InstrumentToSell("Cajon",3000);
        obj.sellInstrument("Pukar","9873737373",134,"jan 12",20);
        obj.display();
    }
    public void sell(JLabel customerName, JLabel customerPhoneNo, JLabel customerPanNo, String sellDate2,
            Object discountPercentage) {
    }

}