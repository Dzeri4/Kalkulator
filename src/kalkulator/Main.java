package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner skener;
		String s;
		String[] pars;
		
		skener = new Scanner(System.in);
		
		
		do {
			
			s = skener.nextLine();
			if(s.isEmpty())
				continue;
			
			pars = s.split(" ");
			
			if(pars.length != 3) {
				if(s.equals("kraj"))
					continue;
				System.out.println("Pogresan format naredbe!");
				continue;
			}
		} while(!s.equals("kraj"));

		
	}
}
