import java.util.Scanner;

public class ex_6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Temperatura em graus celsius: ");
        double graus = entrada.nextDouble();

        double imc = graus*(9.0/5.0) + 32.0;
        System.out.println("A conversão em Fahrenheit é: " + imc);

    }
}
