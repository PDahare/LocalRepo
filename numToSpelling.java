package If_Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class numToSpelling {

	public static void main(String[] args) {
		Map<Integer, String> num=new TreeMap<Integer, String>();
		num.put(0, "Zero");
		num.put(1, "One");
		num.put(9, "Nine");
		num.put(2, "Two");
		num.put(7, "Seven");
		num.put(3, "Three");
		num.put(4, "Four");
		num.put(5, "Five");
		num.put(6, "Six");
		num.put(8, "Eight");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number between 0-9 to convert number into spelling");
		int inputNum=scan.nextInt();
		
		System.out.println(num.get(inputNum));
		scan.close();
	}
}
