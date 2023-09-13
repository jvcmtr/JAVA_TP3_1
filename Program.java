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

        System.out.println("a) O número de caracteres da string.");
        System.out.println("\t" + s.replace(" ", "").length() + " (sem contar espaco)" );
        System.out.println("\t" + s.length() + " (contando o espaco)");   
    }
}