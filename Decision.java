// if and switch
import java.util.*;
public class Decision extends Structure{
	Scanner input = new Scanner(System.in);
	private String type, response;
	public Decision(String newType){
		type = newType;
	}
	void run(){
		switch(type) {
		case "if":
			System.out.print("Do you like anime? ");
			response = input.next();
			response = response.toLowerCase();
			if(response.equals("yes")) {
				System.out.println(" ayyyeeee let's go which anime do you like? ");
			}else {
				System.out.println("Oh your weired ");
			}
		}
	}
	}