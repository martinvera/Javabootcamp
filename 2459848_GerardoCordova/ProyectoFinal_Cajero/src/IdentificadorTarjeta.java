
public class IdentificadorTarjeta {

    int digitos = 0;


    void identifica(double identificador2) {
        while(identificador2 >= 1)
        {   digitos++;
            identificador2 /= 10;
        }

        if (digitos == 16) {
            System.out.println("numero de tarjeta válido, usd. ingresó:"+ digitos +" caracteres numéricos");
            return;
        }

    }
}







