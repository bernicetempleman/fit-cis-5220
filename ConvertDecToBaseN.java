import java.util.Scanner;

public class ConvertDecToBaseN {

	public static void main(String[] args) {
		
		int number;
		int base;
		int tempNumber;
		int[] remainders;
		
		remainders = new int[100];
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
				
		// deposit to account 1
		System.out.print("Enter decimal number (integer): ");
		number = input.nextInt(); // obtain user input
		System.out.print("Enter base (integer): ");
		base = input.nextInt(); // obtain user input
		
		tempNumber = number;
		int i = 0;
		while(tempNumber > 0 && i < 100)
		{
			remainders[i] = tempNumber % base;
			tempNumber = tempNumber/base;
			i++;
			
			if (tempNumber == 0)
			{
				tempNumber = -1;
			}
			
		}
		i--;	
		while (i>=0)
		{
			if (remainders[i]>9 && remainders[i]<36)
			{
				switch(remainders[i]){
				case 10: 
					System.out.print("A");
					break;
				case 11:
					System.out.print("B");
					break;
				case 12: 	
					System.out.print("C");
					break;
				case 13: 
					System.out.print("D");
					break;
				case 14:
					System.out.print("E");
					break;
				case 15: 	
					System.out.print("F");
					break;
				case 16: 
					System.out.print("G");
					break;
				case 17:
					System.out.print("H");
					break;
				case 18: 	
					System.out.print("I");
					break;
				case 19: 
					System.out.print("J");
					break;
				case 20:
					System.out.print("K");
					break;
				case 21: 	
					System.out.print("L");
					break;
				case 22: 
					System.out.print("M");
					break;
				case 23:
					System.out.print("N");
					break;
				case 24: 	
					System.out.print("O");
					break;
				case 25: 
					System.out.print("P");
					break;
				case 26:
					System.out.print("Q");
					break;
				case 27: 	
					System.out.print("R");
					break;
				case 28: 
					System.out.print("S");
					break;
				case 29:
					System.out.print("T");
					break;
				case 30: 	
					System.out.print("U");
					break;
				case 31: 
					System.out.print("V");
					break;
				case 32:
					System.out.print("W");
					break;
				case 33: 	
					System.out.print("X");
					break;
				case 34: 
					System.out.print("Y");
					break;
				case 35:
					System.out.print("Z");
					break;
				default:
					break;
				}
			}
			else
			{
				System.out.print(remainders[i]);
			}
			i--;
		}
		

	}

}
