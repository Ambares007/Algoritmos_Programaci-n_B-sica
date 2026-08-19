// Ejercicio 1 //
import java.util.Scanner;

public class Algoritmos_Ejervicios {

    // El método 'main' es el punto de entrada, con base a lo investigado, sin este Método, 
    // el computador o programa no sabe por dónde empezar. Es lo que Java ejecuta primero para luego abrir paso a los demás métodos dwe Java. //
    public static void main(String[] args) {

        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        // Solicitamos al usuario la longitud de un lado //
        System.out.print("Ingrese la longitud de un lado del hexágono: ");
        double lado = lector.nextDouble();

        // Un hexágono regular tiene 6 lados iguales //
        // Aplicamos la fórmula: P = 6 * lado //
        double perimetro = 6 * lado;

        System.out.println("El perímetro es: " + perimetro);

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

        // Definimos el valor fijo por hora //
        double valorHora = 1000.0;
        double totalPagado = 0.0;

        // Bucle para pedir las horas de los 5 obreros //
        for (int i = 1; i <= 5; i++) {

            // Solicitamos al usuario el número de horas trabajadas //
            System.out.print("Horas trabajadas por el obrero " + i + ": ");
            double horas = lector.nextDouble();

            // Calcular el valor a pagar por cada obrero //
            double pago = horas * valorHora;
            System.out.println("Pago al obrero " + i + ": $" + pago);

            // Acumulamos para calcular el valor total pagado a todos los obreros //
            totalPagado = totalPagado + pago;
        }

        System.out.println("Total pagado a todos los obreros: $" + totalPagado);

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

        // Solicitamos al usuario el número entero de 5 dígitos //
        System.out.print("Ingrese un número de 5 dígitos: ");
        int numero = lector.nextInt();

        // Extraemos el primer dígito (dividiendo entre 10000) //
        int primero = numero / 10000;

        // Extraemos el último dígito (usando el residuo de 10) //
        int ultimo = numero % 10;

        // Elevamos al cuadrado multiplicando el número por sí mismo //
        int primeroCuadrado = primero * primero;
        int ultimoCuadrado = ultimo * ultimo;

        System.out.println("Primer dígito: " + primero + " → al cuadrado: " + primeroCuadrado);
        System.out.println("Último dígito: " + ultimo + " → al cuadrado: " + ultimoCuadrado);

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

        // Solicitamos al usuario la cantidad de décadas //
        System.out.print("Ingrese la cantidad de décadas: ");
        double decadas = lector.nextDouble();

        // Aplicamos la fórmula: 1 década = 10 años, 1 año = 365 días //
        double dias = decadas * 10 * 365;

        System.out.println(decadas + " década(s) equivalen a " + dias + " días.");

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

        // Solicitamos los datos requeridos por la fórmula //
        System.out.print("Presión: ");
        double presion = lector.nextDouble();

        System.out.print("Volumen: ");
        double volumen = lector.nextDouble();

        System.out.print("Temperatura: ");
        double temperatura = lector.nextDouble();

        // Aplicamos la fórmula: masa = (presión * volumen) / (0.37 * (temperatura + 460)) //
        double masa = (presion * volumen) / (0.37 * (temperatura + 460));

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

        // Solicitamos la edad de la persona //
        System.out.print("Edad de la persona: ");
        int edad = lector.nextInt();

        // Aplicamos la fórmula: num. pulsaciones = (220 - edad) / 10 //
        double pulsaciones = (220.0 - edad) / 10.0;

        System.out.println("Pulsaciones por cada 10 segundos: " + pulsaciones);

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

        // Solicitamos el valor de la hora y las horas trabajadas //
        System.out.print("Valor de la hora: ");
        double valorHora = lector.nextDouble();

        System.out.print("Horas trabajadas: ");
        double horas = lector.nextDouble();

        // Salario Total = Horas trabajadas * Valor por hora //
        double salarioTotal = horas * valorHora;

        // Retención en la fuente = 5% del salario total (0.05) //
        double retencion = salarioTotal * 0.05;

        // Salario Neto = Salario Total - Retención //
        double salarioNeto = salarioTotal - retencion;

        System.out.println("Salario Total: $" + salarioTotal);
        System.out.println("Retención (5%): $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);

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

        // Solicitamos el salario total mensual y las horas trabajadas //
        System.out.print("Salario total mensual: ");
        double salarioTotal = lector.nextDouble();

        System.out.print("Horas trabajadas: ");
        double horas = lector.nextDouble();

        // Aplicamos la fórmula: Valor Hora = Salario Total / Horas Trabajadas //
        double valorHora = salarioTotal / horas;

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

        // Solicitamos las notas del primer y segundo corte //
        System.out.print("Nota del primer corte (20%): ");
        double corte1 = lector.nextDouble();

        System.out.print("Nota del segundo corte (20%): ");
        double corte2 = lector.nextDouble();

        // Calculamos el acumulado de los dos primeros cortes //
        double acumulado = (corte1 * 0.20) + (corte2 * 0.20);

        // La nota mínima total requerida es 3.0 //
        // Fórmula: (3.0 - acumuladoActual) / 0.60 //
        double notaNecesaria = (3.0 - acumulado) / 0.60;

        System.out.println("Acumulado actual (40%): " + acumulado);

        // Verificamos si es posible obtener la nota o si ya aprobó //
        if (notaNecesaria <= 0) {
            System.out.println("¡Ya aprobaste! Necesitas mínimo 0.0 en el tercer corte.");
        } else if (notaNecesaria > 5.0) {
            System.out.println("Necesitarías " + notaNecesaria + ", no es posible alcanzar el 3.0.");
        } else {
            System.out.println("Para aprobar necesitas sacar mínimo: " + notaNecesaria);
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

        // Solicitamos la base y la altura //
        System.out.print("Base del triángulo: ");
        double base = lector.nextDouble();

        System.out.print("Altura del triángulo: ");
        double altura = lector.nextDouble();

        // Aplicamos la fórmula: Área = (base * altura) / 2 //
        double area = (base * altura) / 2;

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

        // Solicitamos los tres lados del triángulo //
        System.out.print("Primer lado: ");
        double lado1 = lector.nextDouble();

        System.out.print("Segundo lado: ");
        double lado2 = lector.nextDouble();

        System.out.print("Tercer lado: ");
        double lado3 = lector.nextDouble();

        // Aplicamos la fórmula: Perímetro = lado1 + lado2 + lado3 //
        double perimetro = lado1 + lado2 + lado3;

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

        // Solicitamos los grados Celsius //
        System.out.print("Grados Celsius: ");
        double celsius = lector.nextDouble();

        // Aplicamos la fórmula: Fahrenheit = (Celsius * 9/5) + 32 //
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");

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

        // Solicitamos los grados Fahrenheit //
        System.out.print("Grados Fahrenheit: ");
        double fahrenheit = lector.nextDouble();

        // Aplicamos la fórmula: Celsius = (Fahrenheit - 32) * 5 / 9 //
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " °F equivalen a " + celsius + " °C");

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

        // Solicitamos la distancia en millas marinas //
        System.out.print("Distancia en millas marinas: ");
        double millas = lector.nextDouble();

        // Aplicamos la fórmula: Metros = Millas Marinas * 1852 //
        double metros = millas * 1852;

        System.out.println(millas + " millas marinas equivalen a " + metros + " metros.");

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

        // Solicitamos el precio original y el precio pagado //
        System.out.print("Precio original (tarifa): ");
        double precioTarifa = lector.nextDouble();

        System.out.print("Precio final pagado: ");
        double precioPagado = lector.nextDouble();

        // Calculamos la diferencia del descuento y luego el porcentaje //
        double descuentoDinero = precioTarifa - precioPagado;
        double porcentaje = (descuentoDinero / precioTarifa) * 100;

        System.out.println("El descuento aplicado fue del: " + porcentaje + "%");

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

        // Solicitamos el precio del artículo //
        System.out.print("Precio del artículo: ");
        double precio = lector.nextDouble();

        // Calculamos el valor del IVA (19% = 0.19) //
        double valorIva = precio * 0.19;

        // Calculamos el precio total con IVA incluido //
        double precioTotal = precio + valorIva;

        System.out.println("Valor del IVA (19%): $" + valorIva);
        System.out.println("Precio total con IVA: $" + precioTotal);

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

        // Solicitamos los dos números enteros //
        System.out.print("Primer número entero: ");
        int num1 = lector.nextInt();

        System.out.print("Segundo número entero: ");
        int num2 = lector.nextInt();

        // Calculamos las operaciones básicas //
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Convertimos a double para obtener la división exacta //
        double division = (double) num1 / num2;
        int modulo = num1 % num2;

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

        // Solicitamos el número entero //
        System.out.print("Ingrese un número entero: ");
        int numero = lector.nextInt();

        // El operador módulo % 10 nos da siempre la última cifra //
        int ultimaCifra = numero % 10;

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

        // Solicitamos la medida en centímetros //
        System.out.print("Medida en centímetros: ");
        double centimetros = lector.nextDouble();

        // Aplicamos la fórmula: Pulg = cm / 2.54 //
        double pulgadas = centimetros / 2.54;

        System.out.println(centimetros + " cm equivalen a " + pulgadas + " pulgadas.");

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

        // Solicitamos la cantidad total de segundos //
        System.out.print("Tiempo en segundos: ");
        int totalSegundos = lector.nextInt();

        // Calculamos las horas, minutos y segundos restantes //
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println(totalSegundos + " segundos equivalen a "
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

        // Solicitamos el valor unitario y la cantidad de artículos //
        System.out.print("Valor unitario del artículo: ");
        double valorUnidad = lector.nextDouble();

        System.out.print("Cantidad de artículos: ");
        int cantidad = lector.nextInt();

        // Aplicamos la fórmula: Total = Valor Unitario * Cantidad //
        double valorTotal = valorUnidad * cantidad;

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

        // Solicitamos el radio del círculo //
        System.out.print("Radio del círculo: ");
        double radio = lector.nextDouble();

        // Aplicamos la fórmula: Área = PI * radio * radio //
        double area = Math.PI * radio * radio;

        System.out.println("El área del círculo es: " + area);

        lector.close();
    }
}


// Ejercicio 17 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {

        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        // Solicitamos los dos lados del rectángulo //
        System.out.print("Lado a (base/ancho): ");
        double ladoA = lector.nextDouble();

        System.out.print("Lado b (altura/largo): ");
        double ladoB = lector.nextDouble();

        // Aplicamos las fórmulas: P = 2*a + 2*b y A = a*b //
        double perimetro = (2 * ladoA) + (2 * ladoB);
        double area = ladoA * ladoB;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        lector.close();
    }
}


// Ejercicio 18 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {

        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        // Solicitamos la longitud del lado del cuadrado //
        System.out.print("Lado del cuadrado: ");
        double lado = lector.nextDouble();

        // Aplicamos las fórmulas: P = 4 * lado y A = lado * lado //
        double perimetro = 4 * lado;
        double area = lado * lado;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        lector.close();
    }
}

// Ejercicio 19 // 

import java.util.Scanner;

public class Algoritmos_Ejercicios {

    // El método 'main' es el punto de entrada. Es lo que Java ejecuta primero //
    public static void main(String[] args) {

        // Creamos un objeto Scanner asociado a la entrada del sistema //
        Scanner lector = new Scanner(System.in);

        // Solicitamos los valores de x, y, z //
        System.out.print("Valor de x: ");
        double x = lector.nextDouble();

        System.out.print("Valor de y: ");
        double y = lector.nextDouble();

        System.out.print("Valor de z: ");
        double z = lector.nextDouble();

        // Aplicamos la fórmula: A = 2 * (x*x) * (y*y*y) * z //
        double resultadoA = 2 * (x * x) * (y * y * y) * z;

        System.out.println("El valor de A es: " + resultadoA);

        lector.close();
    }
}

