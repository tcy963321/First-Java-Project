/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel20;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

class DisplayOverloading2
{
  
        String M="Malaysian", m="MALAYSIAN",ma="malaysian",quantity,national,payment,name,Identity,Check_in_Date,Check_out_Date,day,month,years,choice,days,msg,FAMILY="FAMILY",Family="FAMILY",family="FAMILY",SUITE="SUITE",Suite="SUITE",suite="SUITE",DELUXE_SUITE="DELUXE SUITE",Deluxe_Suite="DELUXE SUITE",deluxe_suite="DELUXE SUITE",DELUXESUITE="DELUXE SUITE",deluxesuite="DELUXE SUITE",DeluxeSuite="DELUXE SUITE",Deluxesuite="DELUXE SUITE",PREMIER_SUITE="PREMIER SUITE",Premier_Suite="PREMIER SUITE",premier_suite="PREMIER SUITE",PREMIERSUITE="PREMIER SUITE",PremierSuite="PREMIER SUITE",premiersuite="PREMIER SUITE",Premiersuite="PREMIER SUITE",PRESIDENT_SUITE="PRESIDENT SUITE",President_Suite="PRESIDENT SUITE",president_suite="PRESIDENT SUITE",PRESIDENTSUITE="PRESIDENT SUITE",PresidentSuite="PRESIDENT SUITE",presidentsuite="PRESIDENT SUITE",Presidentsuite="PRESIDENT SUITE";
        double Quantity,Total,Second_Disccount,S_D=0.05,D,RENT,SERVICE_CHARGE,TOTAL_RENT,PAYMENT_FROM_CUSTOMER,Balance,F=350,S=600,DS=750,PS=900,P_S=1500,Service_charge=0.10,Disccount=0.05,Dis,GRAND_TOTAL;
  
