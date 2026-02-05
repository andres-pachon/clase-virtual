package calculdora;
import java.util.Scanner;

public class Calculdora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Porcentaje de grasa corporal");
            System.out.println("3. TMB según actividad física");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                   
                    System.out.print("Ingrese su peso en kilogramos: ");
                    double peso = sc.nextDouble();

                    System.out.print("Ingrese su altura en metros: ");
                    double altura = sc.nextDouble();

                    double imc = peso / (altura * altura);
                    System.out.println("Su IMC es: " + imc);

                    if (imc < 18.5) {
                        System.out.println("Clasificación: Delgadez");
                    } else if (imc < 25) {
                        System.out.println("Clasificación: Peso normal");
                    } else if (imc < 30) {
                        System.out.println("Clasificación: Sobrepeso");
                    } else {
                        System.out.println("Clasificación: Obesidad");
                    }
                    break;

                case 2:
                  
                    System.out.print("Ingrese su peso en kg: ");
                    peso = sc.nextDouble();

                    System.out.print("Ingrese su altura en metros: ");
                    altura = sc.nextDouble();

                    System.out.print("Ingrese su edad: ");
                    int edad = sc.nextInt();

                    imc = peso / (altura * altura);
                    double grasa = (1.2 * imc) + (0.23 * edad) - 10;

                    System.out.println("Porcentaje de grasa corporal: " + grasa + "%");
                    break;

                case 3:
                    
                    System.out.print("Ingrese su Tasa Metabólica Basal (TMB): ");
                    double tmb = sc.nextDouble();

                    System.out.println("Seleccione su nivel de actividad física:");
                    System.out.println("1. Poco o ningún ejercicio (1.2)");
                    System.out.println("2. Ejercicio ligero (1 a 3 días) (1.375)");
                    System.out.println("3. Ejercicio moderado (3 a 5 días) (1.55)");
                    System.out.println("4. Deportista (6 a 7 días) (1.72)");
                    System.out.println("5. Atleta (mañana y tarde) (1.9)");
                    System.out.print("Opción: ");

                    int nivel = sc.nextInt();
                    double factor;

                    switch (nivel) {
                        case 1: factor = 1.2; break;
                        case 2: factor = 1.375; break;
                        case 3: factor = 1.55; break;
                        case 4: factor = 1.72; break;
                        case 5: factor = 1.9; break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }

                    if (nivel >= 1 && nivel <= 5) {
                        double tmbActividad = tmb * factor;
                        System.out.println("Su TMB según la actividad física es: " + tmbActividad);
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}