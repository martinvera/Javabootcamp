package com.tarea.sesion2.Ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.List;

public class Mes {
    private Month nombre;
    private int numeroRepresentacion;
    private int totalDias;

    private String Region;

    public Mes () {

    }

    public void mostrarDiasCalendario () {
        int c = 1;
        while (c < getTotalDias()) {
            for (int i = 0; i < 7; i++){
                System.out.print(c + "\t");
                c++;
                if (c > getTotalDias()) {
                    break;
                }
            }
            System.out.println("");
        }
    }

    public void mostrarDiasImpares () {
        List<Integer> lst = null;

        for (int i = 0; i < getTotalDias(); i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public Month getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = Month.of(this.numeroRepresentacion);
    }

    public int getNumeroRepresentacion() {
        return numeroRepresentacion;
    }

    public void setNumeroRepresentacion(int numeroRepresentacion) {
        this.numeroRepresentacion = numeroRepresentacion;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias() {
        YearMonth yearMonth = YearMonth.of(LocalDate.now(ZoneId.of(getRegion())).getYear(), getNombre());
        this.totalDias = yearMonth.lengthOfMonth();
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }
}
