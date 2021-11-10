package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner skener;
		String s;
		
		skener = new Scanner(System.in);
		
		
		do {
			
			s = skener.nextLine();
			if(s.isEmpty())
				continue;
			
		} while(!s.equals("kraj"));

		
	}
}
