import java.util.Scanner;

public class RegistroEstudiantes {  //Variables

    static String estudianteActualNombre = "N/A";
    static double nota1 = 0.0;
    static double nota2 = 0.0;
    static double nota3 = 0.0;
    


    public static void mostrarMenu(){  //metodo sin parametros, no nesecitamos devolver nada
        System.out.println("--- Sistema de Registro de Estudiantes ---");
        System.out.println("Registrar datos de un estudiante");
        System.out.println("Mostrar datos del estudiante actual");
        System.out.println("Calcular promedio de notas del estudiante actual");
        System.out.println("Salir");
        System.out.println("Ingrese su opciòn");
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

    public static void mostrarInformacionEstudiante() {
        
    }

    public static void main(String[] args) throws Exception {
        
       
    }
}
