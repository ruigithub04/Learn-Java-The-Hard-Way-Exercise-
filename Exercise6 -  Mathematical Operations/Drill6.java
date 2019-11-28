public class Drill6 {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, i;
		double x, y, z, j;
		String one, two, both, firstname, lastname, fusion;

		a = 10;
		b = 27;
		System.out.println( "a is " + a + ", b is " + b );

		c = a + b;
		System.out.println( "a+b is " + c );
		d = a - b;
		System.out.println( "a-b is " + d );
		e = a+b*3;
		System.out.println( "a+b*3 is " + e );
		f = b / 2;
		System.out.println( "b/2 is " + f );
		g = b % 10;
		System.out.println( "b%10 is " + g );
		i = c + g * a;
		System.out.println( "c+g*a is " + i );

		x = 1.1;
		System.out.println( "\nx is " + x );
		y = x*x;
		System.out.println( "x*x is " + y );
		z = b / 2;
		System.out.println( "b/2 is " + z );
		j = z*z;
		System.out.println( "z*z is " + j );
		System.out.println();

		one = "dog";
		two = "house";
		both = one + two;
		System.out.println( both );

		firstname = "Rui";
		lastname = "Tampan";
		fusion = firstname + lastname;
		System.out.println( fusion );

		   /* Rizza Pratama Putra (RUI)
		Tanggal 01 Oktober 2019
		Bootcamp G-13 */
	}
}