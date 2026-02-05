package calculdora;

import java.util.Scanner;

public class Calculdora {

    public static void main(String[] args) {

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

