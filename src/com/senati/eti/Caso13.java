package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Nombre........: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Apellido......: ");
		String apellido = sc.nextLine();
		
		System.out.println("========== Resultados ==========");
		System.out.println("Alumno(a)...............: " + nombre + " " + apellido );
		

	}

}
