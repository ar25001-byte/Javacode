import java.util.Scanner;
public class hipotenusa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double hipotenusa;
        double cateto1;
        double cateto2;

        System.out.println("Ingrese cateto1");
        cateto1 = entrada.nextDouble();

        System.out.println("Ingrese el cateto2");
        cateto2 = entrada.nextDouble();

        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.println("");
        System.out.println("La hipotenusa del triangulo es : " + hipotenusa);
    }
}
