import java.util.Scanner;

public class inc_decrement {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite sua idade:");
        int Idade = entrada.nextInt();
        System.out.println("Digite um ano futuro:");
        int ano = entrada.nextInt();

        //diferença entre o ano atual e o ano futuro

        int aux = ano - 2022;
        int idadeFutura = aux + Idade;

        System.out.println("Minha idade em " + ano + " é " + idadeFutura);


        
    }
    
}
