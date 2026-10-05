import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit, pulgadas, centimetros;

        System.out.println("Introduce la temperatura en grados Celsius");
        celsius = sc.nextDouble();

        fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("Fahrenheit: %.2f \n", fahrenheit);

        System.out.println("Introduce el agua del pluviómetro en pulgadas");
        pulgadas = sc.nextDouble();

        centimetros = pulgadas * 25.5 / 10;
        System.out.printf("Centímetros: %.1f \n", centimetros);
        
        sc.close();
    }
}
		
		
		
		
		
		
		
		
		
		
			

	
