import java.util.Scanner;

public class Sixth6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch ==' '){
                continue;
            }
            else{
                ans+=ch;
            }
        }
        char ch=ans.charAt(0);
        System.out.print(Character.toUpperCase(ch));
        for(int i=1;i<ans.length();i++){
            char ch2=ans.charAt(i);
            System.out.print(ch2);
        }
    }
}
//Message Processing
