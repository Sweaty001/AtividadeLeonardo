public class atividade3 {
    import java.util.Scanner;


    
   
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int v = 3;

        System.out.print("Digite um número: ");
        
 int numeroDigitado = scanner.nextInt();

if (numeroDigitado >= 0 && numeroDigitado <= 100) {

            System.out.println("Decréscimo realizado. Novo valor de v: " + v);

        } else {
 
            System.out.println("Número não considerado aleatório. Valor de v permanece inalterado: " + v);
        }
        }

    }

        scanner.close();
  

