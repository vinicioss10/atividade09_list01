import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Fahrenheit,
 transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */

public class App {
    public static void main(String[] args) throws Exception {
        double graus;
        double celsius;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit");
        graus = dig.nextInt();
        celsius = 5 * ((graus - 32) / 9);
        System.out.println("A temperatura em celsius é de " + celsius + " graus");

    }
}
