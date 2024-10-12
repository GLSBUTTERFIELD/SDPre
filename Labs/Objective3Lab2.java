public class Objective3Lab2 {
	public static void main(String[] args) {
		double side1, side2, sq_side1, sq_side2, hypotenuse;

		side1 = 10;
		side2 = 8;
		sq_side1 = side1 * side1;
		sq_side2 = side2 * side2;
		hypotenuse = Math.sqrt(sq_side1 + sq_side2);

System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
}
	}