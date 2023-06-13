/*Computacion 2do "A"
* Integrantes: Jostin Jiménez
*              Jhostin Rojas
*              Geovanny Romero
*              Juan Alverca
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posicion de la serie: ");
        int posicion = scanner.nextInt();
        for (int i = 0; i <= posicion; i++) {
            System.out.println("Fibonacci de " + i + " es " + fibonacci.getFibonacci(i));
        }
    }
}
