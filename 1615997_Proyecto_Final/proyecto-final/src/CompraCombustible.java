import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CompraCombustible {
    private String placa;
    private String nombres;
    private int tipoDeCombustible;
    private double precioDeEleccion;
    private int cantidadDeCarga;
    private double montoDeCarga;
    private int pago;
    private double totalGalones;
    private double saldoTarjeta;
    private String fechaHora;

    //Constante
    final double SALDO = 1250.44;


    //Metodos para Solicitar numero de placa, hasta ingresar placa de 6 digitos alfnumetico
    public void validarPlaca(String unaPlaca) {

        Scanner input = new Scanner(System.in);
        boolean placaValida = false;
        while (!placaValida) {
            System.out.print("Por favor, ingrese una placa (formato: AAA-123): ");
            unaPlaca = input.nextLine();
            this.placa = unaPlaca;
            //Validar que la placa tenga 6 caracteres y sea alfanumerica
            if (unaPlaca != null && unaPlaca.matches("[A-Z]{3}-[0-9]{3}")) {
                placaValida = true;
                solicitarNombres(unaPlaca);
            } else {
                System.out.println("Por favor ingrese una placa valida:");
            }
        }

    }


    //Metodo para solicitar nombres
    public void solicitarNombres(String unNombres) {
        this.nombres = unNombres;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese sus nombres:");
        this.nombres = input.nextLine();
        elegirCombustible();

    }


    //Precios de combutible en una lista
    double[] preciosCombustible = {19.40, 16.80, 9.50};

    //Metodo par solicitar el tipo de combustible
    public void elegirCombustible() {
        //Ingresando el tipo de combustible
        Scanner scanner = new Scanner(System.in);
        boolean combustibleValido = false;
        while (!combustibleValido) {
            System.out.println("Elija el tipo de combustible:");
            System.out.println("1. Premiun");
            System.out.println("2. Regular ");
            System.out.println("3. Diesel");
            tipoDeCombustible = scanner.nextInt();
            if (tipoDeCombustible == 1) {

                precioDeEleccion = preciosCombustible[0];
                combustibleValido = true;
                elegirCantidadDeCarga();

            } else if (tipoDeCombustible == 2) {

                precioDeEleccion = preciosCombustible[1];
                combustibleValido = true;
                elegirCantidadDeCarga();

            } else if (tipoDeCombustible == 3) {

                precioDeEleccion = preciosCombustible[2];
                combustibleValido = true;
                elegirCantidadDeCarga();

            } else {
                System.out.println("Tipo de combustible no válido. Seleccione premium, regular o diesel.");
            }

        }

    }


    //Metodo para solicitar la cantidad de carga
    public double  elegirCantidadDeCarga() {
        Scanner input = new Scanner(System.in);
        boolean cargaValida = false;
        while (!cargaValida) {
            System.out.println("Elija las siguietes opciones de carga");
            System.out.println("1. Tanque lleno = 300 soles");
            System.out.println("2. Otra cantidad");
            cantidadDeCarga = input.nextInt();
            if (cantidadDeCarga == 1) {
                 montoDeCarga = 300;
                cargaValida = true;
                tipoDePago();
            } else if (cantidadDeCarga == 2) {
                System.out.println("Ingrese la cantidad de carga en soles:");
                montoDeCarga = input.nextDouble();
                cargaValida = true;
                tipoDePago();
            } else {
                System.out.println("Opcion no valida. Seleccione la opcion 1 o 2.");

            }
        }
        return montoDeCarga;
    }


    //Metodo para el tipo de Pago
    public void  tipoDePago(){
        Scanner input = new Scanner(System.in);
        boolean pagoValido = false;
                    while (!pagoValido) {
                    System.out.println("Elija la manera de pagar su compra:");
                    System.out.println("1. Efectivo");
                    System.out.println("2. Tarjeta");
                    pago = input.nextInt();
                    if(pago == 1){
                        pagoValido =  true;
                        calcularSaldoTarjeta(pago);
                    }else if(pago == 2){
                        calcularSaldoTarjeta(pago);
                        pagoValido =  true;
                    }else{
                        System.out.println("Forma de pago invalido");
                    }
                }
        cantidadGalones();
        imprimirDatos();
    }

    //Metodo para cantidad de Galosnes
    public void cantidadGalones() {

        totalGalones = montoDeCarga / precioDeEleccion;
    }

    //Metodo para calcular el saldo de la tarjeta
    public void calcularSaldoTarjeta(int pago) {
        if(pago == 1){
            saldoTarjeta = SALDO;
        }else {
            saldoTarjeta = SALDO - montoDeCarga;
        }

    }


    //Metodo para imprimir los datos de la compra
    public void imprimirDatos() {
        Convertidor convertidor = new Convertidor();
        // Obtener la fecha y hora actuales
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            fechaHora = fechaHoraActual.format(formato);

        DecimalFormat df = new DecimalFormat("#,00");

        System.out.println("-------------------------- .... ---------------------------");
        System.out.println("DETALLES DE SU COMPRA:");
        System.out.println("Monto pagado: " + convertidor.convertToWords(montoDeCarga));
        System.out.println("Placa: " + placa);
        System.out.println("Nombres: " + nombres);
        System.out.println("Fecha y hora de compra: " + fechaHora);
        System.out.println("Precio Unitario: S/ " + precioDeEleccion + " por Galon");
        System.out.println("Cantidad de Galones: " + df.format(totalGalones));
        System.out.println("Monto final: S/ " + montoDeCarga);
        if(pago !=1) {
            System.out.println("Saldo en tarjeta: S/ " + saldoTarjeta);
        }

        System.out.println("----------------¡ Gracias por su preferencia !----------------");
    }

}

