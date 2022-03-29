import java.util.Scanner;

public class ex_4{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Velocidade em Km/h: ");
        int km = entrada.nextInt();

        double imc = km/36;
        System.out.println("A velocidade em metros é: " + imc);

    }
    


}
    