package org.sample;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorinJava {
	
	public static void main(String[] args) {
		
	//Enumeration	
		
		Vector<String> v = new Vector<>();
		
		v.add("A");
		v.add("B");
		v.add("c");
		v.add("d");
		v.add("E");
		v.add("f");
		v.add("g");
		
	System.out.println(v);
		
	Enumeration<String> elements = v.elements();	
		
		while (elements.hasMoreElements()) {
			String string =  elements.nextElement();
			System.out.println(string);
			
		}
		
		
		//iterator
		
		Iterator<String> iterator = v.iterator();
		
		
		while (iterator.hasNext()) {
			String string =  iterator.next();
		
			if (string.equals("E")) {
				iterator.remove();
				
			}
		}
		System.out.println(v);
		
		
	
	
	
	//list iterator
	
	
	ListIterator<String> listIterator = v.listIterator();
	
	while (listIterator.hasNext()) {
		String string =  listIterator.next();
		System.out.println( string);
         if (string.equals("A")) {
        	 
        	 listIterator.add("java");
		}else if (string.equals("B")) {
			 listIterator.remove();
			
		}else if (string.equals("d")) {
			 listIterator.set("zebra");
			
		}
		System.out.println(v);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
