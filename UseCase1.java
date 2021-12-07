package LengthhLine;
import java.util.Scanner;

public class UseCase1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter the coordinates on line");
	   int x1=  sc.nextInt();
	   int y1= sc.nextInt();
	   int x2= sc.nextInt();
	   int y2= sc.nextInt();
	   double length =	Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	
	   System.out.println("length of line is"+length);
       }
       
}