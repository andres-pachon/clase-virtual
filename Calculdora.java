/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculdora;
import java.util.Scanner;

/**
 *
 * @author pacho
 */



public class Calculdora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        int edad;
        double imc;
        double grasa;

        System.out.print("Ingrese su peso en kg: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        // Calcular IMC
        imc = peso / (altura * altura);

        // Calcular porcentaje de grasa corporal (fórmula simple)
        grasa = (1.2 * imc) + (0.23 * edad) - 10;

        System.out.println("Porcentaje de grasa corporal: " + grasa + "%");
    }
}

    

