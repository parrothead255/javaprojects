package Chap1202;

import java.util.ArrayList;

public class Chap1202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jensen Ackles");
		names.add("LEEEEEROOOOOOOY JEankanes");
		System.out.println(names.size()+" "+names);
		names.add("Hash-slingin' Slasher");
		System.out.println(names.size()+" "+names);
		System.out.println("*We removed "+names.remove(0)+"*\n");
		for(int i=0;i<names.size();i++) {
			System.out.print(names.get(i)+" \n");
		}
		System.out.println();
		System.out.println("*We replaced "+names.set(1, "Bob Dylan")+"*\n");
		System.out.println(names.size()+" "+names);
		names.add(1,names.remove(0));
		System.out.println(names);
	}

}
