// do-while, while, for, recursion
import java.util.*;
public class Iterative extends Structure{
	Scanner input = new Scanner(System.in);
	String type;
	int dollars;
	public Iterative(String setType) {
		type = setType;
}
	public void run() {
		System.out.println("What loop would you like to see? ");
		type = input.next();
		System.out.println("How many dollars are in your pocket? ");
		dollars = input.nextInt();
		switch(type) {
		case "for":
			for(int i = 0; i < dollars; i++) {
				System.out.println("$");
			}
			System.out.println();
		case "while":
			while(dollars >0) {
				System.out.print("$");
				dollars--;
			}
		}
	}
}