  public void menu(int menu)
  {
      String[][] Menu = { { "Room Type                Price(RM)Per Night"}, { "FAMILY                                     350"}, { "SUITE                                        600"}, { "DELUXE SUITE                        750"} , { "PREMIER SUITE                      900"}, { "PRISIDENT SUITE                   1500"} };
      JOptionPane.showMessageDialog(null,Menu);  
  }
   public void info(int info)
   {         
             name = JOptionPane.showInputDialog(null,"Please Enter Your Name: ","Customer Name",JOptionPane.INFORMATION_MESSAGE);
             Identity = JOptionPane.showInputDialog(null,"Please Enter Your Identity Card Number with format (96041508xxxx) or Passport Number: ","Identity Card Number or Passport Number",JOptionPane.WARNING_MESSAGE);
             national = JOptionPane.showInputDialog(null,"Please Enter Your National:(e.g Malaysian) ","National",JOptionPane.INFORMATION_MESSAGE);
             choice = JOptionPane.showInputDialog(null,"Please Enter Your Choice:(e.g premiersuite)","Room Choice",JOptionPane.INFORMATION_MESSAGE);
             days = JOptionPane.showInputDialog(null,"Please Enter How Long To Staying: ","Staying",JOptionPane.INFORMATION_MESSAGE);
             quantity = JOptionPane.showInputDialog(null,"Please Enter Quantity of Room: ","Quantity of Room",JOptionPane.INFORMATION_MESSAGE);
             Check_in_Date=JOptionPane.showInputDialog(null,"Please Enter Check in Date with format in DD-MM-YY or DD/MM/YYYY.: ","Check in Date",JOptionPane.INFORMATION_MESSAGE);
             Check_out_Date=JOptionPane.showInputDialog(null,"Please Enter Check out Date with format in DD-MM-YY or DD/MM/YYYY.: ","Check out Date",JOptionPane.INFORMATION_MESSAGE);
             D = Double.parseDouble(days);
             Quantity=Double.parseDouble(quantity);
   }
   public void choose(int choose)
   {
    switch(choice)
         {
         case "FAMILY": case "Family": case "family":
         if(national.equals(M)||national.equals(m)||national.equals(ma))
             {
               RENT= F*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               Dis=Disccount*TOTAL_RENT;
               GRAND_TOTAL=TOTAL_RENT-Dis;
               if(GRAND_TOTAL>=1050)
               {
                 Second_Disccount=GRAND_TOTAL*S_D;
                 Total=GRAND_TOTAL-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
               else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+GRAND_TOTAL,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER- GRAND_TOTAL;
               }
             }
             else 
             {
               RENT= F*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               if( TOTAL_RENT>=1050)
               {
                 Second_Disccount=TOTAL_RENT*S_D;
                 Total=TOTAL_RENT-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
               else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+TOTAL_RENT,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER-TOTAL_RENT;
               }
             }     
         break;
   
         case "SUITE": case "Suite": case "suite": 
             if(national.equals(M)||national.equals(m)||national.equals(ma))
             {
               RENT= S*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               Dis=Disccount*TOTAL_RENT;
               GRAND_TOTAL=TOTAL_RENT-Dis;
               if(GRAND_TOTAL>=1800)
               {
                 Second_Disccount=GRAND_TOTAL*S_D;
                 Total=GRAND_TOTAL-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
               else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+GRAND_TOTAL,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER- GRAND_TOTAL;
               }
             }
             else 
             {
               RENT= S*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
                if( TOTAL_RENT>=1800)
               {
                 Second_Disccount=TOTAL_RENT*S_D;
                 Total=TOTAL_RENT-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
                }
                else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+TOTAL_RENT,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER-TOTAL_RENT;
               }
             }     
         break;
          
         case"DELUXE_SUITE": case"Deluxe_Suite": case"deluxe_suite": case"deluxesuite": case"DELUXESUITE": case"DeluxeSuite": case"Deluxesuite":
             if(national.equals(M)||national.equals(m)||national.equals(ma))
             {
               RENT= DS*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               Dis=Disccount*TOTAL_RENT;
               GRAND_TOTAL=TOTAL_RENT-Dis;
                if(GRAND_TOTAL>=2150)
               {
                 Second_Disccount=GRAND_TOTAL*S_D;
                 Total=GRAND_TOTAL-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
               else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+GRAND_TOTAL,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER- GRAND_TOTAL;
               } 
             }
             else
             {
               RENT= DS*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               if( TOTAL_RENT>=2150)
               {
                 Second_Disccount=TOTAL_RENT*S_D;
                 Total=TOTAL_RENT-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
                else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+TOTAL_RENT,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER-TOTAL_RENT;
                }
             }     
         break;
         
          case"PREMIER_SUITE": case"Premier_Suite": case"premier_suite": case"PREMIERSUITE": case"PremierSuite": case"premiersuite": case"Premiersuite":
              if(national.equals(M)||national.equals(m)||national.equals(ma))
             {
               RENT= PS*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               Dis=Disccount*TOTAL_RENT;
               GRAND_TOTAL=TOTAL_RENT-Dis;
                if(GRAND_TOTAL>=2700)
               {
                 Second_Disccount=GRAND_TOTAL*S_D;
                 Total=GRAND_TOTAL-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
                }
               else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+GRAND_TOTAL,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER- GRAND_TOTAL;
               }
             }
             else 
             {
               RENT= PS*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               if( TOTAL_RENT>=2700)
               {
                 Second_Disccount=TOTAL_RENT*S_D;
                 Total=TOTAL_RENT-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
                else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+TOTAL_RENT,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER-TOTAL_RENT;
               }
             }     
         break;
         
