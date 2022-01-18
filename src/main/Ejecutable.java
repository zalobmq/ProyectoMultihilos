package main;

import java.util.Scanner;


public class Ejecutable {

	public static void main(String[] args) {
		//MENU INICIAL
		Scanner teclado = new Scanner(System.in);
		int op;
		System.out.println("");
		menuInicial();
		System.out.print("ELIGE UNA OPCION: ");
		op = teclado.nextInt();
		System.out.println("");
		
		switch (op) {
		case 1: 
			
			proyectoJoin.Ejecutable.Join();
			break;
		
		case 2:
			proyectoRepartirCuenta.Ejecuable.rpcuenta();
			break;
			
		case 3:
			proyectoProductorConsumidor.Ejecutable.productorConsumidor();
			break;
		default:
			break;
			
		}
		
	}
	public static void menuInicial() {
		
		System.out.println("");
		System.out.println("OPCION 1: PROYECTO A - CESTA DE PELOTAS(Join)");
		System.out.println("OPCION 2: PROYECTO B  - CUENTA ASCENDENTE Y DESCENDENTE(Repartir cuenta entre varios hilos)");
		System.out.println("OPCION 3: PROYECTO C - LAVADERO DE COCHES(Productor/Consumidor)");
		System.out.println("");
		
	}
	
}
