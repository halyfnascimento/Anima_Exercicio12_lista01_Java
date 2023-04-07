import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double altura;
        double pesoIdeal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        altura = teclado.nextDouble();
        teclado.close();
        pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal + " Quilogramas");
    }
}