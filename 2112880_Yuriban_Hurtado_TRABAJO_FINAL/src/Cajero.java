import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cajero {

    private static final double SALDO_FINAL = 5500.88;
    private static final double TIPO_CAMBIO = 4.0;

    private void numerosEnLetras(double monto) {
        String nuevoMonto = Integer.toString((int)monto);
        int cantidad = nuevoMonto.length();
        int posicion1 = 0;
        int posicion2 = 0;
        int posicion3 = 0;
        int posicion4 = 0;
        String mensajeFinal = "";
        String[] unidad = {"Cero","Un", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
        String[] centena = {"Cero","Cien", "Docientos", "Trecientos", "Cuatrocientos", "Quinientos", "Seicientos", "Setecientos", "Ochocientos", "Novencientos"};
        String[] decena = {"Cero","Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
        String[] millar = {"Cero","Mil", "Dos mil", "Tres mil", "Cuatro mil", "Cinco mil", "Seis mil", "Siete mil", "Ocho mil", "Nueve mil"};
        switch (cantidad) {
            case 1:
                posicion1 = Character.getNumericValue(nuevoMonto.charAt(0));
                mensajeFinal = unidad[posicion1];
                System.out.println(mensajeFinal + " soles");
                break;
            case 2:
                posicion1 = Character.getNumericValue(nuevoMonto.charAt(0));
                posicion2 = Character.getNumericValue(nuevoMonto.charAt(1));
                mensajeFinal = decena[posicion1] + " con " + unidad[posicion2] + " Soles";
                System.out.println(mensajeFinal);
                break;
            case 3:
                posicion1 = Character.getNumericValue(nuevoMonto.charAt(0));
                posicion2 = Character.getNumericValue(nuevoMonto.charAt(1));
                posicion3 = Character.getNumericValue(nuevoMonto.charAt(2)) ;
                mensajeFinal = centena[posicion1] + " con " + decena[posicion2] + " y " + unidad[posicion3] + " Soles";
                System.out.println(mensajeFinal);
                break;
            case 4:
                posicion1 = Character.getNumericValue(nuevoMonto.charAt(0));
                posicion2 = Character.getNumericValue(nuevoMonto.charAt(1));
                posicion3 = Character.getNumericValue(nuevoMonto.charAt(2));
                posicion4 = Character.getNumericValue(nuevoMonto.charAt(3));
                mensajeFinal = millar[posicion1]+" " + centena[posicion2] +" "+ decena[posicion3] +" "+ unidad[posicion4] + " soles";
                System.out.println(mensajeFinal);
                break;
        }
    }

    private void impresionPantalla(double monto){
        Date fecha = new Date(); //Crea un objeto de tipo date
        String formato = "hh:mm:ss a dd-MMM-yyyy";
        SimpleDateFormat formatoSimple = new SimpleDateFormat(formato);
        System.out.println("El monto total era: " + SALDO_FINAL);
        System.out.println("El monto retirado es: " + monto);
        System.out.println("El monto restante es : " + (SALDO_FINAL-monto));
        System.out.println("Fecha y hora de retiro: " + formatoSimple.format(fecha));
        numerosEnLetras(monto);
    }
    public void procesoPrincipal(){
        long tarjeta = 0;
        String nombre = "";
        String apellido = "";
        int moneda = 0;
        double monto = 0.0;
        boolean isNumeric = false;

        Scanner ingreso = new Scanner(System.in);

        do{
            try{
                System.out.println("Ingrese su número de tarjeta: ");
                tarjeta = ingreso.nextLong();
                do {
                    if (Long.toString(tarjeta).length() == 16) {
                        System.out.println("Ingrese su nombre: ");
                        nombre = ingreso.next();
                        System.out.println("Ingrese su apellido: ");
                        apellido = ingreso.next();
                        isNumeric = true;
                    } else {
                        System.out.println("El número de tarjeta es incorrecto (Menor o mayor a 16 dígitos)");
                        System.out.println("Vuelve a ingresarlo: ");
                        tarjeta = ingreso.nextLong();
                        isNumeric = false;
                        ingreso.nextLine();
                    }
                }while(isNumeric==false);

                do{
                    try{
                        System.out.println("Ingrese la moneda de retiro: (1)Soles - (2)Dólares : ");
                        moneda = ingreso.nextInt();
                        if(moneda==1){
                            System.out.println("Soles");
                            isNumeric=true;
                        } else if (moneda==2) {
                            System.out.println("Dolares");
                            isNumeric=true;
                        }else{
                            System.out.println("El valor no es una de las opciones. Inténtelo nuevamente: ");
                            isNumeric = false;
                        }
                    }catch(Exception e){
                        System.out.println("El valor ingresado no es un NUMERO");
                        ingreso.nextLine();
                        isNumeric = false;
                    }
                }while (isNumeric==false);

                do{
                    try {
                        System.out.println("Ingrese el monto a retirar: ");
                        monto = ingreso.nextDouble();

                        if (monto <= 0 || monto > SALDO_FINAL) {
                            System.out.println("El valor ingresado es negativo o es mayor al saldo");
                            isNumeric = false;
                        } else {
                            if (moneda == 2) {
                                monto = monto / TIPO_CAMBIO;
                                isNumeric = true;
                            } else {
                                isNumeric = true;
                            }
                        }

                    }catch(Exception e){
                        System.out.println("El valor ingresado no es un número");
                        isNumeric=false;
                        ingreso.nextLine();
                    }

                }while(isNumeric == false);

            }catch(Exception e){
                System.out.println("El valor ingresado no es un número");
                isNumeric = false;
                ingreso.nextLine();}
        }while(isNumeric == false);

        impresionPantalla(monto);
    }
}
