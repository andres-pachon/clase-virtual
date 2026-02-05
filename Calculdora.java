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

<<<<<<< HEAD
    import java.util.Scanner;

public class Calculdora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese su Tasa Metabólica Basal (TMB): ");
        double tmb = sc.nextDouble();

        
        System.out.println("Seleccione su nivel de actividad física:");
        System.out.println("1. Poco o ningún ejercicio (1.2)");
        System.out.println("2. Ejercicio ligero (1 a 3 días) (1.375)");
        System.out.println("3. Ejercicio moderado (3 a 5 días) (1.55)");
        System.out.println("4. Deportista (6 a 7 días) (1.72)");
        System.out.println("5. Atleta (mañana y tarde) (1.9)");

        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        double valorActividad = 0;

        
        switch (opcion) {
            case 1:
                valorActividad = 1.2;
                break;
            case 2:
                valorActividad = 1.375;
                break;
            case 3:
                valorActividad = 1.55;
                break;
            case 4:
                valorActividad = 1.72;
                break;
            case 5:
                valorActividad = 1.9;
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

      
        double tmbActividadFisica = tmb * valorActividad;

        System.out.println("Su TMB según la actividad física es: " + tmbActividadFisica);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
=======

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
>>>>>>> a11d72e189d6dadd7f752b9511e60250f0fff415
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
