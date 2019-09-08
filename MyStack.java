/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This class is a 'blueprint' for a stack
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.EmptyStackException;

//****************************************************************************

// MyStack of type(integer, string, boolean,...): "Type"
public class MyStack<Type> {
	//This class defines a stack
	
	//create an ArrayList(growable)
	//Yes it is private
	private ArrayList<Type> list = new ArrayList<Type>();

	//-----------------------
	public String str() {
		//returns list as a string
		return list.toString();
	}
	
	//-----------------------
	public Type at(int place) {
		//returns the item at input index
		return list.get(place);
	}

	//-----------------------
	public Type peek() throws Exception {
		//returns item at the top stack without removing it
		if(list.size() == 0) {
			throw new Exception("Empty Stack");
		}
	
		return list.get(list.size() - 1);
	}	
	
	//-----------------------
	public String clear() {
		//clear all items in stack
		list = new ArrayList<Type>();
		return list.toString();
	}	
	
	//-----------------------
	public Type pop() throws Exception  {
		//pops the last value from the stack and return it
								//last index
		if(list.size() == 0) {
			throw new Exception("Empty Stack");
		}
		
		Type value = list.get(list.size() - 1);
		list.remove(value);
		return value;
	}
	
	//-----------------------
	public void push(Type value) {
		//append an object to the end of the stack
		list.add(value);
	}

}//closing for class
