import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double distancia, consumo, precioLitro, coste;
		
		System.out.println("Introduce la distancia en km");
		distancia = sc.nextDouble();
		System.out.println("Introduce el consumo a los 100 km");
		consumo = sc.nextDouble();
		System.out.println("Introduce el precio del litro de combustible");
		precioLitro = sc.nextDouble();
		
		double litros = distancia * consumo / 100;
		coste = litros * precioLitro;
		
		System.out.println("Litros consumidos: " + litros);
		System.out.println("Coste total del viaje: " + coste);
		 
		sc.close();
		
		
	}
}


