package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class EjercicosTime {
    public static void main(String[] args){
        LocalDate fechaInicioCurso = LocalDate.of(2024, Month.APRIL, 3);
        LocalDate fechaFinCurso = fechaInicioCurso.plusDays(10);
        System.out.println("Inicio: "+fechaInicioCurso + " Fin: "+fechaFinCurso);

        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Fecha hoy: "+fechaHoy);

        ZonedDateTime fechaHoySidney = ZonedDateTime.now(ZoneId.of("Australia/Sidney"));
        System.out.println("Fecha hoy Sidney: "+fechaHoySidney);

        LocalDate dia100_2024 = LocalDate.ofYearDay(2024, 100);
        System.out.println("Dia 100 de 2024: "+dia100_2024);

        LocalDate navidad = LocalDate.of(2024, Month.DECEMBER, 25);
        LocalDate nocheVieja = LocalDate.of(2024, Month.DECEMBER, 31);
        if(navidad.isBefore(nocheVieja)){
            System.out.println("Navidad es antes que Nochevieja");
        }else if (navidad.isAfter(nocheVieja)){
            System.out.println("Navidad es después de Nochevieja");
        }else{
            System.out.println("Navidad es el mismo día que Nochevieja");
        }

        LocalDate fechaInicial = LocalDate.of(2024, Month.MARCH, 15);
        LocalDate fechaFinal = fechaInicial.plusWeeks(35);
        System.out.println("Fecha inicial: "+fechaInicial+" Fecha final: "+fechaFinal);

        LocalDate fechaInicioTrabajo = LocalDate.of(20012, Month.JULY, 6);
        long tiempoTrabajo = ChronoUnit.YEARS.between(fechaInicioTrabajo, LocalDate.now());
        System.out.println("Tiempo trabajado: "+tiempoTrabajo+" años");

        LocalDate fechaNacimiento = LocalDate.of(2007, Month.AUGUST, 7);
        long edad = ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edad: "+edad);

        LocalDate fechaEntregaProyecto = LocalDate.of(2024, Month.OCTOBER, 2);
        LocalDate fechaInicioProyecto = fechaEntregaProyecto.minusDays(200);
        System.out.println("Iniciar el proyecto en la fecha: "+fechaInicioProyecto);

        LocalDate fechaInicio = LocalDate.of(2024, Month.MARCH, 15);
        LocalDate fechaFin = LocalDate.of(2024, Month.OCTOBER, 20);
        long periodo = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println("Duración del proyecto: "+periodo+" días");

    }
}
