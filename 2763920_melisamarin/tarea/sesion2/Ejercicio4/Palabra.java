package com.tarea.sesion2.Ejercicio4;

public class Palabra {
    private String valor;

    public Palabra () {

    }

    public String textoAMayuscula (String valor) {
        return valor.toUpperCase();
    }

    public char[] descomponerTexto (){
        return getValor().toCharArray();
    }

    public void obtenerVocal (char[] palabraDescompuesta) {
        for (char c : palabraDescompuesta) {
            if (esVocal(c)) {
                System.out.print(c + " ");
            }
        }
    }

    public boolean esVocal (char letra) {
        char[] vocales= {'a', 'e', 'i', 'o', 'u'};
        boolean flag = false;
        int i = 0;
        do {
            if (i < 5) {
                if (letra == vocales[i])
                    flag = true;
                i++;
            }else {
                break;
            }
        }while (!flag);
        return flag;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
