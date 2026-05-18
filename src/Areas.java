import java.util.Scanner;
public class Areas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("base");
        base = entrada.nextDouble();

        System.out.println("altura");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("");
        System.out.println("El area del rectagungulo es:" + area );
    }
}


