public class Rectangulator {
	public static void main (String[] args) {
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);

		Rectangle myRectangle = new Rectangle(length, width);

		String output = String.format("Length: %d Width: %d", length, width);
	}
}
