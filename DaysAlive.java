// Load Date formats and Calendar
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class DaysAlive {
  public static void main(String args[]) {
    // String MUST be capitalized or it won't work, ya chicken
    String MyName = "Jamie L";
    
    // Make the dates look pretty, because if you dont, what is wrong with you?
    DateFormat prettyDF = new SimpleDateFormat("MM-dd-yyyy"); // prints the day like 01-01-1970, looks sorta like JS!
    
    // Calendar instances
    Calendar MyBday = Calendar.getInstance(); // Creates a Calendar object for my birthday
    MyBday.set(1994, 0, 12); // sets the MyBday To the Actual Date of my Birthday, Start from 0 Nerd!
    Calendar PresentDay = Calendar.getInstance(); // Creates ANOTHER calendar object, this time for todays date.
             
    long Desu1 = (PresentDay.getTimeInMillis() - MyBday.getTimeInMillis()); // PRESENT DAY, PRESENT TIME minus my Bday ofc
    double Desu2 = Desu1 / (24 * 60 * 60 * 1000); // Make milliseconds into days; Not sure if doubles are good for long equations?
         
    // Data for the actuall assignment!     
    int MyYears = 23;
    double MyDays =  MyYears * 365.25;
    
    System.out.println("I'm " + MyName + " and I was " + MyDays + " days old last bday!");
    System.out.println("That's about " + MyYears + " years, if you're wondering.\n");
    System.out.println("Though, if were counting from today's date, " + prettyDF.format(PresentDay.getTime()) + ",");
    System.out.println("Then I'm actually " + Desu2 + " days old! Which is pretty cool.");   

  }
}
    
