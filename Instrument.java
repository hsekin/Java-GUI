public class Instrument
{
    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPAN;
    
    public Instrument(String instrumentName)
    {
        instrumentID += 1;
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerMobileNumber = "";
        this.customerPAN = 0;
    }
        public void setInstrumentName(String instrumentName)
        {
            this.instrumentName = instrumentName;
        }
		
        public void setCustomerName(String customerName)
        {
            this.customerName = customerName;
        }
        public void setCustomerMobileNumber(String customerMobileNumber)
        {
            this.customerMobileNumber = customerMobileNumber;
        }
        public void setCustomerPAN(int customerPAN)
        {
            this.customerPAN = customerPAN;
        }
        public int getInstrumentID()
        {
            return instrumentID;
        }
        public String getInstrumentName()
        {
            return this.instrumentName;
        }
        public String getCustomerName()
        {
            return this.customerName;
        }
        public String getCustomerMobileNumber()
        {
            return this.customerMobileNumber;
        }
        public int getCustomerPAN()
        {
            return this.customerPAN;
        }
        public void display()
        {
            System.out.println("The instrument Id is "+instrumentID+" and the name of Instrument is "+this.instrumentName);
            if
                (!customerName.equals("") && !customerMobileNumber.equals("") && customerPAN!=(0)) 
            {
                System.out.println("Customer name: "+this.customerName);
                System.out.println("Mobile no.:"+this.customerMobileNumber);
                System.out.println("Customer PAN no.:"+this.customerPAN);
            }
        }
            public static void main(String[] args)
            {
                Instrument obj = new Instrument("Cajon.");
                obj.setCustomerName("jack willam");
                obj.setCustomerMobileNumber("980004332");
                obj.setCustomerPAN(5);
                obj.display();
            }
            // public Object getaddInstrumentNameToSellLbl() {
            //     return null;
            // }
    }