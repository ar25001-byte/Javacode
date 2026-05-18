import java.util.Scanner;
public class circunferencia {
    public static void main(String[] args){
        Scanner entarda = new Scanner(System.in);

        double area;
        double radio;

        System.out.println("Inserta el radio ");
        radio = entarda.nextDouble();

        area = 3.1416 * radio * radio;

        System.out.println("");
        System.out.println("El area de la circunferencia es: " + area);

    }
}
