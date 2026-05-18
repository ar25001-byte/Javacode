import java.util.Scanner;
public class Descuento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double Compra;
        double descuento;
        double total;

        System.out.println("Ingrese Compra");
        Compra = entrada.nextDouble();

        total = Compra - (Compra * 0.10);

        System.out.println("");
        System.out.println("Total a pagar es:" + total);

    }
}
