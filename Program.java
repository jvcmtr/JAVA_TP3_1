import java.util.Scanner ;

public class Program{
    public static void main (String[] args){
        String s = "";

        if (args.length == 0){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite uma string a ser avaliada : ");
            s = in.nextLine();
            in.close();
        }
        else{
            for (String string : args) {
                s += string + " ";
            }
            s = s.trim();
        }

        System.out.println("\n\n\n____________________________________________________________\n AVALIANDO: " + s + "\n");

        System.out.println("a) O número de caracteres da string.");
        System.out.println("\t" + s.replace(" ", "").length() + " (sem contar espaco)" );
        System.out.println("\t" + s.length() + " (contando o espaco)");
        System.out.println();
        
        System.out.println("b) A string com todas suas letras em maiúsculo. ");
        System.out.println("\t" + s.toUpperCase());
        System.out.println();


        System.out.println("c) O número de vogais da string.  (Criar uma classe utilitária e um método pra isso.)");
        System.out.println("\t" + Palavra.getNumeroDeVogais(s));
        System.out.println();

        
        System.out.println("d) Se a string digitada começa com \"INF\" (ignorando maiúsculas/minúsculas).");
        System.out.println("\t" + (s.toUpperCase().indexOf("INF")==0));
        System.out.println();

        System.out.println("e) Se a string digitada termina com \"NET\" (ignorando maiúsculas/minúsculas). ");
        System.out.println("\t" + (s.toUpperCase().indexOf("NET") == Math.max( (s.length()-3) , 0) ));
        System.out.println();

        // Não sei se compreendi o enunciado corretamente
        System.out.println("f) O número de dígitos (0 a 9) da string. (Utilizar a classe utilitaria e criar um método para isso)");
        System.out.println("\t" + Palavra.getAllDigitos(s).length());
        System.out.println();

        System.out.println("g) Os 2 primeiros digitos da String. ");
        System.out.println("\t[" + Palavra.getDigitoAt(s, 0) + "], [" + Palavra.getDigitoAt(s, 1) + "]");
        System.out.println();

        System.out.println("h) Se a string é um palíndromo ou não. (Utilizar a classe utilitaria e criar um método para isso) ");
        System.out.println("\t" + Palavra.isPalindrome(s));
        System.out.println();

    }
}