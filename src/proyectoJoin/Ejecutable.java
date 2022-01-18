package proyectoJoin;

import java.util.Scanner;

/*
 * RELLENA UN ARRAY HASTA QUE HAY 5 ELEMENTOS.CUANDO ESTA LLENO , llena el siguiente.
 * USUARIO: Introducce el tamaño del array,cuando le completa el llenado se llena el siguiente
 * */
public class Ejecutable {
	//public static void main(String[] args) {
		public static void Join() {
			Scanner teclado = new Scanner(System.in);
			int nElementos1 ,nElementos2 , nElementos3;
		System.out.println("-------------------------------------------------------");
		System.out.println("LLENAR CESTA SIN MEZCLAR PELOTAS");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		System.out.print("Intoduce el numero de pelotas rojas: ");
		nElementos1 = teclado.nextInt();
		System.out.print("Intoduce el numero de pelotas azules: ");
		nElementos2 = teclado.nextInt();
		System.out.print("Intoduce el numero de pelotas verdes: ");
		nElementos3 = teclado.nextInt();
		HiloJoin h1= new HiloJoin(nElementos1,"Pelota roja");
		HiloJoin h2 =  new HiloJoin(nElementos2, "Pelota azul");
		HiloJoin h3 =  new HiloJoin(nElementos3, "Pelota verde");
		h1.start();
		try {
			h1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h2.start();
		try {
			h2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h3.start();

		}	
	//}
}
