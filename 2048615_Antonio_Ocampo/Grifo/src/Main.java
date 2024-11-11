import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Validaciones validaciones = new Validaciones();
        DatosCliente datosCliente = new DatosCliente();
        ConstantesGrifo constantesGrifo = new ConstantesGrifo();
        CompraCombustible compraCombustible = new CompraCombustible();
        String numPlaca;
        String nomApellidos;
        String fecHora;
        double precioUnitario = 0.0;
        double cantidadGalones = 0.0;
        int tipoCom = 0;
        int opcionCombustible = 0;
        String opcionLetra = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de Placa: ");
        numPlaca = scanner.nextLine();
        if (validaciones.validaPlaca (numPlaca)) {
            System.out.println("Ingrese Nombre y Apellidos: ");
            nomApellidos = scanner.nextLine();
            datosCliente.placa = numPlaca;
            datosCliente.nombresyApellidos =nomApellidos;
            datosCliente.saldoTarjeta = constantesGrifo.SALDO_TARJETA;
            for (int i = 0; i < constantesGrifo.INTENTOS; i++) {
                compraCombustible.mostrarCombustible(constantesGrifo.NOMBRES_TIPO_COMBUSTIBLE, constantesGrifo.PRECIO_TIPO_COMBUSTIBLE);
                System.out.println("Seleccione el Tipo de Combustible");

                int contador = (constantesGrifo.INTENTOS - 1) - i;
                opcionLetra = scanner.nextLine();
                if (!(validaciones.validaNumerosEnteros(opcionLetra))) {

                    System.out.println("Error en Dato. Solo números: Tienes " + contador + " oportunidades mas para elegir");
                    Thread.sleep(2000);

                }
                else{
                    opcionCombustible = Integer.valueOf(opcionLetra);
                    if (!(validaciones.validaTipoCombustible(opcionCombustible, 1, 3))){
                        System.out.println("Solo puedes elegir las que se indica en pantalla");
                        System.out.println("Tienes " + contador + " oportunidades mas para elegir");
                        Thread.sleep(2000);
                    }
                    else{
                        break;
                    }


                }
                if(contador == 0) {
                    return;
                }
            }


            tipoCom = opcionCombustible - 1;
            precioUnitario = constantesGrifo.PRECIO_TIPO_COMBUSTIBLE[tipoCom];
            cantidadGalones = compraCombustible.calcularGalonesCombustible(precioUnitario,300);
            datosCliente.deducirSaldo(300.00);




            for (int i = 0; i < constantesGrifo.INTENTOS; i++) {
                compraCombustible.mostrarFormaPago();
                System.out.println("Seleccione la forma de Pago");
                String formaPago;

                int contador = 2 - i;
                opcionLetra = scanner.nextLine();
                if (!(validaciones.validaNumerosEnteros(opcionLetra))) {

                    System.out.println("Error en Dato. Solo números: Tienes " + contador + " oportunidades mas para elegir");
                    Thread.sleep(2000);

                }
                else{
                    opcionCombustible = Integer.valueOf(opcionLetra);
                    if (!(validaciones.validaTipoCombustible(opcionCombustible, 1,2))){
                        System.out.println("Solo puedes elegir las que se indica en pantalla");
                        System.out.println("Tienes " + contador + " oportunidades mas para elegir");
                        Thread.sleep(2000);
                    }
                    else{
                        break;
                    }


                }
                if(contador == 0) {
                    return;
                }
            }






            Date fechaDiaHora = new Date();
            fecHora = compraCombustible.fechaActual(fechaDiaHora) + " " + compraCombustible.horaActual(fechaDiaHora);
            compraCombustible.imprimirBoleta("Trescientos y 00/100 Nuevos Soles", datosCliente.placa,datosCliente.nombresyApellidos,fecHora,precioUnitario,cantidadGalones,300.00);

            datosCliente.ImprimirSaldoTarjeta(datosCliente.saldoTarjeta);

            Thread.sleep(3000);
        }
        else {
            System.out.println("Error con la placa ingresada");

        }


    }


}