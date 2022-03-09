//1D, 2D, staggered
import java.util.*;
public class Array extends Structure{
	Scanner input  = new Scanner(System.in);
	String type, animal;
	public Array() {
		
	}
	public void run() {
		System.out.println(" What type of array would you like to see? ");
		type = input.next();
		System.out.println("What is your favorite animal? ");
		animal = input.next();
		switch(type) {
		case "single":
			String [] single = new String [5];
			for(int i = 0; i < single.length; i++) {
				single[i] = animal;
			}
			System.out.println("Here's a line of " + animal + "s to hi to you! ");
			for(int i = 0; i < single.length; i++) {
				System.out.println((i+1) + animal + " ");
			}
		case "double":
			String [][] thisArray = new String [10][10];
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					thisArray[i][j] = animal;
				}
			}
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
			System.out.print(thisArray[i][j]);
		}
	}
}
	}
}
