import java.util.Scanner;

public class RegistroEstudiantes {  //Variables

    static String estudianteActualNombre = "N/A";
    private static double nota1 = 0.0;
    private static double nota2 = 0.0;
    private static double nota3 = 0.0;

    private static final String SIN_ESTUDIANTE = "N/A";
    
    public static void mostrarMenu(){  //metodo sin parametros, no necesitamos devolver nada
        System.out.println("--- Sistema de Registro de Estudiantes ---");
        System.out.println("1- Registrar datos de un estudiante");
        System.out.println("2- Mostrar datos del estudiante actual");
        System.out.println("3- Calcular promedio de notas del estudiante actual");
        System.out.println("4- Salir");
        System.out.println("Ingrese su opciòn: ");
    }

    public static boolean validarNombre(String name){
        
        
        if(name == null){
            return false;
        }

        String nombreLimpio = name.trim(); // variable para revisar que no haya solo un espacio en el nombre

        if(nombreLimpio.length() == 0)
            return false;
        
        return true;

    }

    public static boolean validarNota(double nota) {
        
        if(nota < 0){
            return false;
        }
        if(nota > 100){
            return false;
        }
        return true;
    }

    public static void registrarInformacionEstudiante(Scanner sc) {
        
        String nombreIngresado = "";
            
        while (true) { 
             System.out.println("Ingrese el nombre del estudiante");
             nombreIngresado = sc.nextLine();

             if(validarNombre(nombreIngresado.trim())){
                estudianteActualNombre = nombreIngresado.trim();
                break;
             } else {
                System.out.println("Nombre invalido. Intente de nuevo");
             }
       }

        while (true) { 
             System.out.println("Ingrese la nota 1 (0 a 100, use punto para decimales):");
             nota1 = sc.nextDouble();
             sc.nextLine();

             if(validarNota(nota1)){
                break;
             } else {
                System.out.println("Nota invalido. Intente de nuevo");
             }
       }

       while (true) { 
             System.out.println("Ingrese la nota 2 (0 a 100, use punto para decimales):");
             nota1 = sc.nextDouble();
             sc.nextLine();

             if(validarNota(nota2)){
                break;
             } else {
                System.out.println("Nota invalido. Intente de nuevo");
             }
       }

       while (true) { 
             System.out.println("Ingrese la nota 3 (0 a 100, use punto para decimales):");
             nota1 = sc.nextDouble();
             sc.nextLine();

             if(validarNota(nota3)){
                break;
             } else {
                System.out.println("Nota invalido. Intente de nuevo");
             }
       }

       System.out.println("Estudiante registrado correctamente");

       
    }

    public static void mostrarInfoEstudiante() {

        if(estudianteActualNombre == null|| estudianteActualNombre.equals(SIN_ESTUDIANTE)){
                System.out.println("No hay estuaintes registrados");
                return;
            }

            System.out.println("Informacion del estudiante");
            System.out.println("Nombre: " + estudianteActualNombre);
            System.out.printf("Nota numero 1: %.2f\n ", nota1);
            System.out.printf("Nota numero 2: %.2f\n", nota2);
            System.out.printf("Nota numero 3: %.2f\n", nota3);
    }

    public static double calculadoraPromedioEstudiante() {
        
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        return promedio;

    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();

            System.out.print("Opción: ");
            int opcion;
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();                 // limpia el Enter pendiente
            } else {
                sc.nextLine();                 // limpia lo que sea que escribió
                System.out.println("Opción inválida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarInformacionEstudiante(sc);  // pásalo por parámetro
                    break;

                case 2:
                    mostrarInfoEstudiante();
                    break;

                case 3:
                    if (estudianteActualNombre == null || estudianteActualNombre.equals("N/A")) {
                        System.out.println("No hay estudiante registrado.");
                    } else {
                        double promedio = calculadoraPromedioEstudiante();
                        System.out.printf("Promedio del estudiante: %.2f%n", promedio);
                    }
                    break;

                case 0:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();   // <-- cierra el Scanner al salir del bucle
    }
       
    }

