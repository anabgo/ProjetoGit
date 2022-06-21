import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        

        Scanner entrada  = new Scanner(System.in);


        System.out.print("digite o número inicial: ");

        int numeroInicial  = entrada.nextInt();

        System.out.print("Digite o número final: ");
        int numeroFinal = entrada.nextInt();


        int numeroAtual = numeroInicial; 

        while (numeroAtual <= numeroFinal) { 
            System.out.print(numeroAtual);
            //numeroAtual = numeroAtual + 1 
            numeroAtual++;
            
        }

        entrada.close();
        
    }
    
}
