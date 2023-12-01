public class atividade4 {
    import java.util.Scanner;


public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
       
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");

        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");

        double c = scanner.nextDouble();

        System.out.print("Digite o valor de d: ");

        double d = scanner.nextDouble();

        System.out.print("Digite o valor de e: ");

        double e = scanner.nextDouble();

        double resultado = a * b - c + d / e;

        

    

        System.out.println("Resultado do cálculo: " + resultado);
 
    }
}


        scanner.close();


}
