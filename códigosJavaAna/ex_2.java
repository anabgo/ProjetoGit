import java.util.Scanner;

public class ex_2 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número1: ");
        int Número1 = entrada.nextInt();

        System.out.print("Número2: ");
        int Número2 = entrada.nextInt();

        System.out.print("Número3: ");
        int Número3 = entrada.nextInt();

        int imc = Número1 + Número2 + Número3;
        System.out.println("A soma dos três termos é igual à: " + imc);



    }
}
