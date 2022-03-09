public class examples{
	public static void main(String[] args) {
		Decision dec = new Decision("switch");
		Iterative it = new Iterative("for loop");
		Array arr = new Array();
		dec.run();
		it.run();
		arr.run();
	}
}