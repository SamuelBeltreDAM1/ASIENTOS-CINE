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
Scanner sc = new Scanner (System.in);
System.out.print("INTRODUCE EL NUEMRO DE FILA: ");
int fila=sc.nextInt();
System.out.print("INTORDUCE EL NUMERO DE COLUMNA: ");
int columna=sc.nextInt();
for (int i = 0; i<1; i++) {
	for (int j =0; j<1; j++) {
		if (fila%2==0 && columna%2==0) {
			 System.out.print("Esta ocupado, tienes que elegir uno que este libre");
		}else {
			System.out.println("perfecto, el asiento que has seleccionado esta libre");

		}
		System.out.println();
	  }
	}

	}
}
