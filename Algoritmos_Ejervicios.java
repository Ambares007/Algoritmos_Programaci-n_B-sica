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

// Ejercicio 6 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE CELSIUS A FAHRENHEIT ---");

        // Solicitamos los grados Celsius //
        System.out.print("Ingrese los grados Celsius: ");
        double celsius = lector.nextDouble();

        // Aplicamos la fórmula: Fahrenheit = (Celsius * 9/5) + 32 //
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(celsius + " °C equivalen a: " + fahrenheit + " °F");

        lector.close();
    }
}

// Ejercicio 7 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE FAHRENHEIT A CELSIUS ---");

        // Solicitamos los grados Fahrenheit //
        System.out.print("Ingrese los grados Fahrenheit: ");
        double fahrenheit = lector.nextDouble();

        // Aplicamos la fórmula: Celsius = (Fahrenheit - 32) * 5 / 9 //
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(fahrenheit + " °F equivalen a: " + celsius + " °C");

        lector.close();
    }
}

// Ejercicio 8 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE MILLAS MARINAS A METROS ---");

        // Solicitamos la distancia en millas marinas //
        System.out.print("Ingrese la distancia en millas marinas: ");
        double millasMarinas = lector.nextDouble();

        // Aplicamos la fórmula: Metros = Millas Marinas * 1852 //
        double metros = millasMarinas * 1852;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(millasMarinas + " millas marinas equivalen a: " + metros + " metros.");

        lector.close();
    }
}

// Ejercicio 9 // 


import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE PORCENTAJE DE DESCUENTO ---");

        // Solicitamos el precio original y el precio pagado //
        System.out.print("Ingrese el precio original (tarifa): ");
        double precioTarifa = lector.nextDouble();

        System.out.print("Ingrese el precio final pagado: ");
        double precioPagado = lector.nextDouble();

        // Calculamos la diferencia del descuento y luego el porcentaje //
        double descuentoDinero = precioTarifa - precioPagado;
        double porcentajeDescuento = (descuentoDinero / precioTarifa) * 100;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El descuento aplicado fue del: " + porcentajeDescuento + "%");

        lector.close();
    }
}

// Ejercicio 10 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL VALOR DEL IVA ---");

        // Solicitamos el precio del artículo //
        System.out.print("Ingrese el precio del artículo: ");
        double precio = lector.nextDouble();

        // Calculamos el valor del IVA (19% = 0.19) //
        double valorIva = precio * 0.19;

        // Calculamos el precio total con IVA incluido //
        double precioTotal = precio + valorIva;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El valor pagado solo por concepto de IVA (19%) es: $" + valorIva);
        System.out.println("El precio total del artículo con IVA es: $" + precioTotal);

        lector.close();
    }
}

// Ejercicio 11 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- OPERACIONES ARITMÉTICAS BÁSICAS ---");

        // Solicitamos los dos números enteros //
        System.out.print("Ingrese el primer número entero: ");
        int num1 = lector.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = lector.nextInt();

        // Calculamos las operaciones básicas //
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        // Convertimos a double para obtener la división exacta //
        double division = (double) num1 / num2; 
        int modulo = num1 % num2;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo (Resto): " + modulo);

        lector.close();
    }
}

// Ejercicio 12 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- OBTENER ÚLTIMA CIFRA DE UN NÚMERO ---");

        // Solicitamos el número entero //
        System.out.print("Ingrese un número entero: ");
        int numero = lector.nextInt();

        // El operador módulo % 10 nos da siempre la última cifra //
        int ultimaCifra = Math.abs(numero) % 10;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("La última cifra del número es: " + ultimaCifra);

        lector.close();
    }
}

// Ejercicio 13 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE CENTÍMETROS A PULGADAS ---");

        // Solicitamos la medida en centímetros //
        System.out.print("Ingrese la medida en centímetros: ");
        double centimetros = lector.nextDouble();

        // Aplicamos la fórmula: Pulg = cm / 2.54 //
        double pulgadas = centimetros / 2.54;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(centimetros + " cm equivalen a: " + pulgadas + " pulgadas.");

        lector.close();
    }
}


// Ejercicio 14 // 
import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CONVERSIÓN DE SEGUNDOS A HORAS, MINUTOS Y SEGUNDOS ---");

        // Solicitamos la cantidad total de segundos //
        System.out.print("Ingrese el tiempo en segundos: ");
        int totalSegundos = lector.nextInt();

        // Calculamos las horas, minutos y segundos restantes //
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("\n--- RESULTADO ---");
        System.out.println(totalSegundos + " segundos equivalen a: " 
                + horas + " horas, " 
                + minutos + " minutos y " 
                + segundos + " segundos.");

        lector.close();
    }
}

// Ejercicio 15 //

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL VALOR TOTAL A PAGAR ---");

        // Solicitamos el valor unitario y la cantidad de artículos //
        System.out.print("Ingrese el valor unitario del artículo: ");
        double valorUnidad = lector.nextDouble();

        System.out.print("Ingrese la cantidad de artículos a llevar: ");
        int cantidad = lector.nextInt();

        // Aplicamos la fórmula: Total = Valor Unitario * Cantidad //
        double valorTotal = valorUnidad * cantidad;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El valor total a pagar es: $" + valorTotal);

        lector.close();
    }
}

// Ejercicio 16 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {
        
        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        System.out.println("--- CÁLCULO DEL ÁREA DE UN CÍRCULO ---");

        // Solicitamos el radio del círculo //
        System.out.print("Ingrese el radio del círculo: ");
        double radio = lector.nextDouble();

        // Aplicamos la fórmula: Área = PI * radio^2 //
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El área del círculo es: " + area);

        lector.close();
    }
}
