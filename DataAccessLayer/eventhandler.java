package BusinessLogicLayer;
import java.util.Scanner;







class eventhandler {
   // public void email(int bookingid,String eventype,String eventdate )
   // {
       //  final String password = "Mafanato1";

         //Properties props = new Properties();
        //  props.put("mail.smtp.starttls.enable", "true");
    //     props.put("mail.smtp.auth", "true");
    //     props.put("mail.smtp.host", "smtp.gmail.com");
    //     props.put("mail.smtp.port", "587");

    //     Session session = Session.getInstance(props,
    //       new javax.mail.Authenticator() {
    //         protected PasswordAuthentication getPasswordAuthentication() {
    //             return new PasswordAuthentication(username, password);
    //         }
    //       });

    //     try {

    //         Message message = new MimeMessage(session);
    //         message.setFrom(new InternetAddress("tmrdesign22@gmail.com"));
    //         message.setRecipients(Message.RecipientType.TO,
    //             InternetAddress.parse(email));
    //         message.setSubject("Booking Confirmed");
    //         message.setText("Greetings 👋"+"\n\n
    //         Congratulations your booking has been confirmed: "+ bookingid
    //             +"\n\n We would like to inform you that your event booking has been confirmed"+ "\n* *********************************"+"\n\n
    //             Event type: "+ eventtype+
    //             +"\n\n
    //         Date of Event : "+ eventdate+"\n\n
    //       %%%%%%%%%  we cant wait work with you to create magic #%%%%%%"
    //             + "\n Kind Regards\n Miss Raheal");

    //         Transport.send(message);

    //         System.out.println("Done");

    //     } catch (MessagingException e) {
    //         throw new RuntimeException(e);
    //     }
    // }
    private int computeprice(int numberofguest)
    {  int priceperguest=50;
      int totalprice = numberofguest * priceperguest;
       System.out.println("Total Price: R" + totalprice);
       return totalprice;

   }


    public void getdiscount(int numberofguest)
{
  if (numberofguest>40)
  {
     
      int totalprice= computeprice(numberofguest);
      int discountprice= totalprice* 10/100;
      int afterdprice= totalprice-discountprice;
      System.out.println("Discount calculated");
      System.out.println("Total Price: R"+afterdprice);
  }
  else
  {
    System.out.println("Dont qualify for Discount");
    System.out.println("Total Price: R"+computeprice(numberofguest));
    

  } 
  
}

public void getpercentage(int numberofguest)
{
    eventhandler hh = new eventhandler();
    int totalprice =hh.computeprice(numberofguest);
     
   int halfprice=totalprice*50/100;
  if ( totalprice-halfprice==halfprice)
  {
    System.out.println("Booking Confirmed");
    
  }
  else
  {
    System.out.println("Booking Not confirmed");
   
  }
}

    public void setguests(int numberofguest) 
    {
        computeprice(numberofguest);
    }

   
    public void Gettingnoofadults() {
        Scanner scan=null;
        try   
        {
        scan = new Scanner(System.in);
        int noofadults;
        System.out.println("Please Enter the Number of Adults attending the event: ");
        noofadults =Integer.parseInt(scan.nextLine());
        System.out.println("Number of adults: " + noofadults);
        }
        finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }

    }

    public void Gettingnoofkids() 
{  Scanner scan=null;
    try   
    {
        
            scan= new Scanner(System.in);
            int noofkids;
            System.out.println("Please Enter the Number of Adults attending the event: ");
            noofkids =Integer.parseInt(scan.nextLine());
           System.out.println("Number of kids: "+ noofkids);
    
    }
    finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }
        
   

}
public void GettingEventtype()
{Scanner scan=null;
    try   
    {
     scan = new Scanner (System.in);
 
    System.out.println("Please Enter your event Type From the given options;");
    System.out.print("\n1.Bapitism  \n2.Wedding \n3. Year end function \n4 Baby shower \n5 Birthday \n6 Other ");
    int option=scan.nextInt();
    
    switch (option)
     {
        case 1:

             System.out.println("We palnning an Bapitism ");
             Gettingnoofadults();
             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
            break;
         case 2:

            System.out.println("Congratulation on the wedding ");
             Gettingnoofadults();
             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
            break;
         case 3:

             System.out.println("We palnning a year end party");
             Gettingnoofadults();
             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
            break;
        case 4:

             System.out.println("New member in the family ,we are palnning a baby shower");
             Gettingnoofadults();
             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
            break;
        case 5:

             System.out.println("It is a birthday party");
             Gettingnoofadults();
             // add methods of decorations 
              //add methods of event details 
             //add methods of payment;
           break;
    
        case 6:
            // Scanner scannner = new Scanner (System.in);
              String typeofevent;
              System.out.println("Please enter the type of event");
              typeofevent=scan.nextLine();
              System.out.println("We planning an:" + typeofevent);
              Gettingnoofadults();
             // add methods of decorations 
             //add methods of event details 
              //add methods of payment;
          break;
        default:
        System.out.println("ERROR!!! Please enter the type of event ");
            break;
     }
    }
    finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }

}
}






