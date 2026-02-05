/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculdora;

/**
 *
 * @author pacho
 */

    import java.util.Scanner;

    public class calculdora {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Pedir TMB base
            System.out.print("Ingrese su Tasa Metabólica Basal (TMB): ");
            double tmb = sc.nextDouble();
    
            // Mostrar opciones de actividad
            System.out.println("Seleccione su nivel de actividad física:");
            System.out.println("1. Poco o ningún ejercicio (1.2)");
            System.out.println("2. Ejercicio ligero (1 a 3 días) (1.375)");
            System.out.println("3. Ejercicio moderado (3 a 5 días) (1.55)");
            System.out.println("4. Deportista (6 a 7 días) (1.72)");
            System.out.println("5. Atleta (mañana y tarde) (1.9)");
    
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
    
            double valorActividad = 0;
    
            // Asignar valor según la opción
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
    
            // Cálculo final
            double tmbActividadFisica = tmb * valorActividad;
    
            System.out.println("Su TMB según la actividad física es: " + tmbActividadFisica);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
