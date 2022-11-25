/* 
Paradise Express
Project Mile-Stone #4
Names: Timothy Viscal and John Luc
Team: #18
Course: MIS 350-001
Date:11/20/2020
This program is a vacation planning
website that will take user inputs
for their tropical island vacation and
print them a reciept with the nessicary 
information for their trip after they
have choosen their form of payment 
and delivery method.
*/
import java.util.Scanner;
public class ParadiseOriginalExpress {
   public static void main( String[] args ) {
      Scanner input = new Scanner( System.in );
      
      int tA = 1;
      int hW = 2;
      int fJ = 3;
      int pR = 4;
      int bR = 5;
      int dest = 0;
      
      String bru = "Bermuda";
      String hAw = "Hawaii";
      String fIj = "Fiji";
      String pUe = "Puerto Rico";
      String tAh = "Tahiti";
      String destination = "Empty";
      
      String jetAa = "American Airlines";
      String jetDa = "Delta Airlines";
      String jetUa = "United Airlines";
      String jetLf = "Lufthansa";
      String jetKl = "KLM";
      String jetPlane = "Empty";
      
      String fSt = "First Class";
      String bUs = "Business Class";
      String eCo = "Economy Class";
      String cLass = "Empty";
      
      String fRs = "Four Seasons";
      String hLt = "Canopy by Hilton";
      String cMf = "Comfort Inn & Suites";
      String hTl = "Empty";
      
      String mAil = "Sent To You In The Mail";
      String eMail = "E-Mailed to You";
      String dLvry = "Empty";
      
      String pMt = "Empty";
      String cAsh = "Cash";
      String cRedit = "Credit Card";      
      
      double distTahiti = 6066;
      double distHawaii = 4752;
      double distFiji = 7751;
      double distPuertoRico = 1556;
      double distBermuda = 831;
      double dist = 0;
      
      int aA = 1;
      int dA = 2;
      int uA = 3;
      int lFt = 4;
      int kLm = 5;
      int airline = 0;
      
      double aAl = 1738.24;
      double dAl = 1467.65;
      double uAl = 1003.31;
      double lFts = 2103.64;
      double kLmd = 1943.64;
      double airplane = 0;
      
      double airClass;
      double bClass = 535.62;
      double fClass = 950.34;
      double eClass = 0;
      double airClassPrice = 0;
      
      int hTelChoice = 0;
      int hTelFour = 1;
      int hTelHilton = 2;
      int hTelComfort = 3;
      
      double hTelPrice = 0;
      double hTelFourP = 1295.45;
      double hTelHiltonP = 569.24;
      double hTelComfortP = 125.23;
      
      double totalVacDays = 0;
      
      double subtotalAirline = 0;
      double subtotalHotel = 0;
      double tOtal = 0;
      
      char pmtInput;
      char dlvryInput;
      
      int errorVariable = 0;
      int errorTwoVariable = 0;
      int errorFourVariable = 0;
      int errorThreeVariable = 0;
      
      int editVariable = 0;
      
      //Title intro page and destination switch selection with error checking loop
      do { 
      System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t----------------------------------");
       
      System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\tWelcome to “Paradise-Express.com”!\n"); 
      
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t----------------------------------\n");  
      
      System.out.println("The Premier Travel Planning Website For “Tropical Island Getaways” Serving the Washington D.C. Metro Area!");   
      
      System.out.println("----------------------------------------------------------------------------------------------------------");
      
      System.out.print(" \n\n\n To Begin Your Adventure, Please Choose The Numbered Code Below That Matches The Island Destination For \n\n Your Preferred Vacation (e.g. 1 To Select 'Tahiti') And Type It In, Then Press Enter. The Island Distance\n\n In Miles Is Displayed Next To Each Island."); 
      
      System.out.print(" You Will Then Be Directed To Select Your Preferred Airline.");
      
      System.out.print("\n\n\n 1 - Tahiti        (6,066 Miles From The Washington D.C. Metro Area) \n\n\n 2 - Hawaii        (4,752 Miles From The Washington D.C. Metro Area) \n\n\n 3 - Fiji          (7,751 Miles From The Washington D.C. Metro Area) \n\n\n 4 - Puerto Rico   (1,556 Miles From The Washington D.C. Metro Area) \n\n\n 5 - Bermuda       (831 Miles From The Washington D.C. Metro Area)\n\n\n *Please Type In Your Desired Island Number Here (e.g. 1 To Select 'Tahiti'), Then Press Enter:");
      
      dest = input.nextInt();
      
      System.out.println("\n\n\n----------------------------------------------------------------------------------------------------------");
      
            
      switch(dest){
         case 1: System.out.printf("\nYour Destination Choice Was Tahiti! Excellent Choice! Your Round Trip Distance Is %.0f Miles.",(distTahiti * 2));dest = tA; destination = tAh;dist = (distTahiti * 2);
                 errorVariable = 0;
            break;
         case 2: System.out.printf("\nYour Destination Choice Was Hawaii! Excellent Choice! Your Round Trip Distance Is %.0f Miles.",(distHawaii * 2));dest = hW; destination = hAw;dist = (distHawaii * 2);
                 errorVariable = 0;
            break;
         case 3: System.out.printf("\nYour Destination Choice Was Fiji! Excellent Choice! Your Round Trip Distance Is %.0f Miles.",(distFiji * 2));dest = fJ; destination = fIj;dist = (distFiji * 2);
                 errorVariable = 0;
            break;
         case 4: System.out.printf("\nYour Destination Choice Was Puerto Rico! Excellent Choice! Your Round Trip Distance Is %.0f Miles.",(distPuertoRico * 2));dest = pR; destination = pUe;dist = (distPuertoRico * 2);
                 errorVariable = 0;
            break;
         case 5: System.out.printf("\nYour Destination Choice Was Bermuda! Excellent Choice! Your Round Trip Distance Is %.0f Miles.",(distBermuda * 2));dest = bR; destination = bru;dist = (distBermuda * 2);
                 errorVariable = 0; 
            break;
         default: System.out.printf("\nIncorrect selection option, please try again!\n\n----------------------------------------------------------------------------------------------------------\n");
                  errorVariable = 1; 
      } 
      
      } while (errorVariable == 1); 
      //Airline switch selection page with error checking loop
      do {    
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------\n");
      
      System.out.printf("\n\nNow Get Ready To Choose Your Airlines. Please Select From The Options Below and Type In The Numbered \n\nCode For Your Desired Airline (e.g. 1 To Select 'American Airlines'), Then Press Enter. Prices for Each \n\nAirline Going To Your Destination Are Listed Below. Also, According To Reviews The More Stars Next To The \n\nAirline The Faster Your Average Flight Time May Be And You Could Get To Your Destination Sooner! All\n\nTickets Are Round-Trip Which Include Your Return Trip In The Price As Well.\n\n");
                
      System.out.print("\n\n\n 1 - American Airlines: **** | Tickets: $1,738.24\n\n\n 2 - Delta Airlines: **      | Tickets: $1,467.65 \n\n\n 3 - United Airlines: *      | Tickets: $1,003.31 \n\n\n 4 - Lufthansa: *****        | Tickets: $2,103.64 \n\n\n 5 - KLM: ****               | Tickets: $1,943.64\n\n*Please Type Your Desired Airline Number Here (e.g. 1 To Select 'American Airlines'), Then Press Enter:");
   
      airline = input.nextInt();
      
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");  
           
      switch(airline){
         case 1: airplane = aAl;airline = aA;System.out.printf("\nYour Airline Choice Was American Airlines, with a ticket price of $%.2f.",aAl);jetPlane = jetAa;
                 errorVariable = 0;
            break;
         case 2: airplane = dAl;airline = dA;System.out.printf("\nYour Airline Choice Was Delta Airlines, with a ticket price of $%.2f.",dAl);jetPlane = jetDa;
                 errorVariable = 0;
            break;
         case 3: airplane = uAl;airline = uA;System.out.printf("\nYour Airline Choice Was United Airlines, with a ticket price of $%.2f.",uAl);jetPlane = jetUa;
                 errorVariable = 0;
            break;
         case 4: airplane = lFts;airline = lFt;System.out.printf("\nYour Airline Choice Was Lufthansa, with a ticket price of $%.2f.",lFts);jetPlane = jetLf;
                 errorVariable = 0;
            break;
         case 5: airplane = kLmd;airline = kLm;System.out.printf("\nYour Airline Choice Was KLM, with a ticket price of $%.2f.",kLmd);jetPlane = jetKl;
                 errorVariable = 0;
            break;  
         default: System.out.printf("\nIncorrect selection option, please try again!");
                  errorVariable = 1;
      }
      
      } while (errorVariable == 1);
      //Airline seating class switch selection page with error checking loop
      do {
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");  
                         
      System.out.print("\n\nNow You May Select Your Choice Of Seating Class. Please Choose From The Selections Below And Your\n\nFinal Ticket Price Will Be Increased By The Class You Have Chosen. Type In The Code For The Class \n\n(e.g. 1 To Select 'First Class') And Press Enter. Your Current Airline Ticket Subtotal Will Also Be \n\nDisplayed Below.");
    
      System.out.print("\n\n\n 1 - First Class    | $950.34         \n\n\n 2 - Business Class | $535.62        \n\n\n 3 - Economy Class  | FREE\n\n*Please Type Your Seating Class Number Here (e.g. 1 To Select 'Business Class'), Then Press Enter:"); 
         
      airClass = input.nextDouble();    
    
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");    
   
      switch((int)airClass){
         case 1: airClassPrice = fClass ;System.out.printf("\nYou Have Chosen First Class For An Additional $%.2f Your Airline Tickets Subtotal Is $%.2f.",fClass,(fClass + airplane));subtotalAirline = (fClass + airplane);cLass = fSt;
                 errorVariable = 0;
            break;
         case 2: airClassPrice = bClass ;System.out.printf("\nYou Have Chosen Business Class For An Additional $%.2f Your Airline Tickets Subtotal Is $%.2f.",bClass,(bClass + airplane));subtotalAirline = (bClass + airplane);cLass = bUs;
                 errorVariable = 0;
            break;
         case 3: airClassPrice = eClass;System.out.printf("\nYou Have Chosen Economy Class For An Additional $%.2f Your Airline Tickets Subtotal Is $%.2f.",eClass,(eClass + airplane));subtotalAirline = (eClass + airplane);cLass = eCo;
                 errorVariable = 0;
            break; 
         default: System.out.printf("\nIncorrect selection option, please try again!");
                  errorVariable = 1;       
      }
      } while (errorVariable == 1);  
      //Hotel switch selection page with error checking loop
      do {
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");
    
      System.out.print("\n\nNow You Get To Select Your Hotel For Your Amazing Island Vacation! You Can Choose A Three Star Motel\n\nSingle Bedroom With Just The Essentials, A Four Star Hotel With Three Rooms A Pool And Close To The Beach\n\nWith Meals Included, Or A Five Star Luxary Resort With Beach Front Views And An Exclusive Suite With\n\nFine Dining And All The Amenities You Would Need! Prices Per Day Are Below, Type In The Correct Code For\n\nYour Prefrence, Then Press Enter. \n\n");
   
      System.out.print("\n\n\n 1 - Four Seasons              | $1,295.45         \n\n\n 2 - Canopy by Hilton          | $569.24        \n\n\n 3 - Comfort Inn & Suites      | $125.23\n\n*Please Type In Your Hotel Number Here (e.g. 1 To Select 'Four Seasons'), Then Press Enter:");
   
      hTelChoice = input.nextInt();
   
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");
   
      switch(hTelChoice){
         case 1: hTelPrice = hTelFourP; hTelChoice = hTelFour;System.out.printf("\nYou Have Chosen The Four Seasons As Your Hotel For A Price Of $%.2f A Day.\n",hTelFourP); hTl = fRs;
                 errorVariable = 0;
            break;
         case 2: hTelPrice = hTelHiltonP; System.out.printf("\nYou Have Chosen Canopy by Hilton As Your Hotel For A Price Of $%.2f A Day.\n",hTelHiltonP); hTl = hLt;
                 errorVariable = 0;
            break;
         case 3: hTelPrice = hTelComfortP; System.out.printf("\nYou Have Chosen Comfort Inn & Suites As Your Hotel For A Price Of $%.2f A Day.\n",hTelComfortP); hTl = cMf;
                 errorVariable = 0;
            break;
         default: System.out.printf("\nIncorrect selection option, please try again!");
                  errorVariable = 1;              
         } 
      }while (errorVariable == 1);  
      
      System.out.println("\n----------------------------------------------------------------------------------------------------------");
      //Hotel duration selection in days with error checking loop of 10000 day limit and 1 day minimum
      do {
      
      System.out.print("\n\nNow that You Have Selected Where You Are Going To Spend Your Vacation And How You Will Get There Choose\n\nA Duraton Of Your Vacation In Days And You Will Recieve An Estimate Of Your Total Vacation Cost So Far.\n\nType In The Correct Code For Your Prefrence, Then Press Enter.\n\n\n*Please Type Vacation Duration In Days (e.g. type '7' For Seven Days Of Vacation), Then Press Enter:");
   
      totalVacDays = input.nextDouble();
      
      if (totalVacDays > 10000 | totalVacDays < 1){ System.out.printf("\n----------------------------------------------------------------------------------------------------------\n\nYour day value selection is above 10000 or less than 0 please type a diffrent day amount between 1 - 10000\n\n----------------------------------------------------------------------------------------------------------\n");
      }
      
      if (totalVacDays > 10000 | totalVacDays < 1)
         errorThreeVariable = 1;
         else errorThreeVariable = 0;
      } while (errorThreeVariable == 1);
      
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------");
      //Hotel day amount with cost
      System.out.printf("\nThe Total Cost Of Your Hotel So For %.0f Days Of Vacation Is $%.2f\n\n",totalVacDays,(totalVacDays * hTelPrice));subtotalHotel = (hTelPrice * totalVacDays);
      
      System.out.println("----------------------------------------------------------------------------------------------------------");
      //Subtotal section with switch statements and printf statements to inform the customer of their Subtotal before purchase
      System.out.println("\n\n\n----------------------------------------------------------------------------------------------------------\nS U B T O T A L    S U B T O T A L   S U B T O T A L   S U B T O T A L   S U B T O T A L   S U B T O T A L\n----------------------------------------------------------------------------------------------------------");
   
      switch(airline){
         case 1: System.out.printf("\nThe Airline You Have Chosen For Your Flight Is American Airlines and The Ticket Price Is $%.2f. \n\n",airplane);
            break;
         case 2: System.out.printf("\nThe Airline You Have Chosen For Your Flight Is Delta Airlines and The Ticket Price Is $%.2f. \n\n",airplane);
            break;
         case 3: System.out.printf("\nThe Airline You Have Chosen For Your Flight Is United Airlines and The Ticket Price Is $%.2f. \n\n",airplane);
            break;
         case 4: System.out.printf("\nThe Airline You Have Chosen For Your Flight Is Lufthansa and The Ticket Price Is $%.2f. \n\n",airplane);
            break;
         case 5: System.out.printf("\nThe Airline You Have Chosen For Your Flight Is KLM and The Ticket Price Is $%.2f. \n\n",airplane);
            break;
      }
       
      switch((int)airClass){
         case 2: System.out.printf("\nThe Airline Seating Class You Have Chosen For Your Flight Is Business Class For An Additional $%.2f. \n\n",airClassPrice);
            break;
         case 1: System.out.printf("\nThe Airline Seating Class You Have Chosen For Your Flight Is First Class For An Additional $%.2f. \n\n",airClassPrice);
            break;
         case 3: System.out.printf("\nThe Airline Seating Class You Have Chosen For Your Flight Is Economy Class For An Additional $%.2f. \n\n",airClassPrice);
            break;
      }
   
      System.out.printf("\nYour Airline Tickets Sub Total Cost Is $%.2f and Your Hotel Sub Total Costs $%.2f.\n\n\nYour Current Sub Total Is $%.2f For Your %.0f Day Vacation.\n\n",subtotalAirline,subtotalHotel, subtotalAirline + subtotalHotel, totalVacDays, tOtal = subtotalAirline + subtotalHotel);
      //Customer payment and delivery choice selection with error checking loop and if/else statements
      do {
      
      if ((errorTwoVariable == 2 | errorFourVariable == 4) | (errorTwoVariable == 2 & errorFourVariable == 4))System.out.printf("\n----------------------------------------------------------------------------------------------------------\n\nIncorrect selection option(s), please try again!\n\n----------------------------------------------------------------------------------------------------------\n\n");
      
      System.out.println("----------------------------------------------------------------------------------------------------------");
      
      System.out.println(" P A Y M E N T    P A Y M E N T     P A Y M E N T     P A Y M E N T     P A Y M E N T      P A Y M E N T  \n----------------------------------------------------------------------------------------------------------");
   
      System.out.println("\nNow Get Ready To Choose Your Form Of Patment And Enter It Below. You May Select 'C'/'c' To Pay With Cash\n\nOr You May Select 'R'/'r' To Pay With Credit Card, Type In Your Option And Then Press Enter (e.g. Type R\n\nFor Credit Card Then Press Enter). Afterwards You Will Select Your Mode Of Delivery For The Tickets And\n\nHotel Reservations. You May Select 'M'/'m' For The Tickets and Reservations To Be Mailed To You Or 'E'/'e'\n\nFor The Tickets and Reservations to Be E-Mailed To You, Please Type In Your Option And Then Press\n\nEnter (e.g. Type E For Email Then Press Enter). Afterwards Your Reciept Will Be Printed With The Complete\n\nDetails Of Your Purchase And Air Miles Included. ");   
   
      System.out.print("\n\n\n*Please Type Payment Option Here Then Press Enter (e.g. Type R or r For Credit Card or c or C for Cash):");
      
      pmtInput = 'r';
      
      pmtInput = input.next().charAt(0);
      
      System.out.print("\n\n\n*Please Type Your Delivery Option Here Then Press Enter (e.g. Type m or M For Mail or e or E for Email):");
      
      dlvryInput = 'm';
      
      dlvryInput = input.next().charAt(0);
   
      if (pmtInput == 'c' || pmtInput == 'C'){
         System.out.println("\n\n\n----------------------------------------------------------------------------------------------------------");
         System.out.print("\nThe Payment Option You Have Chosen Is By Cash.\n\n");
         pMt = cAsh;
         errorTwoVariable = 0;
      }
       
      else if(pmtInput == 'r' || pmtInput == 'R'){
         System.out.println("\n\n\n----------------------------------------------------------------------------------------------------------");
         System.out.print("\nThe Payment Option You Have Chosen Is By Credit Card.\n\n");
         pMt = cRedit;
         errorTwoVariable = 0;       
      } else errorTwoVariable = 2;
      
      
      
      if(dlvryInput == 'm' || dlvryInput == 'M'){
         System.out.println("----------------------------------------------------------------------------------------------------------");
         System.out.print("\nThe Delivery Option You Have Chosen Is By Mail.\n\n");
         dLvry = mAil;
         errorFourVariable = 0;
      }
       
      else if(dlvryInput == 'e' || dlvryInput == 'E'){
         System.out.println("\n\n\n----------------------------------------------------------------------------------------------------------");
         System.out.print("\n\nThe Delivery Option You Have Chosen Is By Email.\n\n");
         dLvry = eMail;
         errorFourVariable = 0;       
      } else errorFourVariable = 4;
             
      } while ((errorTwoVariable == 2 | errorFourVariable == 4) | (errorTwoVariable == 2 & errorFourVariable == 4));
      //Reciept printed by calling on all previous variables in printf statements
      System.out.println("----------------------------------------------------------------------------------------------------------");
     
      System.out.println("\nThank You For Choosing “Paradise Express” For Your Tropical Island Getaway!!!!!\n");
   
      System.out.println("|-----------------------------------------------------------------------------------------------------------\n\n**Printed Below Is Your Reciept** \n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\n|\nV");
   
      System.out.println("|--------------------------------------------------------------------\n|R E C E I P T      R E C E I P T     R E C E I P T     R E C E I P T\n|--------------------------------------------------------------------");
   
      System.out.print("|\n|D E S T I N A T I O N\n|---------------------\n|Tropical Island Destination Is ");
      
      System.out.print(destination);
      
      System.out.print("\n|\n|A I R L I N E\n|-------------");
   
      System.out.printf("\n|Airline For Flight: ");
      
      System.out.print(jetPlane);
          
      System.out.printf("\n|Airline Ticket Price:                            $%.2f \n",airplane);
      
      System.out.printf("|Seating Class Choice: ");
            
      System.out.print(cLass);
      
      System.out.printf("\n|Seating Class Price:                             $%.2f \n",airClassPrice);
            
      System.out.printf("|Sub Total Airline Tickets:                       $%.2f", subtotalAirline);
     
      System.out.printf("\n|\n|H O T E L\n|---------\n");
   
      System.out.printf("|Hotel Choice: ");
      
      System.out.print(hTl);
      
      System.out.printf("\n|Hotel Daily Rate:                                $%.2f\n",hTelPrice);
       
      System.out.printf("|Total Days Stayed At Hotel:                      %.0f",totalVacDays);
   
      System.out.printf("\n|Sub Total Hotel Reservation:                     $%.2f\n",subtotalHotel);
   
      System.out.printf("|\n|G R A N D    T O T A L\n|----------------------"); 
   
      System.out.printf("\n|Grand Total For Vacation Package:                $%.2f", tOtal);
   
      System.out.println("\n|--------------------------------------------------------------------");
      
      System.out.printf("|A I R  -  M I L E S\n|-------------------\n|Total Air Miles Added:                           %.0f",(dist)); 
    
      System.out.println("\n|--------------------------------------------------------------------\n|");
      
      System.out.printf("|P A Y M E N T    P R O C E S S E D\n|----------------------------------\n|Your Account Has Been Charged Via: ");
      
      System.out.print(pMt);
   
      System.out.printf("\n|D E L I V E R Y\n|-----------------\n|Your Tickets and Reservations Will Be ");
      
      System.out.print(dLvry);                             
       
      System.out.println("\n|--------------------------------------------------------------------");
   
      System.out.println("|THANK       YOU       FOR       CHOOSING       'PARADISE EXPRESS'!!!"); 
      
      System.out.println("|--------------------------------------------------------------------");
      
      System.out.println("|ENJOY         YOUR        TROPICAL        ISLAND        VACATION!!!!");
   
      System.out.println("|--------------------------------------------------------------------\n");
   } 
   
}


