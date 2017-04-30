package javaapplication1;

import java.util.Random; 

public class JavaApplication1{
    
        private static int genStat() {
            Random rand = new Random(); 
            
            int statAdd = 2;
            
            for (int j = 0; j < 4; j++) {
                statAdd += rand.nextInt(6) + 1;
            }
           
            return statAdd;
        }
    
        private static int getGirlStat(int getIndex, int getStats) {
            try {
                
                int[][] girlStat = {
                    { 0,0,0,0,0,0 },
                    { 0,0,0,0,0,0 },
                    { 13,17,21,14,15,14 }, // static
                    { 13,15,19,18,22,16 } // static
                };
                
                for (int k = 0; k < 6; k++) {
                    girlStat[0][k] = genStat();
                    girlStat[1][k] = genStat();
                }
                        
                return girlStat[getIndex][getStats];
            }
            catch (IndexOutOfBoundsException e) {
                return -1;
            }
        }
        
        private static int getGirl ( int getGal ) {
            
            if (getGal > 3)
                return -1;
            else {
            
                String[] girlNames = { 
                    "Eto Yoshimura", 
                    "2B", 
                    "Kairi", 
                    "Agnes Oblige" 
                };
                
                int[] statMod = new int[6];
                int[] girlStore = new int[6];

                for(int i = 0; i < 6; i++) {
                    girlStore[i] = getGirlStat(getGal,i); // grab gIrl stats
                    statMod[i] = ( girlStore[i] - 10 ) / 2;
                }

                System.out.println("My girl '"+ girlNames[getGal] +  "' has these stats: ");
                System.out.println("STR: " + girlStore[0] + " (" + statMod[0] + ")");
                System.out.println("CON: " + girlStore[1] + " (" + statMod[1] + ")");
                System.out.println("DEX: " + girlStore[2] + " (" + statMod[2] + ")");
                System.out.println("INT: " + girlStore[3] + " (" + statMod[3] + ")");
                System.out.println("WIS: " + girlStore[4] + " (" + statMod[4] + ")");
                System.out.println("CHA: " + girlStore[5] + " (" + statMod[5] + ")\n");

            }
            
            return 0;
        }
    
	public static void main (String [] args) {
               
            getGirl(0);
            getGirl(1);
            getGirl(2);
            getGirl(3);
            getGirl(47364); // wont display

        }
                 

}	
