package com.programs.java;



public class Overriding {
	
	public void kavi(int a, int b , int c) {
		c=a+b;
		System.out.println(c);
	}
}
	class Bus extends Overriding{
		public void kavi(int a, int b , int c) {
			c=a+b;
			System.out.println(c);
			
		}
			
public  static void main(String[] args) {
		
	Bus myobj= new Bus();
    
	
	myobj.kavi(5, 5, 6);
	
	
	Overriding obj = new Overriding();
	 obj.kavi(2, 20, 40);
	
	  
	
	  }

}
