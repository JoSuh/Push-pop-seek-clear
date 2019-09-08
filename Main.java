/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This program uses the stack 'MyStack'
 *
 ****************************************************************************/

import java.util.Scanner;

//****************************************************************************
public class Main {
	//This class tests the stack
	
	//-----------------------
	public static void main(String[] args)  throws Exception  {
		//instantiate a stack object and insert/remove stuff
		Scanner scanner = new Scanner(System.in);
    	Integer inputNumber = 0;
    	
    	
    	//get integer input
    	while (true) {
    		System.out.println("Try a number: ");
    	    
        	try {
    			//check if response is an integer
        		inputNumber = Integer.parseInt( scanner.nextLine() );
        		break;
    		}catch (IllegalArgumentException notInt) { 
    			System.out.println("Insert an integer!");
    			//do you need to rest as default?
    			inputNumber=null;
    		}
    	}
    	
    	//instantiate stack
    	//list of integers
    	MyStack<Integer> stackObject = new MyStack<Integer>();
    	/*************************************************************
    	 *boolean empty() 
    	 *-> Tests if this stack is empty.
    	 *
		  E  peek() 
		  -> Looks at the object at the top of this stack without removing it from the stack.
		  
		  E  pop() 
		  ->  Removes the object at the top of this stack and returns that object as 
		  the value of this function.
		 
		  E  push(E item) 
		  ->   Pushes an item onto the top of this stack.
		  
		  int search(Object o) 
		  ->   Returns the 1-based position where an object is on this stack.
    	 ************************************************************/
    	//push to list
		stackObject.push(inputNumber);
		stackObject.push(inputNumber);
		stackObject.push(inputNumber);
		System.out.println("Pushed " + stackObject.at(0));
		System.out.println("List: " + stackObject.str());
		
		//pop from list
		System.out.println("Poped " + stackObject.pop());
		System.out.println("List: " + stackObject.str());
		
		//peek the top item
		System.out.println("Peek " + stackObject.peek());
		
		//clear whole stack
		System.out.println("Cleared list: " + stackObject.clear());
		
		//pop error
		System.out.println("pop error " + stackObject.pop());

	}
}
