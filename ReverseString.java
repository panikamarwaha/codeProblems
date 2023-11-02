import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        solve(s);
    }
    public static void solve(String s){
        int low=0;
        int high=s.length()-1;
        char[] ch=s.toCharArray();
        while(low<high){

            if(ch[low]== ' '){
                low++;
            }else if( ch[high]== ' '){
                high--;
            }else{
                char temp= ch[low];
                ch[low]=ch[high];
                ch[high]= temp;
                low++;
                high--;
            }
        }
        for(Character it: ch){
        System.out.print(it);
        }
    }

}
//  reverse a string with preserved space positions.
