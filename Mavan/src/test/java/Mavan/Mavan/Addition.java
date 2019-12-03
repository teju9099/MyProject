package Mavan.Mavan;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Addition extends ToolsQA{
	@Test
	public void Addtwonumbers() {
		
		int x,y,z;
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter first number : ");
		  x = in.nextInt();
		  System.out.println("Enter Second number : ");
		  y = in.nextInt();
		  z = x+y;
		  System.out.println(z);
		  
		
	}

}
