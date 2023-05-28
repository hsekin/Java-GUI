
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SarangiSansar {

  protected static final int EMPTY = 0;
  protected static final int INVALID = -1;
  private JFrame frame;
  private JPanel cpanel;
  private JMenuBar menubar1;
  private JMenu themeMenu;
  private JMenuItem themeItem;
  private JMenuItem themeItem2;
  private ImageIcon image;
  private JLabel title;
  private JPanel panel1;
  private TitledBorder titleBorder;
  private TitledBorder titledBorder2;
  private JLabel instrumentNameToRent;
  private JTextField instrumentNameToRentTextField;
  private JLabel NoODay;
  private JTextField NumberOfDaysRentedTextField;
  private JButton rentInstrumentButton;
  private JPanel panel2;
  private JLabel instrumentNameToSell;
  private JTextField instrumentNameToSellTextField;
  private JTextField instrumentPriceATextField;
  private JLabel instrumentPriceA;
  private JLabel customerNameR;
  private JTextField customerNameTf;
  private JLabel customerAddress;
  private JTextField customerAddressTf;
  private JLabel customerPanNo;
  private JTextField customerPanNoTf;
  private JLabel customerPhoneNo;
  private JTextField customerPhoneNoTf;
  private JLabel discountPercent;
  private JTextField discountPercentTf;
  private JButton displayButton;
  private JButton clearButton;
  private JButton sellButton;
  private JLabel customerName;
  private JTextField customerNameRTextField;
  private JTextField customerPhoneRTF;
  private JLabel customerPhoneR;
  private JLabel customerPanNoR;
  private JTextField customerPanNoRTextField;
  private JLabel rentDate;
  private JLabel instrumentNameA;
  private JTextField instrumentNameATextField;
  private JPanel rPanel;
  private JTextField instrumentchargePerDayATextField;
  private JLabel instrumentchargePerDayA;
  private JButton addInstrumentA;
  private JPanel addInstrumentToSell;
  private JTextField instrumentNameToReturnTextField;
  private JLabel instrumentNameToReturn;
  private JButton addInstrumentToSellButton;
  private TitledBorder titleBorderA;
  private TitledBorder titleBorderR;
  private JPanel returnInstrumentPanel;
  private TitledBorder titledBorder3;
  private JButton returnInstrumentButton;
  private JLabel addInstrumentNameToSellLbl;
  private JTextField addInstrumentNameToSellLblTextField;
  private JLabel returnDate;
  private JComboBox<String> rentComboBoxD;
  private JComboBox<String> rentComboBoxM;
  private JComboBox<String> rentComboBoxY;
  private JComboBox<String> returnComboBoxD;
  private JComboBox<String> returnComboBoxM;
  private JComboBox<String> returnComboBoxY;
  private JLabel sellDate;
  private JComboBox<String> sellDateD;
  private JComboBox<String> sellDateM;
  private JComboBox<String> sellDateY;
  ArrayList<Instrument> addInstrumentList = new ArrayList<Instrument>();


  public String getInstrumentName() {
    return instrumentNameATextField.getText().trim();
  }

  public String getstringInstrumentCharge() {
    return instrumentchargePerDayATextField.getText().trim();
  }

  public String getinstrumentNameToSell() {
    return instrumentNameToSellTextField.getText().trim();
  }

  public String getcustomerName() {
    return customerNameRTextField.getText().trim();
  }

  public String getcustomerPhoneNo() {
    return customerPhoneRTF.getText().trim();
  }

  public String getStringCustomerpanNO() {
    return customerPanNoRTextField.getText().trim();
  }

  public String getinstrumentNameToReturn() {
    return instrumentNameToReturnTextField.getText().trim();
  }

  public String getcustomerName2() {
    return customerNameTf.getText().trim();
  }

  public String getcustomerAddress() {
    return customerAddressTf.getText().trim();
  }

  public String getcustomerPanNo2() {
    return customerPanNoTf.getText().trim();
  }

  public String getcustomerPhoneNo2() {
    return customerPhoneNoTf.getText().trim();
  }

  public String getdiscountPercent() {
    return discountPercentTf.getText().trim();
  }

  public String getinstrumentNameToRent() {
    return instrumentNameToRentTextField.getText().trim();
  }

  public String getaddInstrumentNameToSellLbl() {
    return addInstrumentNameToSellLblTextField.getText().trim();
  }

  public String getrentDate() {
    String rentDay = (String) rentComboBoxD.getSelectedItem();
    String rentMonth = (String) rentComboBoxM.getSelectedItem();
    String rentYear = (String) rentComboBoxY.getSelectedItem();
    String rentDate = (rentDay + "/" + rentMonth + "/" + rentYear);
    return rentDate;
  }

  public String getreturnDate() {
    String returnDay = (String) returnComboBoxD.getSelectedItem();
    String returnMonth = (String) returnComboBoxM.getSelectedItem();
    String returnYear = (String) returnComboBoxY.getSelectedItem();
    String returnDate = (returnDay + "/" + returnMonth + "/" + returnYear);
    return returnDate;
  }

  public String getsellDate()

  {
    String sellDateDay = (String) sellDateD.getSelectedItem();
    String sellDateMonth = (String) sellDateM.getSelectedItem();
    String sellDateYear = (String) sellDateY.getSelectedItem();
    String sellDate = (sellDateDay + "/" + sellDateMonth + "/" + sellDateYear);
    return sellDate;
  }

  public static void main(String[] Args) {
    new SarangiSansar();
  }

  public SarangiSansar() {

    frame = new JFrame();
    frame.setLayout(null);
    frame.setBounds(200, 0, 850, 640);
    frame.setTitle(" Sarangi Sansar");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menubar1 = new JMenuBar();
    menubar1.setBackground(new Color(46, 25, 31));
    frame.setJMenuBar(menubar1);
    themeMenu = new JMenu("Theme");
    themeMenu.setForeground(Color.white);
    themeMenu.setBackground(Color.black);
    menubar1.add(themeMenu);
    themeItem = new JMenuItem("Light");
    themeItem.setBackground(new Color(57, 56, 59));
    themeItem.setForeground(Color.white);
    themeMenu.add(themeItem);
    themeItem2 = new JMenuItem("Dark");
    themeItem2.setForeground(Color.white);
    themeItem2.setBackground(new Color(57, 56, 59));
    themeMenu.add(themeItem2);
    themeItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cpanel.setBackground(new Color(7, 217, 210));
        title.setForeground(Color.black);
        panel1.setBackground(new Color(7, 217, 210));
        instrumentNameToRent.setForeground(Color.black);
        instrumentNameToRentTextField.setBackground(new Color(7, 217, 210));
        instrumentNameToRentTextField.setForeground(Color.black);
        customerNameR.setBackground(new Color(7, 217, 210));
        customerNameR.setForeground(Color.black);
        customerNameRTextField.setForeground(Color.BLACK);
        customerNameRTextField.setBackground(new Color(7, 217, 210));
        customerPhoneR.setForeground(Color.BLACK);
        customerPhoneRTF.setBackground(new Color(7, 217, 210));
        customerPhoneRTF.setForeground(Color.black);
        customerPanNoR.setBackground(new Color(7, 217, 210));
        customerPanNoR.setForeground(Color.BLACK);
        customerPanNoRTextField.setBackground(new Color(7, 217, 210));
        customerPanNoRTextField.setForeground(Color.BLACK);
        rentDate.setForeground(Color.black);
        rentDate.setBackground(new Color(7, 217, 210));
        rentComboBoxD.setBackground(new Color(7, 217, 210));
        rentComboBoxD.setForeground(Color.black);
        rentComboBoxM.setBackground(new Color(7, 217, 210));
        rentComboBoxM.setForeground(Color.black);
        rentComboBoxY.setBackground(new Color(7, 217, 210));
        rentComboBoxY.setForeground(Color.black);
        returnDate.setForeground(Color.black);
        returnComboBoxD.setBackground(new Color(7, 217, 210));
        returnComboBoxD.setForeground(Color.black);
        returnComboBoxM.setBackground(new Color(7, 217, 210));
        returnComboBoxM.setForeground(Color.black);
        returnComboBoxY.setBackground(new Color(7, 217, 210));
        returnComboBoxY.setForeground(Color.black);
        NoODay.setForeground(Color.BLACK);
        NumberOfDaysRentedTextField.setBackground(new Color(7, 217, 210));
        NumberOfDaysRentedTextField.setForeground(Color.black);
        rentInstrumentButton.setBackground(new Color(141, 161, 160));
        rentInstrumentButton.setForeground(Color.black);
        titleBorder.setTitleColor(Color.BLACK);
        panel2.setBackground(new Color(7, 217, 210));
        titledBorder2.setTitleColor(Color.BLACK);
        instrumentNameToSell.setForeground(Color.black);
        instrumentNameToSellTextField.setBackground(new Color(7, 217, 210));
        customerName.setForeground(Color.black);
        customerNameTf.setForeground(Color.black);
        customerNameTf.setBackground(new Color(7, 217, 210));
        customerAddress.setForeground(Color.black);
        customerAddressTf.setForeground(Color.black);
        customerAddressTf.setBackground(new Color(7, 217, 210));
        customerPanNo.setForeground(Color.black);
        customerPanNoTf.setForeground(Color.black);
        customerPanNoTf.setBackground(new Color(7, 217, 210));
        customerPhoneNo.setForeground(Color.black);
        customerPhoneNoTf.setForeground(Color.black);
        customerPhoneNoTf.setBackground(new Color(7, 217, 210));
        sellDate.setForeground(Color.black);
        sellDateD.setBackground(new Color(7, 217, 210));
        sellDateD.setForeground(Color.black);
        sellDateM.setBackground(new Color(7, 217, 210));
        sellDateM.setForeground(Color.black);
        sellDateY.setBackground(new Color(7, 217, 210));
        sellDateY.setForeground(Color.black);
        discountPercent.setForeground(Color.black);
        discountPercentTf.setForeground(Color.black);
        discountPercentTf.setBackground(new Color(7, 217, 210));
        sellButton.setForeground(Color.black);
        sellButton.setBackground(new Color(141, 161, 160));
        menubar1.setBackground(new Color(7, 217, 210));
        themeMenu.setForeground(Color.black);
        displayButton.setBackground(new Color(141, 161, 160));
        clearButton.setBackground(new Color(141, 161, 160));
        displayButton.setForeground(Color.black);
        clearButton.setForeground(Color.BLACK);
        rPanel.setBackground(new Color(7, 217, 210));
        addInstrumentToSell.setBackground(new Color(7, 217, 210));
        addInstrumentA.setBackground(new Color(141, 161, 160));
        addInstrumentA.setForeground(Color.BLACK);
        addInstrumentToSellButton.setBackground(new Color(141, 161, 160));
        addInstrumentToSellButton.setForeground(Color.BLACK);
        instrumentNameA.setForeground(Color.black);
        instrumentNameATextField.setBackground(new Color(7, 217, 210));
        instrumentNameATextField.setForeground(Color.black);
        instrumentPriceA.setForeground(Color.black);
        instrumentPriceATextField.setBackground(new Color(7, 217, 210));
        instrumentPriceATextField.setForeground(Color.black);
        instrumentchargePerDayA.setForeground(Color.black);
        instrumentchargePerDayATextField.setBackground(new Color(7, 217, 210));
        instrumentchargePerDayATextField.setForeground(Color.black);
        instrumentNameToReturnTextField.setBackground(new Color(7, 217, 210));
        instrumentNameToReturnTextField.setForeground(Color.black);
        instrumentNameToReturn.setForeground(Color.BLACK);
        titleBorderA.setTitleColor(Color.BLACK);
        titleBorderR.setTitleColor(Color.BLACK);
        titledBorder3.setTitleColor(Color.BLACK);
        returnInstrumentPanel.setBackground(new Color(7, 217, 210));
        instrumentNameToReturn.setForeground(Color.black);
        instrumentNameToReturnTextField.setBackground(new Color(7, 217, 210));
        instrumentNameToReturnTextField.setForeground(Color.black);
        returnInstrumentButton.setForeground(Color.black);
        returnInstrumentButton.setBackground(new Color(141, 161, 160));
        instrumentNameToSellTextField.setBackground(new Color(7, 217, 210));
        instrumentNameToSellTextField.setForeground(Color.black);
        addInstrumentNameToSellLbl.setForeground(Color.BLACK);
        addInstrumentNameToSellLblTextField.setBackground(new Color(7, 217, 210));
        addInstrumentNameToSellLblTextField.setForeground(Color.black);
        addInstrumentNameToSellLbl.setForeground(Color.BLACK);
      }
    });

    themeItem2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cpanel.setBackground(new Color(6, 7, 9));
        panel1.setBackground(new Color(6, 7, 9));
        title.setForeground(Color.white);
        instrumentNameToRent.setForeground(Color.white);
        instrumentNameToRentTextField.setBackground(new Color(6, 7, 9));
        instrumentNameToRentTextField.setForeground(Color.white);
        customerNameR.setBackground(new Color(6, 7, 9));
        customerNameR.setForeground(Color.white);
        customerNameRTextField.setForeground(Color.white);
        customerNameRTextField.setBackground(new Color(6, 7, 9));
        customerPhoneR.setForeground(Color.white);
        customerPhoneRTF.setBackground(new Color(6, 7, 9));
        customerPhoneRTF.setForeground(Color.white);
        customerPanNoR.setBackground(new Color(6, 7, 9));
        customerPanNoR.setForeground(Color.white);
        customerPanNoRTextField.setBackground(new Color(6, 7, 9));
        customerPanNoRTextField.setForeground(Color.white);
        rentDate.setForeground(Color.white);
        rentDate.setBackground(new Color(6, 7, 9));
        rentComboBoxD.setBackground(new Color(6, 7, 9));
        rentComboBoxD.setForeground(Color.white);
        rentComboBoxM.setBackground(new Color(6, 7, 9));
        rentComboBoxM.setForeground(Color.white);
        rentComboBoxY.setBackground(new Color(6, 7, 9));
        rentComboBoxY.setForeground(Color.white);
        returnDate.setForeground(Color.white);
        returnComboBoxD.setBackground(new Color(6, 7, 9));
        returnComboBoxD.setForeground(Color.white);
        returnComboBoxM.setBackground(new Color(6, 7, 9));
        returnComboBoxM.setForeground(Color.white);
        returnComboBoxY.setBackground(new Color(6, 7, 9));
        returnComboBoxY.setForeground(Color.white);
        NoODay.setForeground(Color.white);
        NumberOfDaysRentedTextField.setBackground(new Color(6, 7, 9));
        NumberOfDaysRentedTextField.setForeground(Color.white);
        rentInstrumentButton.setBackground(new Color(9, 11, 12));
        rentInstrumentButton.setForeground(Color.white);
        titleBorder.setTitleColor(Color.white);
        panel2.setBackground(new Color(6, 7, 9));
        titledBorder2.setTitleColor(Color.white);
        instrumentNameToSell.setForeground(Color.white);
        instrumentNameToSellTextField.setBackground(new Color(6, 7, 9));
        instrumentNameToSellTextField.setForeground(Color.white);
        customerName.setForeground(Color.white);
        customerNameTf.setForeground(Color.white);
        customerNameTf.setBackground(new Color(6, 7, 9));
        customerAddress.setForeground(Color.white);
        customerAddressTf.setForeground(Color.white);
        customerAddressTf.setBackground(new Color(6, 7, 9));
        customerPanNo.setForeground(Color.white);
        customerPanNoTf.setForeground(Color.white);
        customerPanNoTf.setBackground(new Color(6, 7, 9));
        customerPhoneNo.setForeground(Color.white);
        customerPhoneNoTf.setForeground(Color.white);
        customerPhoneNoTf.setBackground(new Color(6, 7, 9));
        sellDate.setForeground(Color.white);
        sellDateD.setBackground(new Color(6, 7, 9));
        sellDateD.setForeground(Color.white);
        sellDateM.setBackground(new Color(6, 7, 9));
        sellDateM.setForeground(Color.white);
        sellDateY.setBackground(new Color(6, 7, 9));
        sellDateY.setForeground(Color.white);
        discountPercent.setForeground(Color.white);
        discountPercentTf.setForeground(Color.white);
        discountPercentTf.setBackground(new Color(6, 7, 9));
        sellButton.setForeground(Color.white);
        sellButton.setBackground(new Color(9, 11, 12));
        menubar1.setBackground(new Color(6, 7, 9));
        themeMenu.setForeground(Color.white);
        displayButton.setBackground(new Color(9, 11, 12));
        displayButton.setForeground(Color.white);
        clearButton.setForeground(Color.white);
        clearButton.setBackground(new Color(9, 11, 12));
        rPanel.setBackground(new Color(6, 7, 9));
        addInstrumentToSell.setBackground(new Color(6, 7, 9));
        addInstrumentA.setBackground(new Color(6, 7, 9));
        addInstrumentA.setForeground(Color.white);
        addInstrumentToSellButton.setBackground(new Color(6, 7, 9));
        addInstrumentToSellButton.setForeground(Color.white);
        instrumentNameA.setForeground(Color.white);
        instrumentNameATextField.setBackground(new Color(6, 7, 9));
        instrumentNameATextField.setForeground(Color.white);
        instrumentPriceA.setForeground(Color.white);
        instrumentPriceATextField.setBackground(new Color(6, 7, 9));
        instrumentPriceATextField.setForeground(Color.white);
        instrumentchargePerDayA.setForeground(Color.white);
        instrumentchargePerDayATextField.setBackground(new Color(6, 7, 9));
        instrumentchargePerDayATextField.setForeground(Color.white);
        instrumentNameToReturnTextField.setBackground(new Color(6, 7, 9));
        instrumentNameToReturnTextField.setForeground(Color.white);
        instrumentNameToReturn.setForeground(Color.white);
        titleBorderA.setTitleColor(Color.white);
        titleBorderR.setTitleColor(Color.white);
        addInstrumentA.setForeground(Color.white);
        addInstrumentA.setBackground(new Color(9, 11, 12));
        addInstrumentToSellButton.setBackground(new Color(6, 7, 9));
        addInstrumentToSellButton.setForeground(Color.white);
        addInstrumentNameToSellLblTextField.setBackground(new Color(6, 7, 9));
        addInstrumentNameToSellLblTextField.setForeground(Color.white);
        addInstrumentNameToSellLbl.setForeground(Color.white);
        returnInstrumentPanel.setBackground(new Color(6, 7, 9));
        titledBorder3.setTitleColor(Color.white);
        returnInstrumentButton.setBackground(new Color(6, 7, 9));
        returnInstrumentButton.setForeground(Color.white);
      }
    });
    // Changing the image icon of the frame.
    image = new ImageIcon(getClass().getResource("images.jpeg"));
    frame.setIconImage(image.getImage());
    cpanel = new JPanel();
    cpanel.setSize(850, 650);
    cpanel.setBackground(new Color(46, 25, 31));

    // Title for the project.
    title = new JLabel();
    title.setText("Sarangi Sansar");
    title.setForeground(Color.white);
    title.setLocation(100, 10);
    title.setSize(100, 30);
    title.setFont(new Font("Forte", Font.PLAIN, 28));
    cpanel.add(title);

    // panel creation for adding instrument to rent

    rPanel = new JPanel();
    rPanel.setBackground(new Color(46, 25, 31));
    rPanel.setSize(360, 140);
    rPanel.setLocation(20, 35);
    rPanel.setLayout(null);
    titleBorderA = BorderFactory.createTitledBorder("Add Instrument To Rent ");
    titleBorderA.setTitleJustification(TitledBorder.CENTER);
    titleBorderA.setTitleColor(Color.WHITE);
    rPanel.setBorder(titleBorderA);
    frame.add(rPanel);

    // Instrument Name
    instrumentNameA = new JLabel();
    instrumentNameA.setText("Instrument Name:");
    instrumentNameA.setLocation(6, 25);
    instrumentNameA.setForeground(Color.white);
    instrumentNameA.setSize(150, 30);
    rPanel.add(instrumentNameA);

    // instreument name text field for adding instrumnet to rent
    instrumentNameATextField = new JTextField();
    instrumentNameATextField.setLocation(140, 30);
    instrumentNameATextField.setBackground(new Color(49, 48, 51));
    instrumentNameATextField.setForeground(Color.white);
    instrumentNameATextField.setCaretColor(Color.white);
    instrumentNameATextField.setSize(150, 20);
    rPanel.add(instrumentNameATextField);

    // charge of instrument per day

    instrumentchargePerDayA = new JLabel();
    instrumentchargePerDayA.setText("Charge Per Day:");
    instrumentchargePerDayA.setLocation(6, 60);
    instrumentchargePerDayA.setForeground(Color.white);
    instrumentchargePerDayA.setSize(150, 30);
    rPanel.add(instrumentchargePerDayA);

    // instrument charge per day text field

    instrumentchargePerDayATextField = new JTextField();
    instrumentchargePerDayATextField.setLocation(140, 65);
    instrumentchargePerDayATextField.setBackground(new Color(49, 48, 51));
    instrumentchargePerDayATextField.setForeground(Color.white);
    instrumentchargePerDayATextField.setCaretColor(Color.white);
    instrumentchargePerDayATextField.setSize(50, 20);
    rPanel.add(instrumentchargePerDayATextField);
    // JButton for adding instrument
    addInstrumentA = new JButton();
    addInstrumentA.setText("Add Instrument");
    addInstrumentA.setSize(130, 25);
    addInstrumentA.setLocation(120, 100);
    addInstrumentA.setBackground(new Color(49, 48, 51));
    addInstrumentA.setForeground(Color.white);
    rPanel.add(addInstrumentA);
    addInstrumentA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        String iname = getInstrumentName();
        String stringInstrumentCharge = getstringInstrumentCharge();
        int instrumentCharge;
        boolean isRepeated = false;
        if (iname.isEmpty() && stringInstrumentCharge.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Please fill all the fields", "WARNING", JOptionPane.WARNING_MESSAGE);
          return;
        }

        else if (iname.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "PLease   fill the instrument name Textfield.", "Validation",JOptionPane.INFORMATION_MESSAGE);
          return;
        } else if (stringInstrumentCharge.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Instrument charge per day required.", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        } else {
          try {
            instrumentCharge = Integer.parseInt(stringInstrumentCharge);
            if (instrumentCharge <= 0) {
              JOptionPane.showMessageDialog(frame, "Enter only postive value in charge per day", "ERROR",JOptionPane.ERROR_MESSAGE);
              return;
            }
          } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame, "Enter Valid instrument charge", "WARNING",JOptionPane.WARNING_MESSAGE);
            return;
          }
          for (Instrument instrument : addInstrumentList) {
            if (instrument.getInstrumentName().equals(getInstrumentName())) {
              JOptionPane.showMessageDialog(frame, iname + "  is already in the stock try new one.", "Validation",JOptionPane.WARNING_MESSAGE);
              isRepeated = true;
              return;
            }
          }
        }
        if (isRepeated == false) {
          addInstrumentList.add(new InstrumentToRent(iname, instrumentCharge));
          JOptionPane.showMessageDialog(frame, "You have successfully added  instrument  " + iname + " with Charge Per Day Rs. " + stringInstrumentCharge);
          instrumentNameATextField.setText("");
          instrumentchargePerDayATextField.setText("");
          return;
        }

      }

    });

    // panel creation for adding instrument to sell

    addInstrumentToSell = new JPanel();
    addInstrumentToSell.setBackground(new Color(46, 25, 31));
    addInstrumentToSell.setSize(400, 115);
    addInstrumentToSell.setLocation(410, 130);
    addInstrumentToSell.setLayout(null);
    titleBorderR = BorderFactory.createTitledBorder("Add Instrument To Sell ");
    titleBorderR.setTitleJustification(TitledBorder.CENTER);
    titleBorderR.setTitleColor(Color.WHITE);
    addInstrumentToSell.setBorder(titleBorderR);
    frame.add(addInstrumentToSell);

    // Instrument Name for instrument to Sell

    addInstrumentNameToSellLbl = new JLabel();
    addInstrumentNameToSellLbl.setText("Instrument Name:");
    addInstrumentNameToSellLbl.setLocation(10, 15);
    addInstrumentNameToSellLbl.setForeground(Color.white);
    addInstrumentNameToSellLbl.setSize(150, 30);
    addInstrumentToSell.add(addInstrumentNameToSellLbl);
    // Instrument text field for instrument name to Sell

    addInstrumentNameToSellLblTextField = new JTextField();
    addInstrumentNameToSellLblTextField.setSize(100, 20);
    addInstrumentNameToSellLblTextField.setLocation(140, 20);
    addInstrumentNameToSellLblTextField.setBackground(new Color(49, 48, 51));
    addInstrumentNameToSellLblTextField.setForeground(Color.white);
    addInstrumentNameToSellLblTextField.setCaretColor(Color.white);
    addInstrumentToSell.add(addInstrumentNameToSellLblTextField);

    // Jlabel Price of the instrument to sell

    instrumentPriceA = new JLabel();
    instrumentPriceA.setText("Instrument Price:");
    instrumentPriceA.setLocation(10, 45);
    instrumentPriceA.setForeground(Color.white);
    instrumentPriceA.setSize(150, 30);
    addInstrumentToSell.add(instrumentPriceA);

    // price text field for adding instrument to sell
    instrumentPriceATextField = new JTextField();
    instrumentPriceATextField.setLocation(140, 50);
    instrumentPriceATextField.setBackground(new Color(49, 48, 51));
    instrumentPriceATextField.setForeground(Color.white);
    instrumentPriceATextField.setCaretColor(Color.white);
    instrumentPriceATextField.setSize(50, 20);
    addInstrumentToSell.add(instrumentPriceATextField);
    // JButton for adding instrument to rent
    addInstrumentToSellButton = new JButton();
    addInstrumentToSellButton.setSize(140, 25);
    addInstrumentToSellButton.setBackground(new Color(49, 48, 51));
    addInstrumentToSellButton.setLocation(140, 80);
    addInstrumentToSellButton.setText("Add Instrument");
    addInstrumentToSellButton.setForeground(Color.white);
    addInstrumentToSell.add(addInstrumentToSellButton);
    addInstrumentToSellButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String addInstrumentNameToSellLbl = getaddInstrumentNameToSellLbl();
        int instrumentToSellPrice = getPrice();
        boolean repeated = false;
        if (addInstrumentNameToSellLbl.isEmpty() && instrumentToSellPrice == INVALID) {
          JOptionPane.showMessageDialog(frame, "Fill up all the data to add instrument to sell", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        } else if (addInstrumentNameToSellLbl.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Instrument name is required", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        } else if (instrumentToSellPrice == INVALID) {
          JOptionPane.showMessageDialog(frame, "Please enter positive valid data in Price", "Validation",JOptionPane.ERROR_MESSAGE);
          return;
        }

        else {
          for (Instrument instrument1 : addInstrumentList) {
            if (instrument1.getInstrumentName().equals(addInstrumentNameToSellLbl)) {
              JOptionPane.showMessageDialog(frame,
                  "The instrument " + addInstrumentNameToSellLbl
                      + "is already added in the stock.\n Please add new instrument.",
                  "Validation", JOptionPane.WARNING_MESSAGE);
              repeated = true;
              return;
            }
          }

          if (repeated == false) {
            addInstrumentList.add(new InstrumentToSell(addInstrumentNameToSellLbl, instrumentToSellPrice));
            JOptionPane.showMessageDialog(frame, "You have successfully added  instrument " + addInstrumentNameToSellLbl
                + " to stock and price is  Rs. " + instrumentToSellPrice);
            addInstrumentNameToSellLblTextField.setText("");
            instrumentPriceATextField.setText("");
            return;
          }
        }

      }

      public int getPrice() {
        String price = instrumentPriceATextField.getText().trim();
        int instrumentPrice = INVALID;
        try {
        instrumentPrice = Integer.parseInt(price);
        if (instrumentPrice <= 0) {
        instrumentPrice = INVALID;
        //JOptionPane.showMessageDialog(frame, "Please enter positive data in the fields", "Validation",JOptionPane.ERROR_MESSAGE);
    

        }

        } catch (Exception pp) {
        // JOptionPane.showMessageDialog(frame, "Please enter valid data", "Validation",JOptionPane.ERROR_MESSAGE);
      

        }

        return instrumentPrice;

      }
    });

    // Panel 1 creation

    panel1 = new JPanel();
    panel1.setSize(360, 350);
    panel1.setLocation(20, 175);
    panel1.setBackground(new Color(46, 25, 31));
    panel1.setLayout(null);
    titleBorder = BorderFactory.createTitledBorder("Instrument To Rent");
    titleBorder.setTitleJustification(TitledBorder.CENTER);
    titleBorder.setTitleColor(Color.WHITE);
    panel1.setBorder(titleBorder);
    cpanel.add(panel1);

    // Panel 1 content
    // Firstly for instrument To Rent
    // instrument Name To Rent

    instrumentNameToRent = new JLabel();
    instrumentNameToRent.setText("Instrument Name:");
    instrumentNameToRent.setLocation(13, 25);
    instrumentNameToRent.setForeground(Color.white);
    instrumentNameToRent.setSize(150, 30);
    panel1.add(instrumentNameToRent);
    // instrument Name To Rent text field

    instrumentNameToRentTextField = new JTextField();
    instrumentNameToRentTextField.setSize(100, 20);
    instrumentNameToRentTextField.setLocation(140, 30);
    instrumentNameToRentTextField.setBackground(new Color(49, 48, 51));
    instrumentNameToRentTextField.setForeground(Color.white);
    instrumentNameToRentTextField.setCaretColor(Color.white);
    panel1.add(instrumentNameToRentTextField);

    // Customer name

    customerNameR = new JLabel();
    customerNameR.setText("Customer Name:");
    customerNameR.setSize(150, 20);
    customerNameR.setForeground(Color.white);
    customerNameR.setLocation(10, 70);
    panel1.add(customerNameR);

    // customer name text field

    customerNameRTextField = new JTextField();
    customerNameRTextField.setSize(180, 20);
    customerNameRTextField.setLocation(140, 70);
    customerNameRTextField.setForeground(Color.white);
    customerNameRTextField.setCaretColor(Color.white);
    customerNameRTextField.setBackground(new Color(49, 48, 51));
    panel1.add(customerNameRTextField);

    // Customer phone number
    customerPhoneR = new JLabel();
    customerPhoneR.setText(" Customer Phone N0. :");
    customerPhoneR.setSize(150, 30);
    customerPhoneR.setLocation(10, 105);
    customerPhoneR.setForeground(Color.white);
    panel1.add(customerPhoneR);

    customerPhoneRTF = new JTextField();
    customerPhoneRTF.setSize(180, 20);
    customerPhoneRTF.setLocation(140, 110);
    customerPhoneRTF.setForeground(Color.white);
    customerPhoneRTF.setCaretColor(Color.white);
    customerPhoneRTF.setBackground(new Color(49, 48, 51));
    panel1.add(customerPhoneRTF);

    // Customer PAN NO. to rent instrument
    customerPanNoR = new JLabel();
    customerPanNoR.setText("Customer PAN No. :");
    customerPanNoR.setLocation(13, 150);
    customerPanNoR.setSize(120, 20);
    customerPanNoR.setForeground(Color.white);
    panel1.add(customerPanNoR);

    customerPanNoRTextField = new JTextField();
    customerPanNoRTextField.setSize(100, 20);
    customerPanNoRTextField.setLocation(140, 150);
    customerPanNoRTextField.setBackground(new Color(49, 48, 51));
    customerPanNoRTextField.setForeground(Color.white);
    customerPanNoRTextField.setCaretColor(Color.white);
    panel1.add(customerPanNoRTextField);

    // Date of the instrumented rented
    rentDate = new JLabel();
    rentDate.setText("Rented Date:");
    rentDate.setLocation(13, 190);
    rentDate.setSize(100, 20);
    rentDate.setForeground(Color.white);
    panel1.add(rentDate);

    rentComboBoxD = new JComboBox<>();
    rentComboBoxD.setLocation(140, 190);
    rentComboBoxD.setSize(40, 20);
    rentComboBoxD.setBackground(new Color(49, 48, 51));
    rentComboBoxD.setForeground(Color.white);
    rentComboBoxD.addItem("1");
    rentComboBoxD.addItem("2");
    rentComboBoxD.addItem("3");
    rentComboBoxD.addItem("4");
    rentComboBoxD.addItem("5");
    rentComboBoxD.addItem("6");
    rentComboBoxD.addItem("7");
    rentComboBoxD.addItem("8");
    rentComboBoxD.addItem("9");
    rentComboBoxD.addItem("10");
    rentComboBoxD.addItem("11");
    rentComboBoxD.addItem("12");
    rentComboBoxD.addItem("13");
    rentComboBoxD.addItem("14");
    rentComboBoxD.addItem("15");
    rentComboBoxD.addItem("16");
    rentComboBoxD.addItem("17");
    rentComboBoxD.addItem("18");
    rentComboBoxD.addItem("19");
    rentComboBoxD.addItem("20");
    rentComboBoxD.addItem("21");
    rentComboBoxD.addItem("22");
    rentComboBoxD.addItem("23");
    rentComboBoxD.addItem("24");
    rentComboBoxD.addItem("25");
    rentComboBoxD.addItem("26");
    rentComboBoxD.addItem("27");
    rentComboBoxD.addItem("28");
    rentComboBoxD.addItem("29");
    rentComboBoxD.addItem("30");
    rentComboBoxD.addItem("31");

    rentComboBoxM = new JComboBox<>();
    rentComboBoxM.setLocation(185, 190);
    rentComboBoxM.setSize(55, 20);
    rentComboBoxM.setBackground(new Color(49, 48, 51));
    rentComboBoxM.setForeground(Color.white);
    rentComboBoxM.addItem("JAN");
    rentComboBoxM.addItem("FEB");
    rentComboBoxM.addItem("MAR");
    rentComboBoxM.addItem("APR");
    rentComboBoxM.addItem("MAY");
    rentComboBoxM.addItem("JUN");
    rentComboBoxM.addItem("JULY");
    rentComboBoxM.addItem("AUG");
    rentComboBoxM.addItem("SEP");
    rentComboBoxM.addItem("OCT");
    rentComboBoxM.addItem("NOV");
    rentComboBoxM.addItem("DEC");

    rentComboBoxY = new JComboBox<>();
    rentComboBoxY.setLocation(245, 190);
    rentComboBoxY.setSize(60, 20);
    rentComboBoxY.setBackground(new Color(49, 48, 51));
    rentComboBoxY.setForeground(Color.white);
    rentComboBoxY.addItem("2010");
    rentComboBoxY.addItem("2011");
    rentComboBoxY.addItem("2012");
    rentComboBoxY.addItem("2013");
    rentComboBoxY.addItem("2014");
    rentComboBoxY.addItem("2015");
    rentComboBoxY.addItem("2016");
    rentComboBoxY.addItem("2017");
    rentComboBoxY.addItem("2018");
    rentComboBoxY.addItem("2019");
    rentComboBoxY.addItem("2020");
    rentComboBoxY.addItem("2021");
    rentComboBoxY.addItem("2022");

    panel1.add(rentComboBoxD);
    panel1.add(rentComboBoxM);
    panel1.add(rentComboBoxY);

    // Returned Date

    returnDate = new JLabel();
    returnDate.setText("Return Date:");
    returnDate.setLocation(13, 230);
    returnDate.setSize(100, 20);
    returnDate.setForeground(Color.white);
    panel1.add(returnDate);

    returnComboBoxD = new JComboBox<>();
    returnComboBoxD.setLocation(140, 230);
    returnComboBoxD.setSize(40, 20);
    returnComboBoxD.setBackground(new Color(49, 48, 51));
    returnComboBoxD.setForeground(Color.white);
    returnComboBoxD.addItem("1");
    returnComboBoxD.addItem("2");
    returnComboBoxD.addItem("3");
    returnComboBoxD.addItem("4");
    returnComboBoxD.addItem("5");
    returnComboBoxD.addItem("6");
    returnComboBoxD.addItem("7");
    returnComboBoxD.addItem("8");
    returnComboBoxD.addItem("9");
    returnComboBoxD.addItem("10");
    returnComboBoxD.addItem("11");
    returnComboBoxD.addItem("12");
    returnComboBoxD.addItem("13");
    returnComboBoxD.addItem("14");
    returnComboBoxD.addItem("15");
    returnComboBoxD.addItem("16");
    returnComboBoxD.addItem("17");
    returnComboBoxD.addItem("18");
    returnComboBoxD.addItem("19");
    returnComboBoxD.addItem("20");
    returnComboBoxD.addItem("21");
    returnComboBoxD.addItem("22");
    returnComboBoxD.addItem("23");
    returnComboBoxD.addItem("24");
    returnComboBoxD.addItem("25");
    returnComboBoxD.addItem("26");
    returnComboBoxD.addItem("27");
    returnComboBoxD.addItem("28");
    returnComboBoxD.addItem("29");
    returnComboBoxD.addItem("30");
    returnComboBoxD.addItem("31");

    returnComboBoxM = new JComboBox<>();
    returnComboBoxM.setLocation(185, 230);
    returnComboBoxM.setSize(55, 20);
    returnComboBoxM.setBackground(new Color(49, 48, 51));
    returnComboBoxM.setForeground(Color.white);
    returnComboBoxM.addItem("JAN");
    returnComboBoxM.addItem("FEB");
    returnComboBoxM.addItem("MAR");
    returnComboBoxM.addItem("APR");
    returnComboBoxM.addItem("MAY");
    returnComboBoxM.addItem("JUN");
    returnComboBoxM.addItem("JULY");
    returnComboBoxM.addItem("AUG");
    returnComboBoxM.addItem("SEP");
    returnComboBoxM.addItem("OCT");
    returnComboBoxM.addItem("NOV");
    returnComboBoxM.addItem("DEC");

    returnComboBoxY = new JComboBox<>();
    returnComboBoxY.setLocation(245, 230);
    returnComboBoxY.setSize(60, 20);
    returnComboBoxY.setBackground(new Color(49, 48, 51));
    returnComboBoxY.setForeground(Color.white);
    returnComboBoxY.addItem("2010");
    returnComboBoxY.addItem("2011");
    returnComboBoxY.addItem("2012");
    returnComboBoxY.addItem("2013");
    returnComboBoxY.addItem("2014");
    returnComboBoxY.addItem("2015");
    returnComboBoxY.addItem("2016");
    returnComboBoxY.addItem("2017");
    returnComboBoxY.addItem("2018");
    returnComboBoxY.addItem("2019");
    returnComboBoxY.addItem("2020");
    returnComboBoxY.addItem("2021");
    returnComboBoxY.addItem("2022");

    panel1.add(returnComboBoxD);
    panel1.add(returnComboBoxM);
    panel1.add(returnComboBoxY);

    // No of days the instrument rented.

    NoODay = new JLabel();
    NoODay.setText("Rented Days:");
    NoODay.setBounds(13, 270, 100, 20);
    NoODay.setForeground(Color.white);
    panel1.add(NoODay);

    NumberOfDaysRentedTextField = new JTextField();
    NumberOfDaysRentedTextField.setBounds(140, 270, 50, 20);
    NumberOfDaysRentedTextField.setBackground(new Color(49, 48, 51));
    NumberOfDaysRentedTextField.setForeground(Color.white);
    NumberOfDaysRentedTextField.setCaretColor(Color.white);
    panel1.add(NumberOfDaysRentedTextField);

    // Button to add instrument to rent

    rentInstrumentButton = new JButton();
    rentInstrumentButton.setText("Rent  Instrument");
    rentInstrumentButton.setSize(130, 25);
    rentInstrumentButton.setLocation(122, 305);
    rentInstrumentButton.setBackground(new Color(49, 48, 51));
    rentInstrumentButton.setForeground(Color.white);
    rentInstrumentButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String instrumentNameToRent = getinstrumentNameToRent();
        String customerName = getcustomerName();
        String customerPhoneNo = getcustomerPhoneNo();
        String StringCustomerpanNO = getStringCustomerpanNO();

        String rentDate = getrentDate();
        String returnDate = getreturnDate();

        String StringRentedDays = NumberOfDaysRentedTextField.getText();
        int customerpanNo;
        int rentedDays;
        boolean isInvalid = true;

        if (instrumentNameToRent.isEmpty() && customerName.isEmpty() && customerPhoneNo.isEmpty()&& StringCustomerpanNO.isEmpty() && StringRentedDays.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Please fill all the requirement");
          return;
        } else if (instrumentNameToRent.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Instrument Name is required.", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        }

        else if (customerName.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Customer Name is required..", "Validation",JOptionPane.INFORMATION_MESSAGE);
          return;

        }

        else if (customerPhoneNo.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "PLease  fill the customer Phone NO.", "Validation",JOptionPane.INFORMATION_MESSAGE);
          return;
        } else if (StringCustomerpanNO.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "PLease  Fill the customer PAN No.", "Validation",JOptionPane.INFORMATION_MESSAGE);
          return;
        } else if (StringRentedDays.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "PLease fill the total days of instrument rented for. ", "Validation",JOptionPane.INFORMATION_MESSAGE);
          return;
        }

        else {
          try {
            customerpanNo = Integer.parseInt(StringCustomerpanNO);
            rentedDays = Integer.parseInt(StringRentedDays);
            if (customerpanNo <= 0) {
              JOptionPane.showMessageDialog(frame, "Only postive value is initalized ", "ERROR",JOptionPane.ERROR_MESSAGE);
              return;
            } else if (rentedDays <= 0) {
              JOptionPane.showMessageDialog(frame, "Only postive value is initalized ", "ERROR",JOptionPane.ERROR_MESSAGE);
              return;
            }

          } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame, "Please enter the valid data");
            return;

          }
          
          for (Instrument instrument : addInstrumentList) {
            if (instrument.getInstrumentName().equals(getinstrumentNameToRent())) {
              isInvalid = false;

              if (instrument instanceof InstrumentToRent) {
                InstrumentToRent insToRent = (InstrumentToRent) instrument;
                if (insToRent.getIsRented() == true) {
                  JOptionPane.showMessageDialog(frame,
                      "Instrument " + instrumentNameToRent + " is already rented by others.", "Validation",JOptionPane.WARNING_MESSAGE);
                  return;
                } else {
                  insToRent.rent(customerName, customerPhoneNo, customerpanNo, rentDate, returnDate, rentedDays);
                  JOptionPane.showMessageDialog(frame, "Instrument " +instrumentNameToRent +" is  rented successfully", "Validation",JOptionPane.INFORMATION_MESSAGE);
                  NumberOfDaysRentedTextField.setText("");
                  customerPanNoRTextField.setText("");
                  customerPhoneRTF.setText("");
                  customerNameRTextField.setText("");
                  instrumentNameToRentTextField.setText("");
                  rentComboBoxD.setSelectedIndex(0);
                  rentComboBoxM.setSelectedIndex(0);
                  rentComboBoxY.setSelectedIndex(0);
                  returnComboBoxD.setSelectedIndex(0);
                  returnComboBoxM.setSelectedIndex(0);
                  returnComboBoxY.setSelectedIndex(0);
                  return;

                }

              } else {
                JOptionPane.showMessageDialog(frame, "Instrument is not for rent", "Validation",JOptionPane.WARNING_MESSAGE);
                return;
              }

            }
          }
          if (isInvalid == true) {
            JOptionPane.showMessageDialog(frame, "Instrument is not available", "Validation",JOptionPane.WARNING_MESSAGE);
            return;
          }
        }

      }
    });

    panel1.add(rentInstrumentButton);

    // panel creation for returning instrument.

    returnInstrumentPanel = new JPanel();
    returnInstrumentPanel.setBounds(410, 35, 400, 95);
    returnInstrumentPanel.setBackground(new Color(46, 25, 31));
    titledBorder3 = BorderFactory.createTitledBorder("Return Instrument");
    titledBorder3.setTitleJustification(TitledBorder.CENTER);
    titledBorder3.setTitleColor(Color.white);
    returnInstrumentPanel.setBorder(titledBorder3);

    returnInstrumentPanel.setLayout(null);
    cpanel.add(returnInstrumentPanel);

    frame.add(returnInstrumentPanel);

    // Instrument Name
    instrumentNameToReturn = new JLabel();
    instrumentNameToReturn.setText("Instrument Name:");
    instrumentNameToReturn.setLocation(10, 20);
    instrumentNameToReturn.setForeground(Color.white);
    instrumentNameToReturn.setSize(150, 30);

    returnInstrumentPanel.add(instrumentNameToReturn);

    instrumentNameToReturnTextField = new JTextField();
    instrumentNameToReturnTextField.setLocation(140, 25);
    instrumentNameToReturnTextField.setBackground(new Color(49, 48, 51));
    instrumentNameToReturnTextField.setForeground(Color.white);
    instrumentNameToReturnTextField.setCaretColor(Color.white);
    instrumentNameToReturnTextField.setSize(150, 20);

    returnInstrumentPanel.add(instrumentNameToReturnTextField);

    // Button to return instrument

    returnInstrumentButton = new JButton();
    returnInstrumentButton.setText("Return  Instrument");
    returnInstrumentButton.setSize(150, 25);
    returnInstrumentButton.setLocation(140, 60);
    returnInstrumentButton.setBackground(new Color(49, 48, 51));
    returnInstrumentButton.setForeground(Color.white);
    returnInstrumentPanel.add(returnInstrumentButton);
    returnInstrumentButton.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        String instrumentNameToReturn = getinstrumentNameToReturn();
        boolean isFound = false;
        if (instrumentNameToReturn.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Name of instrument is required to return it");
          return;
        }
        for (Instrument ins : addInstrumentList) {
          if (ins.getInstrumentName().equals(instrumentNameToReturn)) {
            isFound = true;
            InstrumentToRent np = (InstrumentToRent) ins;
            if (np.getIsRented()) {
              np.returnInstrument();
              JOptionPane.showMessageDialog(frame,
                  "You have successfully returned the instrument  " + instrumentNameToReturn + ".", "Congratulation",JOptionPane.INFORMATION_MESSAGE);
              instrumentNameToReturnTextField.setText("");
              return;
            }

            else {
              JOptionPane.showMessageDialog(frame,
                  "You have not rented the instrument  " + instrumentNameToReturn + " .", "Validation",JOptionPane.INFORMATION_MESSAGE);
              return;
            }

          }
        }

        if (isFound == false) {
          JOptionPane.showMessageDialog(frame, "The instrument " + instrumentNameToReturn + "  is not valid.","Validation", JOptionPane.INFORMATION_MESSAGE);
        }

      }
    });

    // panel2 Starting

    panel2 = new JPanel();
    panel2.setSize(400, 280);
    panel2.setLocation(410, 245);
    panel2.setBackground(new Color(46, 25, 31));
    titledBorder2 = BorderFactory.createTitledBorder("Instrument To Sell");
    titledBorder2.setTitleJustification(TitledBorder.CENTER);
    titledBorder2.setTitleColor(Color.white);
    panel2.setBorder(titledBorder2);

    panel2.setLayout(null);
    cpanel.add(panel2);

    // For instrument Name

    instrumentNameToSell = new JLabel();
    instrumentNameToSell.setText("Instrument Name:");
    instrumentNameToSell.setLocation(10, 15);
    instrumentNameToSell.setForeground(Color.white);
    instrumentNameToSell.setSize(150, 30);
    panel2.add(instrumentNameToSell);

    instrumentNameToSellTextField = new JTextField();
    instrumentNameToSellTextField.setSize(100, 20);
    instrumentNameToSellTextField.setLocation(140, 20);
    instrumentNameToSellTextField.setBackground(new Color(49, 48, 51));
    instrumentNameToSellTextField.setForeground(Color.white);
    instrumentNameToSellTextField.setCaretColor(Color.white);
    panel2.add(instrumentNameToSellTextField);

    // For customer name.
    customerName = new JLabel();
    customerName.setText(" Customer Name:");
    customerName.setSize(150, 30);
    customerName.setLocation(8, 45);
    customerName.setForeground(Color.white);
    panel2.add(customerName);

    customerNameTf = new JTextField();
    customerNameTf.setSize(220, 20);
    customerNameTf.setLocation(140, 50);
    customerNameTf.setForeground(Color.white);
    customerNameTf.setCaretColor(Color.white);
    customerNameTf.setBackground(new Color(49, 48, 51));
    panel2.add(customerNameTf);

    // For customer address

    customerAddress = new JLabel();
    customerAddress.setText(" Customer Address:");
    customerAddress.setSize(150, 30);
    customerAddress.setLocation(8, 75);
    customerAddress.setForeground(Color.white);
    panel2.add(customerAddress);

    customerAddressTf = new JTextField();
    customerAddressTf.setSize(220, 20);
    customerAddressTf.setLocation(140, 80);
    customerAddressTf.setForeground(Color.white);
    customerAddressTf.setCaretColor(Color.white);
    customerAddressTf.setBackground(new Color(49, 48, 51));
    panel2.add(customerAddressTf);

    // Customer PAN NO.

    customerPanNo = new JLabel();
    customerPanNo.setText(" Customer PAN No:");
    customerPanNo.setSize(150, 30);
    customerPanNo.setLocation(8, 105);
    customerPanNo.setForeground(Color.white);
    panel2.add(customerPanNo);

    customerPanNoTf = new JTextField();
    customerPanNoTf.setSize(100, 20);
    customerPanNoTf.setLocation(140, 110);
    customerPanNoTf.setForeground(Color.white);
    customerPanNoTf.setCaretColor(Color.white);
    customerPanNoTf.setBackground(new Color(49, 48, 51));
    panel2.add(customerPanNoTf);

    // Customer phone number

    customerPhoneNo = new JLabel();
    customerPhoneNo.setText(" Customer Phone No:");
    customerPhoneNo.setSize(150, 30);
    customerPhoneNo.setLocation(8, 135);
    customerPhoneNo.setForeground(Color.white);
    panel2.add(customerPhoneNo);

    customerPhoneNoTf = new JTextField();
    customerPhoneNoTf.setSize(100, 20);
    customerPhoneNoTf.setLocation(140, 140);
    customerPhoneNoTf.setForeground(Color.white);
    customerPhoneNoTf.setCaretColor(Color.white);
    customerPhoneNoTf.setBackground(new Color(49, 48, 51));
    panel2.add(customerPhoneNoTf);

    // Date of the instrumented selled.

    sellDate = new JLabel();
    sellDate.setText("Sell Date:");
    sellDate.setLocation(10, 170);
    sellDate.setSize(100, 20);
    sellDate.setForeground(Color.white);
    panel2.add(sellDate);

    sellDateD = new JComboBox<>();
    sellDateD.setLocation(140, 175);
    sellDateD.setSize(40, 20);
    sellDateD.setBackground(new Color(49, 48, 51));
    sellDateD.setForeground(Color.white);
    sellDateD.addItem("1");
    sellDateD.addItem("2");
    sellDateD.addItem("3");
    sellDateD.addItem("4");
    sellDateD.addItem("5");
    sellDateD.addItem("6");
    sellDateD.addItem("7");
    sellDateD.addItem("8");
    sellDateD.addItem("9");
    sellDateD.addItem("10");
    sellDateD.addItem("11");
    sellDateD.addItem("12");
    sellDateD.addItem("13");
    sellDateD.addItem("14");
    sellDateD.addItem("15");
    sellDateD.addItem("16");
    sellDateD.addItem("17");
    sellDateD.addItem("18");
    sellDateD.addItem("19");
    sellDateD.addItem("20");
    sellDateD.addItem("21");
    sellDateD.addItem("22");
    sellDateD.addItem("23");
    sellDateD.addItem("24");
    sellDateD.addItem("25");
    sellDateD.addItem("26");
    sellDateD.addItem("27");
    sellDateD.addItem("28");
    sellDateD.addItem("29");
    sellDateD.addItem("30");
    sellDateD.addItem("31");

    sellDateM = new JComboBox<>();
    sellDateM.setLocation(185, 175);
    sellDateM.setSize(55, 20);
    sellDateM.setBackground(new Color(49, 48, 51));
    sellDateM.setForeground(Color.white);
    sellDateM.addItem("JAN");
    sellDateM.addItem("FEB");
    sellDateM.addItem("MAR");
    sellDateM.addItem("APR");
    sellDateM.addItem("MAY");
    sellDateM.addItem("JUN");
    sellDateM.addItem("JULY");
    sellDateM.addItem("AUG");
    sellDateM.addItem("SEP");
    sellDateM.addItem("OCT");
    sellDateM.addItem("NOV");
    sellDateM.addItem("DEC");

    sellDateY = new JComboBox<>();
    sellDateY.setLocation(245, 175);
    sellDateY.setSize(60, 20);
    sellDateY.setBackground(new Color(49, 48, 51));
    sellDateY.setForeground(Color.white);
    sellDateY.addItem("2010");
    sellDateY.addItem("2011");
    sellDateY.addItem("2012");
    sellDateY.addItem("2013");
    sellDateY.addItem("2014");
    sellDateY.addItem("2015");
    sellDateY.addItem("2016");
    sellDateY.addItem("2017");
    sellDateY.addItem("2018");
    sellDateY.addItem("2019");
    sellDateY.addItem("2020");
    sellDateY.addItem("2021");
    sellDateY.addItem("2022");
    panel2.add(sellDateD);
    panel2.add(sellDateM);
    panel2.add(sellDateY);

    // Discount percentage

    discountPercent = new JLabel();
    discountPercent.setText(" Discount Percentage:");
    discountPercent.setSize(150, 30);
    discountPercent.setLocation(8, 200);
    discountPercent.setForeground(Color.white);
    panel2.add(discountPercent);

    discountPercentTf = new JTextField();
    discountPercentTf.setSize(50, 20);
    discountPercentTf.setLocation(140, 205);
    discountPercentTf.setForeground(Color.white);
    discountPercentTf.setCaretColor(Color.white);
    discountPercentTf.setBackground(new Color(49, 48, 51));
    discountPercentTf.setCaretColor(Color.white);
    panel2.add(discountPercentTf);

    // Button for selling instrument.

    sellButton = new JButton();
    sellButton.setSize(130, 25);
    sellButton.setBackground(new Color(49, 48, 51));
    sellButton.setLocation(140, 235);
    sellButton.setText("Sell Instrument");
    sellButton.setForeground(Color.white);
    panel2.add(sellButton);

    sellButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String instrumentNameToSell = instrumentNameToSellTextField.getText();
        String customerName2 = getcustomerName2();
        String customerAddress = getcustomerAddress();
        String customerPanNo2 = getcustomerPanNo2();
        String customerPhoneNo2 = getcustomerPhoneNo2();
        String discountPercent = getdiscountPercent();
        int customerPanNumber = 0;
        int customerPhoneNumber = 0;
        int discountpercentage = 0;
        String soldDate = getsellDate();
        boolean isFound = false;

        if (instrumentNameToSell.isEmpty() && customerName2.isEmpty() && customerAddress.isEmpty()
            && customerPanNo2.isEmpty() && customerPhoneNo2.isEmpty() && discountPercent.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Please fill all the fields", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        } else if (instrumentNameToSell.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the instrument name", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        } else if (customerName2.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the Customer name", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        } else if (customerAddress.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the Customer Address", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        } else if (customerPanNo2.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the Customer PAN No.", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        } else if (customerPhoneNo2.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the Customer Phone No.", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        } else if (discountPercent.isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Fill the amount of Discount ", "Validation",JOptionPane.WARNING_MESSAGE);
          return;
        } else
          try {
            customerPanNumber = Integer.parseInt(customerPanNo2);
            customerPhoneNumber = Integer.parseInt(customerPhoneNo2);
            discountpercentage = Integer.parseInt(discountPercent);
            if (customerPanNumber <= 0 || customerPhoneNumber <= 0 || discountpercentage <= 0) {
              JOptionPane.showMessageDialog(frame, "Only positive value is intalized", "Validation",JOptionPane.WARNING_MESSAGE);
              return;
            }

          } catch (Exception np) {
            JOptionPane.showMessageDialog(frame, "Only valid data is intalized ", "Validation",JOptionPane.WARNING_MESSAGE);
            return;
          }

        for (Instrument instrument3 : addInstrumentList) {
          if (instrument3.getInstrumentName().equals(getinstrumentNameToSell())) {
            isFound = true;
            if (instrument3 instanceof InstrumentToSell) {
              InstrumentToSell instrumentSell = (InstrumentToSell) instrument3;
              if (instrumentSell.getIsSold() == true) {
                JOptionPane.showMessageDialog(frame, "The instrument " + instrumentNameToSell + " is already sold.",
                    "Validation", JOptionPane.WARNING_MESSAGE);
                return;
              } else {
                instrumentSell.sellInstrument(customerName2, customerPhoneNo2, customerPanNumber, soldDate,
                    discountpercentage);
                JOptionPane.showMessageDialog(frame, "Instrument " + instrumentNameToSell + " is  sold successfully",
                    "Validation", JOptionPane.INFORMATION_MESSAGE);
                instrumentNameToSellTextField.setText("");
                customerNameTf.setText("");
                customerAddressTf.setText("");
                customerPanNoTf.setText("");
                customerPhoneNoTf.setText("");
                discountPercentTf.setText("");
                sellDateD.setSelectedIndex(0);
                sellDateM.setSelectedIndex(0);
                sellDateY.setSelectedIndex(0);
                return;

              }

            }

          }
        }
        if (isFound == false) {
          JOptionPane.showMessageDialog(frame,
              "Sorry, The instrument " + instrumentNameToSell + " is not available on stock to sell.", "Validation", JOptionPane.WARNING_MESSAGE);
          return;
        }
      }

    });

    // button creation for Displaying the data in the array list.
    displayButton = new JButton();
    displayButton.setText("Display");
    displayButton.setSize(100, 30);
    displayButton.setLocation(268, 540);
    displayButton.setBackground(Color.DARK_GRAY);
    displayButton.setForeground(Color.white);
    displayButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (Instrument instrument : addInstrumentList) {
          instrument.display();
        }

      }
    });

    frame.add(displayButton);

    // Clear button to clean all the fields in the Gui.

    clearButton = new JButton("Clear");
    clearButton.setSize(100, 30);
    clearButton.setLocation(413, 540);
    clearButton.setBackground(Color.DARK_GRAY);
    clearButton.setForeground(Color.white);
    frame.add(clearButton);

    clearButton.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        instrumentNameToRentTextField.setText("");
        customerNameRTextField.setText("");
        customerPhoneRTF.setText("");
        customerPanNoRTextField.setText("");
        rentComboBoxD.setSelectedIndex(0);
        rentComboBoxM.setSelectedIndex(0);
        rentComboBoxY.setSelectedIndex(0);
        returnComboBoxM.setSelectedIndex(0);
        returnComboBoxD.setSelectedIndex(0);
        returnComboBoxY.setSelectedIndex(0);
        NumberOfDaysRentedTextField.setText("");
        instrumentNameToSellTextField.setText("");
        customerNameTf.setText("");
        customerAddressTf.setText("");
        customerPanNoTf.setText("");
        customerPhoneNoTf.setText("");
        sellDateD.setSelectedIndex(0);
        sellDateM.setSelectedIndex(0);
        sellDateY.setSelectedIndex(0);
        discountPercentTf.setText("");
        instrumentNameATextField.setText("");
        instrumentPriceATextField.setText("");
        instrumentchargePerDayATextField.setText("");
        instrumentNameToReturnTextField.setText("");
        addInstrumentNameToSellLblTextField.setText("");

      }

    });

    frame.add(panel1);
    frame.add(panel2);
    frame.add(cpanel);
    frame.setVisible(true);
    frame.setResizable(false);

  }
}
