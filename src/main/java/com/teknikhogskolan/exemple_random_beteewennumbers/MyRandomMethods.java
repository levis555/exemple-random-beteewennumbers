package com.teknikhogskolan.exemple_random_beteewennumbers;

import java.util.Random;

public class MyRandomMethods {
	Random random = new Random();
	
	public int randomBeteewen1And10() {
		int result = 0;
		result = random.nextInt(10) +1; 
		return result;
	
	}
	
	public int randomBeteewen11And20() {
		int result = 0;
		result = random.nextInt(10) +11; 
		return result;
			
	}
	
	public int randomBeteewen21And30() {
		int result = 0;
		result = random.nextInt(10) +21; 
		return result;
		
	}
	
	public int randomBeteewen31And40() {
		int result = 0;
		result = random.nextInt(10) +31; 
		return result;
	}
	
	public int randomBeteewen41And50() {
		int result = 0;
		result = random.nextInt(10) +41; 
		return result;
		
	}

	
}

		