public class Ejercicio5{
    public static void main(String [] args){
        /* Creo variables para guardar los colores y ponerselo a las asignaturas */
        String rojo ="\033[31m";
        String verde="\033[32m";
        String amarillo="\033[33m";
        String azul="\033[34m";
        String morado="\033[35m";
        String cian="\033[36m";

        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        System.out.printf("%s\n",azul+"=========================================================================");
        System.out.printf("%-20s %-20s %-20s %-15s %-15s\n", rojo+"PROG", verde+"SISIN", amarillo+"ENTD", "PROG", azul+"FOL");
        System.out.printf("%-15s %-20s %-20s %-15s %-15s\n", "PROG", verde+"SISIN", amarillo+"ENTD", "PROG", azul+"FOL");
        System.out.printf("%-20s %-20s %-15s %-20s %-17s\n", cian+"LENM", verde+"SISIN", "PROG", cian+"LENM", azul+"FOL");
        System.out.printf("%s\n", "==================================RECREO=================================");
        System.out.printf("%-20s %-15s %-15s %-20s %-17s\n", cian+"LENM", "PROG", "PROG", cian+"LENM", verde+"SISIN");
        System.out.printf("%-20s %-15s %-15s %-15s %-17s\n", morado+"BBDD", "PROG", "BBDD", "BBDD", "SISIN");
        System.out.printf("%-20s %-20s %-20s %-20s %-17s\n", morado+"BBDD", amarillo+"ENTD", morado+"BBDD", morado+"BBDD", verde+"SISIN");
    }
}