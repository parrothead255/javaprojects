package aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pz101 {

	public static void main(String[] args) {
		File nums = new File("/Users/cdodson/Desktop/untitled folder/aoc/src/aoc/numbers1");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		try {
			Scanner input = new Scanner(nums);
			while(input.hasNext()) {
				String temp = input.nextLine();
				arr.add(new Integer(temp));
				{
					int x=0;
					while(x!=200) {
						arr.get(x);
						x++;
						System.out.println(x);}
				}
				
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
	
	
	}
		
}
