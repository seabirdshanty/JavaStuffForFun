package caeserblock;

import static java.lang.Math.*;
import java.util.*;


public class Caeserblock {
    
    private static char neroItDown(char c, int shift) { // shift
        c =  Character.toLowerCase(c);
        c -= 'a';
        c += shift;
        c %= 26;
        c += 'a';
        return c;    
    }
    
    private static char childOfLight() { // random letters
        Random r = new Random();
        char rando = (char) (r.nextInt(26) + 'a');
        return rando;
    }
    
    public static void main(String[] args) {
        
        String s;
        int shift;
        Scanner inp = new Scanner(System.in);
 
        try {
            
            System.out.println("shift  #: ");
            s = " ";
            s = inp.nextLine();
            shift = Integer.parseInt(s);
            
            System.out.println("input text below, press Enter # Enter to proccess:");
            s = " ";
            s = inp.nextLine();
            
            
            while(inp.hasNext()) {
                s = s + inp.nextLine();
                if(s.contains("#"))
                    break;
            }

            s = s.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(s);
            s = s.toLowerCase();

            int len = s.length();
            int side = 0;

            while((side * side) < len)
                 side++;//System.err.printf("s*s < len");


            // side will form matrix
            char[][] matrix = new char[side][side];
            int count = 0;

            for(int i = 0; i < side; i++) {
                for(int j = 0; j < side; j++) {
                    if (count < len) {
                        matrix[i][j] = s.charAt(count++);
                        matrix[i][j] = neroItDown(matrix[i][j], shift);
                    }
                    else
                        matrix[i][j] = childOfLight();
                    
                    System.out.printf("%c", matrix[i][j]);
                }
                System.out.println();
            }
              
        }
        catch (Exception e) { System.err.printf("!"); }

        }       

    }

