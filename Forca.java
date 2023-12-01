package forca;

public class Forca {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] palavras = {"computador", "senac", "programação", "java", "tecnologia", "estudos"};
    String palavraEscolhida = palavras[(int) (Math.random() * palavras.length)];
    System.out.println("teste: " + palavraEscolhida );
    char[] palavraSecreta = new char[palavraEscolhida.length()];
    booLean[] letrasDescobertas = new booLean[palavraEscolhida.length()];
    int tentativa = 6;

}

    for(int i = 0; i < palavraEscolhida.length(); i++){
        palavraSecreta[i] = '_';

    }
    while(tentativas > 0 ){
        System.out.println("palavra");

    for( int i = 0 ; i < palavraEscolhida.length(); i++){
        if(letrasDescobertas[i]){
            System.out.println(palavraSecreta[i]+"");
        }

    }
    System.out.println("tentativas restantes: " + tentativas);
    System.out.println("Digite uma letra: ");
    char letra = input.nextLine().charAt(0);
    booLean letraEncontradsa = false;
    for(int i = 0; i < palavraEscolhida.length(); i++){
        if(palavraEscolhida.charAt(i) == letra){
            letrasDescobertas[i] = true; 
            letrasEncontradas = true;
        }
    }
 booLean todsaLetrasDescobertas = true;
 for(boolean descobertas ; letrasDescobertas){
    if(!descobertas){
        todsaLetrasDescobertas = false;
        break;
    }
 }
    if(todsaLetrasDescobertas){
        System.out.println("parabens vc vai ser pai" + palavraEscolhida)
    }
    if(letrasEncontradas){
        tentativas ++;
        System.out.println("letras incorreta, tente novamente");
    }
    if(todsaLetrasDescobertas){
        System.out.println("perdeu playboy! A palavra era: " + palavraEscolhida)
    } input.close();
    }
}

