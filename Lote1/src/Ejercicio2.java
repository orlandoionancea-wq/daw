import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int examen1, exmamen2;
		double practicas, notaFinal;
		
		System.out.print("Ingrese la nota del primer examen: ");
		examen1 = sc.nextInt();
		System.out.print("Ingrese la nota del segundo examen: ");
		exmamen2 = sc.nextInt();
		System.out.print("Ingrese la nota de las prácticas: ");
		practicas = sc.nextDouble();
		
		// 30% = 0.3, 40% = 0.4, 30% = 0.3
		notaFinal = examen1 * 0.3 + exmamen2 * 0.4 + practicas * 0.3;
		
		System.out.println("La nota final es: " + notaFinal);
		
		sc.close();
		

	

	}

}
