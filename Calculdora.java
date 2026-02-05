<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

>>>>>>> DaironSalazar
package calculdora;
import java.util.Scanner;

<<<<<<< HEAD
import java.util.Scanner;
=======
/**
 *
 * @author pacho
 */


>>>>>>> DaironSalazar

public class Calculdora {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;

        // Entrada de datos
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = teclado.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = teclado.nextDouble();

        // Cálculo del IMC
        imc = peso / (altura * altura);

        // Mostrar IMC
        System.out.println("\nSu IMC es: " + imc);

        // Clasificación
        if (imc < 18.5) {
            System.out.println("Clasificación: Delgadez");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }

        teclado.close();
    }
}

=======
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

    

>>>>>>> DaironSalazar
