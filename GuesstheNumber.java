package atividadeprof;

import java.util.Random;
import java.util.Scanner;

    public class GuesstheNumber {
    public static void main(String[] args) {
        
        
        
        Random random = new Random();
        int numeroAle = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        

        int tentativa;
        int tentativas = 0;

        System.out.println("hello guys, guess the number");
        System.out.println("bem vindo");
        do{
            
            tentativa = scanner.nextInt();

            tentativas++;

            if (tentativa == numeroAle) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas");
            } else if (tentativa < numeroAle){
                System.out.println("tente um numero maior");
            } else {
                System.out.println("tente um numero menor");
            }

        }while (tentativa != numeroAle);

        scanner.close();

            }
        
        }
    
    

