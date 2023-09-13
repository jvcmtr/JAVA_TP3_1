public class Palavra {

    public static int getNumeroDeVogais(String palavra){
        int i = 0;
        for (char c : palavra.toUpperCase().toCharArray()) {
            if (c == 'A'||
                c == 'E'||
                c == 'I'||
                c == 'O'||
                c == 'U'){
                i++;
            }
        }

        return i;
    }
}
