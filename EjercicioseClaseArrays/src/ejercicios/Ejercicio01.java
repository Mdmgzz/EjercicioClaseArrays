package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	
	
	public static void main(String[] args) {
		//bloque de variables
		int longitud;			//guarda la longitud del array
		int num1;				// guarda el valor que va a contener cada posicion del array
		int [] numeros;
		//creamos Scanner
		Scanner sc=new Scanner(System.in);
		
		//Preguntamos al usuario 
		System.out.println("Introduce un valor: ");
		num1= sc.nextInt();
		System.out.println("Introduce una longitud: ");
		longitud= sc.nextInt();
		numeros= new int[longitud];
		Arrays.fill(numeros,num1);
		
		System.out.println(Arrays.toString(numeros));
		
		//cerramos scanner
		sc.close();
		
		

	}

}
