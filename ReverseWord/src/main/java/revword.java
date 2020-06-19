/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class revword {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public revword( int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    //put item in top of stack
    public void push(char j){
        stackArray[++top] = j;
    }
    //delete item from top of stack
    public char pop(){
        return stackArray[top--];
    }
    //peek item
    public char peek(){
        return stackArray[top];
    }
    //check if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
}
