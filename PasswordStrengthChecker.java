package If_Exercise;

import java.util.Scanner;

public class PasswordStrengthChecker {
	public static void main(String[] args) throws Exception {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter Password");
		String password=scan.next();
		int passLength=password.length();
		int Uppcount=0;
		int Lowcount=0;
		int SpecChar=0;
		int numCount=0;
		if(passLength<8) {
			System.out.println("Entered Password is Weak");
			throw new Exception("Entered Password is Weak");
			//System.exit(0);
		}
		for(int i=0; i<password.length(); i++) {
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				Uppcount++;
			}
			if(Character.isLowerCase(ch))
			{
				Lowcount++;
			}
			if(Character.isDigit(ch))
			{
				numCount++;
			}
			else {
				SpecChar++;
			}
		}
		
		if(Uppcount>=1 && Lowcount>=1 && SpecChar>=1  && numCount>=1) {
			System.out.println("Entered Password is Strong");
		}
		else {
			System.out.println("Entered Password is Moderate");
		}
		
	}

}
