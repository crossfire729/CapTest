import java.io.*;
import java.util.*;
import add.java;
import mult.java;


public class main{
	public static void main(String[] args){
		System.out.println("Enter Number-1:");
		int a=sc.nextInt();
		System.out.println("Enter Number-2:");
		int b=sc.nextInt();
		System.out.println("Select an operation: \n 1. add \n 2. multiply");
		int choice=sc.nextInt();
		int result=0;
		switch(choice){
			case 1: result=add(a,b);
			break;
			case 2: result=mult(a,b);
			break;
			default: System.out.println("Please enter a valid entry");
		}
		System.out.println("Your result is:"+result);
	}
}
