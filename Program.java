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
        System.out.println("\t" + s.toUpperCase(null));
        System.out.println();


        System.out.println("c) O número de vogais da string.  (Criar uma classe utilitária e um método pra isso.)");
        System.out.println("\t" + Palavra.getNumeroDeVogais(s));
        
    }
}