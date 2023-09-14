import java.util.ArrayList;

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

    public static String getAllDigitos(String palavra){
        String list = "";
        for (char c : palavra.toUpperCase().toCharArray()) {
            String s = "" + c;
            try{
                Integer i = Integer.parseInt(s);
                list += i;
            } catch(NumberFormatException  e){
                continue;
            }
        }
        return list;
    }

    public static String getDigitoAt(String palavra, int index){
        String s = " ";
        try{
            s = ""+Palavra.getAllDigitos(palavra).charAt(index);
        } catch (IndexOutOfBoundsException e){}
        return s;
    }

    public static boolean isPalindrome(String palavra){
        int length = palavra.length();
        for (int i = 0; i < length/2; i++) {
            if( palavra.charAt(i) != palavra.charAt(length-(i+1)) ){
                return false;
            }
        }
        return true;
    }

}
