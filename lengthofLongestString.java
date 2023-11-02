import java.util.Scanner;

public class lengthofLongestString  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int cnt=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!=' '){
                cnt++;
                max=Math.max(max,cnt); //to keep the track of current sequence length and updates max with max count
            }
            else{
                cnt=0; //reset it to start the new sequence
            }

        }
        System.out.print(max);
    }
}
//     length of the longest string
