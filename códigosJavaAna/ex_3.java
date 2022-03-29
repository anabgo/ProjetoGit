import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("Ano Atual: ");
        int Ano = entrada.nextInt();

        int imc = Ano - idade;
        System.out.println("O ano de nascimento é: " + imc);



    }
    

}
