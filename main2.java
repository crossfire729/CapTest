import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter 1-3 for addition subtraction multiplication division");
	int option  = scan.nextInt();
	Operation operation=null; 
	switch(option){
		case 1: operation = new Addition();break;
		case 2: operation = new Subtraction();break;
		case 3: operation = new multiplication();break;
	}
	double a = scan.nextDouble();
        double b = scan.nextDouble();
	System.out.println(operation.method(a,b));
 }
}