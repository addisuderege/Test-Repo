package edu.mum.collections;

import java.io.IOException;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Person1 p1=new Person1();
		Person1 p2=new Manager();
				
		
		try{
		p1.msg();
		p2.msg();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}

class Person1 implements I1{
	Person1(){
		System.out.println("Person constructor");
	}
	
	public void msg() throws IOException{
		System.out.println("Person called");
	}

	@Override
	public void message1() {
		// TODO Auto-generated method stub
		
	}
}

class Manager extends Person1{
	Manager(){
		super();
		System.out.println("Manager Constructor");
	}
	public void msg(){
		System.out.println("Manager called");
		//super.msg();
	}
}

interface I1{
	public static final int x=10;//final static by default
	void message1();
}

interface I2 extends I1{
	void message2();
}