//Jalen Holmes

import java.util.Arrays;
import java.util.Scanner;

public class cmsc401 {
	
	/*first line of input contains number of lines to follow
	
		first number of each line, n >= 4 and n <= 1000,
		contains num of ints that follow line
		
		n integers follow til end of line(seperated by space) and stored
		in array using index numbers 1... n-2
		
		last two ints x,y (x,y >= 1 and x,y <= n-2) in the line is the index
		(starting from 1) of the integers from the line to compare
		
	 */
	
	public static int[] numbersFromLine(String str) {
		
		String[] indices = str.split(" ");
		
		int[] numbers = new int[indices.length];
		
		for(int i = 0; i < indices.length; i++) {
			numbers[i] = Integer.parseInt(indices[i]);
		}
		
		return numbers;
		
	}
	
	public static int comparison(int[] num) {
		
		int firstIndex = num[num.length - 2];
		int lastIndex = num[num.length - 1];
		
		int num1 = num[firstIndex];
		int num2 = num[lastIndex];
		
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}

		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = "";

		
		while(sc.hasNextLine()) {
			
			int numsToFollow = sc.nextInt();
			
		
			input = sc.nextLine();
			String[] newInput = new String[numsToFollow];
			
			for(int i = 0; i < numsToFollow; i++) {
				
				newInput[i] = sc.nextLine();
				comparison(numbersFromLine(newInput[i]));

			}
			
			for(int i = 0; i < numsToFollow; i++) {
				System.out.println(comparison(numbersFromLine(newInput[i])));
			}

			break;

		}
		
	}
	
	

}
