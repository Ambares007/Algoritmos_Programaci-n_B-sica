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
    
// Ejercicio 3 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- SEPARAR DÍGITOS Y ELEVAR PRIMERO Y ÚLTIMO AL CUADRADO ---");

        // Solicitamos al usuario el número entero de 5 dígitos //
        System.out.print("Ingrese un número entero positivo de 5 dígitos: ");
        int numero = lector.nextInt();

        // Extraemos el primer dígito (dividiendo entre 10000) //
        int primerDigito = numero / 10000;

        // Extraemos el último dígito (usando el residuo de 10) //
        int ultimoDigito = numero % 10;

        // Elevamos al cuadrado el primer y el último dígito //
        int primerAlCuadrado = primerDigito * primerDigito;
        int ultimoAlCuadrado = ultimoDigito * ultimoDigito;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El primer dígito es: " + primerDigito + " | Elevado al cuadrado es: " + primerAlCuadrado);
        System.out.println("El último dígito es: " + ultimoDigito + " | Elevado al cuadrado es: " + ultimoAlCuadrado);

        lector.close();
    }
}


// Ejercicio 4 //


import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE DÉCADAS A DÍAS ---");

        // Solicitamos al usuario la cantidad de décadas //
        System.out.print("Ingrese la cantidad de décadas: ");
        double decadas = lector.nextDouble();

        // Aplicamos la fórmula: 1 década = 10 años, 1 año = 365 días //
        double dias = decadas * 10 * 365;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(decadas + " década(s) equivalen a: " + dias + " días.");

        lector.close();
    }
}



// Ejercicio 5 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE MASA DE AIRE ---");

        // Solicitamos los datos requeridos por la fórmula //
        System.out.print("Ingrese la presión: ");
        double presion = lector.nextDouble();

        System.out.print("Ingrese el volumen: ");
        double volumen = lector.nextDouble();

        System.out.print("Ingrese la temperatura: ");
        double temperatura = lector.nextDouble();

        // Aplicamos la fórmula: masa = (presión * volumen) / (0.37 * (temperatura + 460)) //
        double masa = (presion * volumen) / (0.37 * (temperatura + 460));

        System.out.println("\n--- RESULTADO ---");
        System.out.println("La masa de aire calculada es: " + masa);

        lector.close();
    }
}