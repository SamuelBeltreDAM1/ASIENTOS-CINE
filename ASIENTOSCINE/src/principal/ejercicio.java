package principal;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String [][] asientos = new String [4][4];
String ocupado = "X ";
String libre = "O ";
for (int i = 0; i<asientos.length; i++) {
	for (int j =0; j<asientos.length; j++) {
		if (i%2==0 && j%2==0) {
			 System.out.print(ocupado);
		}else {
			System.out.print(libre);
		}
	}
	System.out.println();
}

	}

}
