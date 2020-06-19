
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class reversewordApp {
    public static void main(String args[]) throws IOException{
        String input, output;
        while(true){
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            
            if(input.equals("")){
               break;    
            }
               reversing theReverser = new reversing(input);
               output = theReverser.reverse();
               System.out.println("reversed word: " + output );
            }
        }
        

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
