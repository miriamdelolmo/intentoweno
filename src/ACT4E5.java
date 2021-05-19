import java.util.*;
public class ACT4E5 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		int x;
		String opc;
	System.out.println("Inserte un número.");
		x = sc.nextInt();
	System.out.println("Inserte su opción: u, d o t.");
		opc = sc.next();
		switch(opc) {
		case "u": x=x+1;
				System.out.println(x);
					break;
		case "d": x=x+2;
				System.out.println(x);
					break;
		case "t": x=x+3;
				System.out.println(x);
					break;

		default: x=x+4;
				System.out.println(x);
					break;
		}
	}
}