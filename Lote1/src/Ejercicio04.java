import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Constantes: final y nombre en mayúsculas
        final double GANANCIA = 0.10;
        final double IMPUESTO = 0.21;

        Scanner sc = new Scanner(System.in);
        double costeInicial, precioVenta, costeFinal;

        System.out.println("Introduce el coste inicial del automóvil");
        costeInicial = sc.nextDouble();

        // Ganancia sobre el coste de fábrica
        precioVenta = costeInicial + costeInicial * GANANCIA;
        // Impuesto sobre el precio de venta ya con beneficio
        costeFinal = precioVenta + precioVenta * IMPUESTO;

        System.out.println("El coste para el consumidor es: " + costeFinal);
        
        sc.close();
    }
}


