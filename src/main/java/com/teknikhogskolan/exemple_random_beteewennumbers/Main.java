package com.teknikhogskolan.exemple_random_beteewennumbers;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods mrm = new MyRandomMethods();
		
		
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBeteewen1And10() +" ,");	
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBeteewen11And20() +" ,");	
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBeteewen21And30() +" ,");	
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBeteewen31And40() +" ,");	
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBeteewen41And50() +" ,");	
		}

	}

}
