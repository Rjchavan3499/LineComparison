package LengthhLine;

import java.util.Scanner;

public class UseCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("comparing eqaulity of two line");
        System.out.println("enter the coordinates of first line");
		   int x1=  sc.nextInt();
		   int y1= sc.nextInt();
		   int x2= sc.nextInt();
		   int y2= sc.nextInt();
		   double length =	Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		   System.out.println("length of line is"+length);

        System.out.println("enter the coordinates of second line");
		   int x3=  sc.nextInt();
		   int y3= sc.nextInt();
		   int x4= sc.nextInt();
		   int y4= sc.nextInt();
		    double  length1 =	Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));	
			   System.out.println("length of line is"+length1);
			   if (Double.compare(length, length1) == 0) {
				   
		            System.out.println("Both the lines are equal in length");
		        }
		        else if (Double.compare(length, length1) < 0) {
		 
		            System.out.println("the second line greator then first line");
		        }
		        else {
		 
		            System.out.println("the firt line is greator then second line");
		        }
	}

}
