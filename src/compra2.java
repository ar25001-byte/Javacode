import java.util.Scanner;
public class compra2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double compra;
        double descueno;
        double total;

        System.out.println("Ingrese la compra");
        compra = entrada.nextDouble();

        if (compra < 100) {
            System.out.println("No hay descuento");
            total = compra;

        } else if (compra >= 100 && compra <= 300) {
            System.out.println("Se aplicara descuento del 10%");
            total = compra - (compra * 0.10);

        } else {
            System.out.println("Se aplicara descuento del 15%");
            total = compra - (compra * 0.15);
        }

        System.out.println("");
        System.out.println("Total de la compra es: " + total);

    }
}
