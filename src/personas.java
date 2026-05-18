import java.util.Scanner;
public class personas {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        double mayor;
        double num1;
        double num2;
        double num3;

        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer numero");
        num3 = entrada.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("");
        System.out.println("El numero mayor es: " + mayor);
    }
}
