package zona_fit;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class logicaDeProgramas {
    public static void main(String[] args) {
        logicaDeProgramas();
    }

    public static void logicaDeProgramas() {
        var salir = false;
        var consola = new Scanner(System.in);
        System.out.println("*** LOGICA DE PROGRAMAS ***");
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola);
            } catch (Exception e) {
                System.out.println("Ocurrio un error : " + e.getMessage());
            } finally {
                System.out.println();
            }
        }

    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1.Mostrar los dias impares del mes
                2.Mostrar estaciones del año
                3.Calculadora
                4.Convertir palabra a MAY e imprimir voc
                5.Calcular interes
                6.Verificar numero primo
                7.Imprimir el dia de una fecha cualquiera
                8.Salir
                Elige una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola) {
        var salir = false;
        switch (opcion) {
            case 1 ->diasImpares(consola);
            case 2 -> mostrarEstacionPorMes(consola);
            case 3 -> calculadora(consola);
            case 4 -> convertirYExtraerVocales(consola);
            case 5 -> calcularInteresYIGV(consola);
            case 6 ->verificarPrimo(consola);
            case 7 -> imprimirDiaDeFecha(consola);
            case 8 ->{
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida :" + opcion);

        }
        return salir;
    }
    public static void diasImpares(Scanner consola){
        boolean isImpar=false;
        int diaMes=30;
        for( int i=1; i<=diaMes; i++){
            if( i % 2!=0){
                System.out.println(i );
            }

        }
    }
    public static void mostrarEstacionPorMes(Scanner consola) {
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = Integer.parseInt(consola.nextLine());

        String estacion;
        if (mes >= 3 && mes <= 5) {
            estacion = "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            estacion = "Verano";
        } else if (mes >= 9 && mes <= 11) {
            estacion = "Otoño";
        } else if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Invierno";
        } else {
            System.out.println("Mes inválido. Por favor, introduce un número entre 1 y 12.");
            return;
        }

        System.out.println("La estación correspondiente es: " + estacion);
    }
    public static void calculadora(Scanner consola) {
        System.out.print("Introduce el primer número: ");
        double num1 = Double.parseDouble(consola.nextLine());
        System.out.print("Introduce el segundo número: ");
        double num2 = Double.parseDouble(consola.nextLine());
        System.out.print("""
            Elige una operación:
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Potencia
            Opción:\s""");
        int operacion = Integer.parseInt(consola.nextLine());
        double resultado;

        if (operacion == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacion == 2) {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacion == 3) {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacion == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Error: División por cero.");
            }
        } else if (operacion == 5) {
            resultado = Math.pow(num1, num2);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operación inválida");
        }
    }
    public static void convertirYExtraerVocales(Scanner consola) {
        System.out.print("Introduce una palabra o cadena de texto en minúsculas: ");
        String texto = consola.nextLine();

        // Convertir a mayúsculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);

        // Extraer y mostrar las vocales
        StringBuilder vocales = new StringBuilder();
        for (char c : textoMayusculas.toCharArray()) {
            if ("AEIOU".indexOf(c) != -1) {
                vocales.append(c).append(" ");
            }
        }

        System.out.println("Vocales encontradas: " + vocales.toString());
    }
    public static void calcularInteresYIGV(Scanner consola) {
        System.out.print("Introduce el monto del préstamo: ");
        double monto = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce la tasa de interés en %: ");
        double tasaInteres = Double.parseDouble(consola.nextLine());

        // Cálculo del interés
        double interes = (monto * tasaInteres) / 100;
        System.out.println("Interés calculado: " + interes);

        // Cálculo del IGV del 18% sobre el interés
        double igv = interes * 0.18;
        System.out.println("IGV del 18% sobre el interés: " + igv);

        // Monto total a pagar
        double totalAPagar = monto + interes + igv;
        System.out.println("Monto total a pagar (monto + interés + IGV): " + totalAPagar);
    }


    public static void verificarPrimo(Scanner consola) {

        boolean isPrime = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                isPrime=true;
            break;
        }
        if (!isPrime) {
            System.out.println(n+ "es primo");
        }
        else{
            System.out.println(n+ "no es primo");
        }
    }
    public static void imprimirDiaDeFecha(Scanner consola) {
        System.out.print("Introduce una fecha en formato dd/MM/yyyy: ");
        String fechaInput = consola.nextLine();

        try {
            // Formatear la fecha ingresada
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaInput, formato);

            // Obtener el día de la semana
            String diaDeLaSemana = fecha.getDayOfWeek().toString();

            // Imprimir el día de la semana en español
            switch (diaDeLaSemana) {
                case "MONDAY" -> System.out.println("La fecha corresponde a un Lunes.");
                case "TUESDAY" -> System.out.println("La fecha corresponde a un Martes.");
                case "WEDNESDAY" -> System.out.println("La fecha corresponde a un Miércoles.");
                case "THURSDAY" -> System.out.println("La fecha corresponde a un Jueves.");
                case "FRIDAY" -> System.out.println("La fecha corresponde a un Viernes.");
                case "SATURDAY" -> System.out.println("La fecha corresponde a un Sábado.");
                case "SUNDAY" -> System.out.println("La fecha corresponde a un Domingo.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Fecha inválida. Por favor, introduce una fecha en el formato dd/MM/yyyy.");
        }
    }
}

