import javax.swing.JOptionPane;
public class Tarea_Estaciones {

    public static void main(String args[]){

        String valor=JOptionPane.showInputDialog("Introduce un número de un mes calendario");
        int mes=Integer.parseInt(valor);

        switch(mes){
            case 3:
            case 4:
            case 5:
                System.out.println("La estación del mes es Otoño");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("La estación del mes es Invierno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("La estación del mes es Primavera");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("La estación del mes es Verano");
                break;
            default:
                System.out.println("Mes y estacion no existen");
        }
    }
}