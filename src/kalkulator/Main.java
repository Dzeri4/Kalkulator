package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner skener;
		String s;
		String[] pars;
		int x, y;
		
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
			
			x = Integer.parseInt(pars[0]);
			y = Integer.parseInt(pars[2]);
			
			if(pars[1].equals("+"))
				addition(x, y);

			if(pars[1].equals("-")) 
				substraction(x,y);
			
			if(pars[1].equals("*")) 
				multiplication(x,y);

			if(pars[1].equals("*")) {
				//TODO
			}
			
		} while(!s.equals("kraj"));

		
	}
	
	public static void addition(int x, int y) {
		
		System.out.println(x+y);
	}

	public static void substraction(int x, int y) {
		System.out.println(x-y);
	}
	
	public static void multiplication(int x, int y) {
		System.out.println(x*y);
	}
	
}	
