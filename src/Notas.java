import java.util.Scanner;
public class Notas {
    public static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double Nota1;
        double Nota2;
        double Nota3;
        double Promedio;

        System.out.println("Ingrese nota 1");
        Nota1 = entrada.nextDouble();

        System.out.println("Ingrese nota 2");
        Nota2 = entrada.nextDouble();

        System.out.println("Ingrese nota 3");
        Nota3 = entrada.nextDouble();

        Promedio = (Nota1 + Nota2 + Nota3) / 3;

        if (Promedio >=6){
          System.out.println("Aprobado");

        } else {
            System.out.println("Reprobado");
        }

        System.out.println("");
        System.out.println("El Promedio es: " + Promedio);



    }
}