         case"PRESIDENT_SUITE": case"President_Suite": case"president_suite": case"PRESIDENTSUITE": case"PresidentSuite": case"presidentsuite": case"Presidentsuite":
             if(national.equals(M)||national.equals(m)||national.equals(ma))
             {
               RENT= P_S*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               Dis=Disccount*TOTAL_RENT;
               GRAND_TOTAL=TOTAL_RENT-Dis;
               if(GRAND_TOTAL>=4500)
               {
                 Second_Disccount=GRAND_TOTAL*S_D;
                 Total=GRAND_TOTAL-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
               }
                else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+GRAND_TOTAL,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER- GRAND_TOTAL;
               } 
             }
             else 
             {
               RENT= P_S*D*Quantity;
               SERVICE_CHARGE=RENT*Service_charge;
               TOTAL_RENT=RENT+SERVICE_CHARGE;
               if( TOTAL_RENT>=4500)
               {
                 Second_Disccount=TOTAL_RENT*S_D;
                 Total=TOTAL_RENT-Second_Disccount;
                 payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+Total,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
                 PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
                 Balance=PAYMENT_FROM_CUSTOMER-Total;
                 }
                else
               {
               payment = JOptionPane.showInputDialog(null,"GRAND TOTAL RM"+TOTAL_RENT,"PAYMENT FROM CUSTOMER",JOptionPane.INFORMATION_MESSAGE);
               PAYMENT_FROM_CUSTOMER = Double.parseDouble(payment);
               Balance=PAYMENT_FROM_CUSTOMER-TOTAL_RENT;
               }
             }     
         break;
         
          default:
             JOptionPane.showMessageDialog(null,"Invalid Enter Customer Please Run Again The Program");
         break;
   }
}
    public void output(int output)
    {
    if(national.equals(M)||national.equals(m)||national.equals(ma))
    {
        if(Second_Disccount>0)
        {   
         JOptionPane.showMessageDialog(null,"*****************************************************"+"\n"+
                                                             "HOTEL LANGKAWI OUT"+"\n"+
                                                    "65, JALAN PANDAK MAYAH, KUAH LANGKAWI"+"\n"+
                                                        "TEL: 04-5678900 FAX: 04-5678901"+"\n"+
                                                   "*****************************************************"+"\n"+
                                                                        "\n"+
                                                    "CUSTOMER NAME: "+name+"\n"+
                                                    "Identity Card Number or Passport Number: "+Identity+"\n"+
                                                    "National: "+national+"\n"+
                                                                        "\n"+
                                                        "***********ROOM TYPE************"+"\n"+
                                                                        "\n"+
                                                             "Your Room Type: "+choice+"\n"+  
                                                             "Staying For (Days): "+days+"\n"+
                                                             "Quantity of Room: "+Quantity+"\n"+
                                                             "Check in Date:" +Check_in_Date+"\n"+
                                                             "Check out Date:" +Check_out_Date+"\n"+
                                                                         "\n"+
                                                  "**************PAYMENT DETAILS****************"+"\n"+
                                                                         "\n"+
                                                             "Rent:RM "+RENT+"\n"+              
                                                             "SERVICE CHARGE:RM "+SERVICE_CHARGE+"\n"+
                                                             "TOTAL RENT:RM "+TOTAL_RENT+"\n"+
                                                             "Discount (5%):RM "+Dis+"\n"+
                                                             "GRAND TOTAL:RM"+GRAND_TOTAL+"\n"+
                                                             "Promotion Discount (5%):RM"+Second_Disccount+"\n"+
                                                             "Total:RM"+Total+"\n"+
                                                             "YOUR PAYMENT FROM CUSTOMER:RM"+PAYMENT_FROM_CUSTOMER+"\n"+
                                                             "Balance:RM"+String.format("%.2f", (Balance))+"\n"+
                                                                            "\n"+
                                             "**************THANK YOU.PLEASE COME AGAIN**************","RECEIPT", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
         JOptionPane.showMessageDialog(null,"*******************************************************"+"\n"+
                                                             "HOTEL LANGKAWI OUT"+"\n"+
                                                    "65, JALAN PANDAK MAYAH, KUAH LANGKAWI"+"\n"+
                                                        "TEL: 04-5678900 FAX: 04-5678901"+"\n"+
                                                   "******************************************************"+"\n"+
                                                                        "\n"+
                                                    "CUSTOMER NAME: "+name+"\n"+
                                                    "Identity Card Number or Passport Number: "+Identity+"\n"+
                                                    "National: "+national+"\n"+
                                                                        "\n"+
                                                        "***********ROOM TYPE************"+"\n"+
                                                                        "\n"+
                                                             "Your Room Type: "+choice+"\n"+  
                                                             "Staying For (Days): "+days+"\n"+
                                                             "Quantity of Room: "+Quantity+"\n"+
                                                             "Check in Date:" +Check_in_Date+"\n"+
                                                             "Check out Date:" +Check_out_Date+"\n"+
                                                                         "\n"+
                                                  "**************PAYMENT DETAILS****************"+"\n"+
                                                                         "\n"+
                                                             "Rent:RM "+RENT+"\n"+              
                                                             "SERVICE CHARGE:RM "+SERVICE_CHARGE+"\n"+
                                                             "TOTAL RENT:RM "+TOTAL_RENT+"\n"+
                                                             "Discount (5%):RM "+Dis+"\n"+
                                                             "TOTAL:RM"+GRAND_TOTAL+"\n"+
                                                             "YOUR PAYMENT FROM CUSTOMER:RM"+PAYMENT_FROM_CUSTOMER+"\n"+
                                                             "Balance:RM"+String.format("%.2f", (Balance))+"\n"+
                                                                            "\n"+
                                             "**************THANK YOU.PLEASE COME AGAIN**************","RECEIPT", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    else
    {
     if(Second_Disccount>0)
     {
     JOptionPane.showMessageDialog(null,"********************************************************"+"\n"+
                                                             "HOTEL LANGKAWI OUT"+"\n"+
                                                    "65, JALAN PANDAK MAYAH, KUAH LANGKAWI"+"\n"+
                                                        "TEL: 04-5678900 FAX: 04-5678901"+"\n"+
                                                   "*******************************************************"+"\n"+
                                                                        "\n"+
                                                    "CUSTOMER NAME: "+name+"\n"+
                                                    "Identity Card Number or Passport Number: "+Identity+"\n"+
                                                    "National: "+national+"\n"+
                                                                        "\n"+
                                                        "***********ROOM TYPE************"+"\n"+
                                                                        "\n"+
                                                             "Your Room Type: "+choice+"\n"+  
                                                             "Staying For (Days): "+days+"\n"+
                                                             "Quantity of Room: "+Quantity+"\n"+
                                                             "Check in Date:" +Check_in_Date+"\n"+
                                                             "Check out Date:" +Check_out_Date+"\n"+
                                                                         "\n"+
                                                  "**************PAYMENT DETAILS****************"+"\n"+
                                                                         "\n"+
                                                             "Rent:RM "+RENT+"\n"+              
                                                             "SERVICE CHARGE:RM "+SERVICE_CHARGE+"\n"+
                                                             "TOTAL RENT:RM "+TOTAL_RENT+"\n"+
                                                             "Promotion Discount (5%):RM"+Second_Disccount+"\n"+
                                                             "Total:RM"+Total+"\n"+
                                                             "YOUR PAYMENT FROM CUSTOMER:RM"+PAYMENT_FROM_CUSTOMER+"\n"+
                                                             "Balance:RM"+String.format("%.2f", (Balance))+"\n"+
                                                                            "\n"+
                                             "**************THANK YOU.PLEASE COME AGAIN**************","RECEIPT", JOptionPane.INFORMATION_MESSAGE);
     }
     else
     {
     JOptionPane.showMessageDialog(null,"*******************************************************"+"\n"+
                                                             "HOTEL LANGKAWI OUT"+"\n"+
                                                    "65, JALAN PANDAK MAYAH, KUAH LANGKAWI"+"\n"+
                                                        "TEL: 04-5678900 FAX: 04-5678901"+"\n"+
                                                   "*****************************************************"+"\n"+
                                                                        "\n"+
                                                    "CUSTOMER NAME: "+name+"\n"+
                                                    "Identity Card Number or Passport Number: "+Identity+"\n"+
                                                    "National: "+national+"\n"+
                                                                        "\n"+
                                                        "***********ROOM TYPE************"+"\n"+
                                                                        "\n"+
                                                             "Your Room Type: "+choice+"\n"+  
                                                             "Staying For (Days): "+days+"\n"+
                                                             "Quantity of Room: "+Quantity+"\n"+
                                                             "Check in Date:" +Check_in_Date+"\n"+
                                                             "Check out Date:" +Check_out_Date+"\n"+
                                                                         "\n"+
                                                  "**************PAYMENT DETAILS****************"+"\n"+
                                                                         "\n"+
                                                             "Rent:RM "+RENT+"\n"+              
                                                             "SERVICE CHARGE:RM "+SERVICE_CHARGE+"\n"+
                                                             "TOTAL:RM "+TOTAL_RENT+"\n"+
                                                             "YOUR PAYMENT FROM CUSTOMER:RM"+PAYMENT_FROM_CUSTOMER+"\n"+
                                                             "Balance:RM"+String.format("%.2f", (Balance))+"\n"+
                                                                            "\n"+
                                             "**************THANK YOU.PLEASE COME AGAIN**************","RECEIPT", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    }
    }

public class Hotel20 
{
    public static void main(String[] args)
    {
       boolean again =true;
       while(again)
       {
       DisplayOverloading2 obj = new DisplayOverloading2();
       obj.menu(1);
       obj.info(2);
       obj.choose(3);
       obj.output(4);
       String y="y",n="n";
       y = JOptionPane.showInputDialog(null,"Do you want to repeat (y/n): ","Repeat",JOptionPane.INFORMATION_MESSAGE);
       switch(y)
       {
       case "y":   
       break;
       default:
            System.exit(0);
       break;
       }
    }
    }
}



