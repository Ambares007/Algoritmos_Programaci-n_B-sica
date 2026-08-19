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

// Ejercicio 6 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE NÚMERO DE PULSACIONES ---");

        // Solicitamos la edad de la persona //
        System.out.print("Ingrese la edad de la persona: ");
        int edad = lector.nextInt();

        // Aplicamos la fórmula: num. pulsaciones = (220 - edad) / 10 //
        double pulsaciones = (220.0 - edad) / 10.0;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El número de pulsaciones por cada 10 segundos es: " + pulsaciones);

        lector.close();
    }
}



// ------------------- EJERCICIOS DE LA ACTIVIDAD DE APRENDIZAJE ------------------- //


// Ejercicio 1 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE SALARIO Y RETENCIÓN (PROSEGUR) ---");

        // Solicitamos el valor de la hora y las horas trabajadas //
        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = lector.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = lector.nextDouble();

        // Salario Total = Horas trabajadas * Valor por hora //
        double salarioTotal = horasTrabajadas * valorHora;

        // Retención en la fuente = 5% del salario total (0.05) //
        double retencion = salarioTotal * 0.05;

        // Salario Neto = Salario Total - Retención //
        double salarioNeto = salarioTotal - retencion;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Salario Total: $" + salarioTotal);
        System.out.println("Retención en la fuente (5%): $" + retencion);
        System.out.println("Salario Neto a pagar: $" + salarioNeto);

        lector.close();
    }
}

// Ejercicio 2 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL VALOR DE HORA TRABAJADA ---");

        // Solicitamos el salario total mensual y las horas trabajadas //
        System.out.print("Ingrese el salario total mensual: ");
        double salarioTotal = lector.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = lector.nextDouble();

        // Aplicamos la fórmula: Valor Hora = Salario Total / Horas Trabajadas //
        double valorHora = salarioTotal / horasTrabajadas;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El valor de una hora trabajada es: $" + valorHora);

        lector.close();
    }
}


// Ejercicio 3 // 


import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE NOTA MÍNIMA EN EL TERCER CORTE (UdeC) ---");

        // Solicitamos las notas del primer y segundo corte //
        System.out.print("Ingrese la nota del primer corte (20%): ");
        double corte1 = lector.nextDouble();

        System.out.print("Ingrese la nota del segundo corte (20%): ");
        double corte2 = lector.nextDouble();

        // Calculamos el acumulado de los dos primeros cortes //
        double acumulado20 = (corte1 * 0.20) + (corte2 * 0.20);

        // La nota mínima total requerida es 3.0 //
        // Fórmula: (3.0 - acumuladoActual) / 0.60 //
        double notaNecesaria = (3.0 - acumulado20) / 0.60;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Acumulado actual (40%): " + acumulado20);

        // Verificamos si es posible obtener la nota o si ya aprobó //
        if (notaNecesaria <= 0) {
            System.out.println("¡Ya aprobaste la asignatura! Necesitas un 0.0 en el tercer corte.");
        } else if (notaNecesaria > 5.0) {
            System.out.println("Necesitarías sacar " + notaNecesaria + ", por lo que no es posible alcanzar el 3.0.");
        } else {
            System.out.println("Para aprobar con 3.0, necesitas sacar mínimo en el 60%: " + notaNecesaria);
        }

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

        System.out.println("--- CÁLCULO DEL ÁREA DE UN TRIÁNGULO ---");

        // Solicitamos la base y la altura //
        System.out.print("Ingrese la base del triángulo: ");
        double base = lector.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = lector.nextDouble();

        // Aplicamos la fórmula: Área = (base * altura) / 2 //
        double area = (base * altura) / 2;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El área del triángulo es: " + area);

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

        System.out.println("--- CÁLCULO DEL PERÍMETRO DE UN TRIÁNGULO ---");

        // Solicitamos los tres lados del triángulo //
        System.out.print("Ingrese el primer lado: ");
        double lado1 = lector.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = lector.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = lector.nextDouble();

        // Aplicamos la fórmula: Perímetro = lado1 + lado2 + lado3 //
        double perimetro = lado1 + lado2 + lado3;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El perímetro del triángulo es: " + perimetro);

        lector.close();
    }
}

