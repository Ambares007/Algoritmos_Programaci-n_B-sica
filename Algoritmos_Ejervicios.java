// Ejercicio 1 //
import java.util.Scanner;

public class Algoritmos_Ejervicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL PERÍMETRO DE UN HEXÁGONO REGULAR ---");

        // Solicitamos al usuario la longitud de un lado//
        System.out.print("Ingrese la longitud de uno de los lados: ");
        
        // Leemos el número decimal ingresado por el usuario //
        double lado = lector.nextDouble();

        
         //Un polígono regular de 6 lados (hexágono) tiene todos sus lados iguales.//
         // Aplicamos la fórmula requerida: P = 6 * lado//
        double perimetro = 6 * lado;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El perímetro del polígono de 6 lados es: " + perimetro);

        lector.close();
    }
}

//Ejercicio//


