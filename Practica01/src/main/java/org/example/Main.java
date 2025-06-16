package org.example;

// importar librerías

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //Instanciar Clases

        Scanner readData = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        //Datos de Entrada

        String nombre;
        float salarioBasico;

        //Datos de Salida

        float salarioNeto;

        //Constantes

        final int AUXILIO_TRANSPORTE = 140000;
        final float DEDUCCIONES_SALARIO = 0.8F;

        //Ingreso de Información

        System.out.print("\nIngrese su Nombre: ");
        nombre = readData.next();
        System.out.print("\nIngrese su Salario Basico: ");
        salarioBasico = readData.nextFloat();

        //Proceso u Operaciones

        salarioNeto = (salarioBasico * DEDUCCIONES_SALARIO) + AUXILIO_TRANSPORTE;

        //Resultado

        System.out.print("\nTú salario neto es: " + decimalFormat.format(salarioNeto) +"$.");

        readData.close();
    }
}