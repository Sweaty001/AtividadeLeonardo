public class Atividade5 {

    import java.util.Scanner;

    public class ATIVIDADE {
 
    public static void main(String[] args) {
                 
            
    Scanner scanner = new Scanner(System.in);
    

            System.out.print("Digite um número: ");
 
    int numero = scanner.nextInt();
  
    
            if (numero < 10) {
                System.out.println("O número é menor que 10.");                
            } 
    } else if (numero > 10) {
                System.out.println("O número é maior que 10.");
    } else if (numero == 10) {
                System.out.println( "O número é IGUAL a 10.");
    } else if (numero <= 10) {
                System.out.println( "O número é  MENOR OU IGUAL a 10.");
    } else if (numero >= 10) {
                System.out.println( "O número é  MAIOR OU IGUAL a 10.");
    } else {
    } else if (numero != 10) {
                System.out.println( "O número é DIFERENTE a 10.");
    } else {
    } else if (numero = 10) {
                System.out.println( "O número é 10.");
    } else {
            System.out.println("Essa condição não está coberta.");
           }

            }

        }
      
            scanner.close();

