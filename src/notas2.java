import java.util.Scanner;
public class notas2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.println("Ingrese nota 1");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese nota 2");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese nota 3");
        nota3 = entrada.nextDouble();

        if ((nota1 >= 0 && nota1 <= 10) &&
                (nota2 >= 0 && nota2 <= 10) &&
                (nota3 >= 0 && nota3 <= 10)) {

            promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 6) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");

            }

            System.out.println("");
            System.out.println("El promedio es: " + promedio);


        }else{
            System.out.println("Error el numero no esta entre 0 y 10");
        }
   }
}
