package proyectoRepartirCuenta;

import java.util.Scanner;

/*
 * DADO UN NUEMRO DEL 1 AL 50 ,TE DICE LOS 10 ANTERIORES Y LOS 10 SIGUIENTES A ESTE 
 * */
public class Ejecuable {

	public static void rpcuenta(){
		
		Scanner teclado = new Scanner(System.in);
		boolean x = true;
		int numeroInicial ;
		int rango;
		do {
		System.out.print("ELIGE UN NUMERO DEL 1 AL 50: ");
		numeroInicial = teclado.nextInt();
			if (numeroInicial >=1 && numeroInicial<=50) {
				x=false;
			}
		}while(x);
		System.out.println("ELIGE CUANTOS NUMEROS QUIERES ASCENDER Y DESCENDER: ");
		rango = teclado.nextInt();
		
		Operacion op  = new Operacion(numeroInicial);
		AscenderNumero as = new AscenderNumero(op, rango);
		DescenceNumero ds = new DescenceNumero(op, rango);
		
		as.start();
		System.out.println("---");
		ds.start();
		
		
	
		
	}
}
