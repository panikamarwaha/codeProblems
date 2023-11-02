import java.util.*;

public class removeDuplicateCharactersStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String s =sc.next();
        String res=" ";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){ // to check if they are different from next character
                res += s.charAt(i); //appends the current character to the resulting string
            }
        }
        res += s.charAt(s.length()-1); //otherwise subtract the char from resulting string
        System.out.print(res);
    }



}
  //  remove duplicate  characters from strings
