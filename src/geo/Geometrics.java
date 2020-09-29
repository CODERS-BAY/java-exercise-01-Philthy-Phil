package geo;

//import java.util.Scanner;

public class Geometrics {
	private static double x = 10.0;
	private static double y = 5.0;
	private static double z = 3.0;
	private static int x1 = 8;
	private static int y1 = 7;
//	private static int z1 = 10;
	private static int x2 = 100;
	private static int y2 = 57;
//	private static int z2 = 129;
	private static int x3 = 45;
	private static int y3 = 89;
	private static int z3 = 69;

	/*** Multiplikation Double Methode ***/
	public static double multiDouble(double x, double y) {
		return x * y;
	}

	/*** Multiplikation Int Methode ***/
	public static int multiInt(int x, int y) {
		return x * y;
	}

	/*** Addition Int Methode ***/
	public static int addInt(int x, int y) {
		return x + y;
	}

	/*** Addition Double Methode ***/
	public static double addDouble(double x, double y) {
		return x + y;
	}

	/*** Text System.out.println herausheben ***/
	public static void print(String txt) {
		System.out.println(txt);
	}

	public static void main(String[] args) {

//		/*** Eingaben einlesen ***/
//		Scanner myScanner = new Scanner(System.in);
//		
//			System.out.println("(Type Double) Enter a number for *x*: ");
//			String input = myScanner.nextLine();
//			double number = Double.parseDouble(input);
//			System.out.println("number: " + input);
//			

		// area ... Fläche
		print("Square area");
		print("x * x = " + multiDouble(x, x));
		print("x1 * x1 = " + multiInt(x1, x1));
		print("x2 * x2 = " + multiInt(x2, x2));
		print("y * y = " + multiDouble(y, y));

		// perimeter ... Umfang
		print("Square perimeter");
		print("4 * x = " + multiDouble(4, x));
		print("4 * x1 = " + multiInt(4, x1));
		print("4 * x2 = " + multiInt(4, x2));
		print("4 * y = " + multiDouble(4, y));

		print("Rectangle area");
		print("x * y = " + multiDouble(x, y));
		print("x1 * y1 = " + multiInt(x1, y1));
		print("x2 * y2 = " + multiInt(x2, y2));
		print("x3 * y3 = " + multiInt(x3, y3));

		print("Rectangle perimeter");
		print("x + y = " + addDouble(x, y));
		print("x1 + y1 = " + addInt(x1, y1));
		print("x2 + y2 = " + addInt(x2, y2));
		print("x3 + y3 = " + addInt(x3, y3));

		print("We can also calculate some volumes");
		/*
		 * z is our height y is our radius
		 */
		print("Zone of a sphere");
		double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
		System.out.println(v);

		System.out.println("Sphere with cylinder");
		System.out.println(Math.PI * Math.pow(z, 3) / 6);

		System.out.println("Ungula");
		System.out.println((double) (2 * x3 * z3) / 3);
	}
}
