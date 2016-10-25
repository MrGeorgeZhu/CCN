import java.util.*;
import java.io.*;
public class CCValidator
	{
		static int counter;
		static long num;
		static long test = 1234567812345670l;
		//5424180123456789L
		static long temp;
		static long digit1;
		static long digit2;
		static long adder;
		static long a;
		static long b;
		public static void main(String[] args) throws IOException
			{
//				 Scanner file = new Scanner( new File( "creditCardNumbers.txt" ) );
//				 for (int i = 0; i < 100; i++){
//					 num = file.nextLong(); 
//					 check1();
//				 }
//				System.out.println("The number of potentially valid credit card number in the list is " + counter + ".");
//				generateCCN();
			
			}
		
		public static void check1(){
			adder = 0;
			for (int i = 0; i < 16; i++){
				if (i%2 == 1){
					temp = num%10*2;
					if (temp > 9){
						digit1 = temp%10;
						digit2 = temp/10;
						adder = adder + digit1 + digit2;
						num = num/10;
					} else {
						adder = adder + temp;
						num = num/10;
					}					
				} else {
					adder = adder + num%10;
					num = num/10;
				}
			}
			if (adder%10 == 0){
				counter++;
			}
		}
		
		public static void check2(){
			adder = 0;
			b = a;
			for (int i = 0; i < 16; i++){
				if (i%2 == 1){
					temp = a%10*2;
					if (temp > 9){
						digit1 = temp%10;
						digit2 = temp/10;
						adder = adder + digit1 + digit2;
						a = a/10;
					} else {
						adder = adder + temp;
						a = a/10;
					}					
				} else {
					adder = adder + a%10;
					a = a/10;
				}
			}
			if (adder%10 == 0){
				System.out.println(b);
				counter++;
			}
		}
		
		public static void generateCCN(){
			System.out.println("How many potentially valid credit card number you want to generate?");
			Scanner userInput = new Scanner(System.in);
			int user = userInput.nextInt();
			while (counter!=user){
				a = (long)(Math.random()*9000000000000000l)+1000000000000000l;
				check2();
			}		
		}
	}
