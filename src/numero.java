import java.util.Scanner;
public class numero {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese el numero");
        numero = entrada.nextInt();

        if(numero > 0) {
            System.out.println("El numero es positivo");

        } else if(numero < 0){
            System.out.println("El numero es negativo");

        }else {
            System.out.println("El numero es neutro");
        }

        System.out.println("");



    }
}
