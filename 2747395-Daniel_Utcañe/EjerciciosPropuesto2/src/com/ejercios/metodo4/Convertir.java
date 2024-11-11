package com.ejercios.metodo4;

public class Convertir {

//    private String mayus;
//    private String minus;
//    private String vocales;
    private String palabra;
    private int op;

    public Convertir() {

    }

    public Convertir(int op, String palabra) {
//        this.mayus = mayus;
//        this.minus = minus;
//        this.vocales = vocales;
        this.op = op;
        this.palabra = palabra;
    }

    public void operacion(){
        String mayus = "";
        String minus = "";
        String vocales = "";
        if (this.op == 1) {

            mayus = this.palabra.toUpperCase();
            for (int i = 0; i < mayus.length(); i++) {
                if (mayus.charAt(i) == 'A' || mayus.charAt(i) == 'E' || mayus.charAt(i) == 'I' || mayus.charAt(i) == 'O' || mayus.charAt(i)== 'U' ) {

                    vocales += mayus.charAt(i);
                }
            }
            System.out.println("palabra convertida: " + mayus);
            System.out.println("las vocales son: " + vocales);
        }
        if (this.op == 2) {

            minus = this.palabra.toLowerCase();
            for (int i = 0; i < minus.length(); i++) {
                if (minus.charAt(i) == 'a' || minus.charAt(i) == 'e' || minus.charAt(i) == 'i' || minus.charAt(i) == 'o' || minus.charAt(i)== 'u' ) {

                    vocales += minus.charAt(i);
                }
            }
            System.out.println("palabra convertida: " + minus);
            System.out.println("las vocales son: " + vocales);
        }

    }

}
