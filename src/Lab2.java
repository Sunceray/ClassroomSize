import java.util.Scanner;

public class Lab2 {
	
	public static void main (String[] args) {
		  String choice = "y";
		  
		  System.out.println("Welcome To Grand Circus Room Detail Generator");
			double height; //declaring
			
			Scanner input = new Scanner(System.in);
		  while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter Length:");
			double rmLength = input.nextDouble(); //Initializing 
			
			System.out.println("Enter Width:");
			 double rmWidth = input.nextDouble();
			 
			 System.out.println("Enter Height:");
			 double rmheight = input.nextDouble();
			
		
		    double area = rmLength * rmWidth;
		    System.out.println("Area of GC Rooms:" + area);
		 
			
			double perimeter = 2* (rmLength * rmWidth);
			System.out.println("Perimeter of GC Rooms:" + perimeter);
			
			
			double volume = rmLength*rmWidth*rmheight;
			System.out.println("Volume:"+volume);
			
		
			System.out.print("Continue? (y/n): ");
		    choice = input.next();
		  }
	}

	}


