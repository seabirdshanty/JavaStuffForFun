package caeserblock;

import static java.lang.Math.*;
import java.util.*;


public class Caeserblock {
    
    private static char neroItDown(char c, int shift) {
        boolean uppercase;
        if(Character.isLowerCase(c))
            uppercase = false;
	else
            uppercase = true;
        c =  Character.toLowerCase(c);
        c -= 'a';
        c += shift;
        c %= 26;
        c += 'a';
        if(uppercase) c = Character.toUpperCase(c);
        return c;    
    }
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String input, crunch = " ";
        char c;
        char[] myText;
        char[][] textMatrix;
        
        int i, shift, w, x, z, k = 0;
        double y;
       
       sc.useDelimiter("");
       
       //input = "My name is Cloud, I have a sword. I fight cactaurs because I'm bored..";
       
       try {
            System.out.println("shift  #: ");
            input = " ";
            input = sc.nextLine();
               
            shift = Integer.parseInt(input);
            System.out.println("input text below:");
           
            input = " ";
            input = sc.nextLine();
              
            x = input.length();
            y = (double) sqrt(x);
            z = (int) ceil(y);
            w = z * z;
            
            myText = new char[w];
            
            for(i = 0; i < w; i++)
                myText[i] = '#'; // myText[i] = neroItDown('x', shift);       
            
           while (sc.hasNext()) {
               
               //input = input.replaceAll("[^a-zA-Z0-9 ]", "#");
               
               for (i = 0; i < input.length(); i++){
                    c = input.charAt(i);   
                    
                    if(c == '#')
                        c = ' ';  
                    else if (c == ' ')
                        c = '#';
                    
                    if(Character.isLetter(c))
                         c = neroItDown(c, shift);
                    
                    myText[i] = c;
                    
                    // System.out.printf("%c", c);
                }

                crunch = new String(myText);
                
                k++;
                if (k >= w)
                    break;
            } // while sc.hasNext()
           
           System.out.println(crunch);
           
        }// try
        catch (Exception e) {
            System.err.printf("Exception %s\n", e.toString());
        }          
 
        // System.out.println("\n");
        
    }
    
}
