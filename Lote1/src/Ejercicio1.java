
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double kmh;
		double ms;
		
		System.out.print("Ingrese la velocidad en km/h: ");
		kmh = sc.nextDouble();
		ms = kmh / 3.6;
		
			System.out.println("La velocidad en m/s es: " + ms);
			
			sc.close();
			
			
		
		
	}
	
}

	
	