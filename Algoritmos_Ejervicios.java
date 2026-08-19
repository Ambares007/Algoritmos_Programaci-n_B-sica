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

//Ejercicio 2//


import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE NÓMINA SEMANAL (EMPRESA XYZ) ---");

        // Definimos el valor fijo por hora //
        double valorHora = 1000.0;
        double totalPagadoTodos = 0.0;

        // Bucle para pedir las horas de los 5 obreros //
        for (int i = 1; i <= 5; i++) {
            
            // Solicitamos al usuario el número de horas trabajadas //
            System.out.print("Ingrese el número de horas trabajadas por el obrero " + i + ": ");
            double horasTrabajadas = lector.nextDouble();

            // Calcular el valor a pagar por cada obrero //
            double pagoObrero = horasTrabajadas * valorHora;

            System.out.println("El valor a pagar al obrero " + i + " es: $" + pagoObrero + " pesos\n");

            // Acumulamos para calcular el valor total pagado a todos los obreros //
            totalPagadoTodos = totalPagadoTodos + pagoObrero;
        }

        System.out.println("--- RESULTADO FINAL ---");
        System.out.println("El valor total pagado a todos los obreros es: $" + totalPagadoTodos + " pesos");

        lector.close();
    }
    