/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class reversing {
    private String input;
    private String output;
    
    public reversing(String in){
        input = in;
    }
    //reverse method
    public String reverse(){
        int wordSize = input.length();
        revword theword = new revword(wordSize);
        
        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);              //this gets a character from imput
            theword.push(ch);
        }
       output = " "; 
       while(!theword.isEmpty()){
           char ch = theword.pop();
           output = output + ch;
       }
       return output;
    }
}
