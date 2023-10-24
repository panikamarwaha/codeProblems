import java.util.LinkedList;
import java.util.Scanner;

public class second2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        LinkedList<String>ll= new LinkedList<>();
        for(int i=0;i<n;i++){
            String element=sc.next();
            ll.add(element);
        }
        String s= sc.next();
        LinkedList<String> ans=new LinkedList<>();
        for(String str:ll){ //This line iterates through each element (strings) in the 'll'LinkedList, and for each element ,it assigns it to variable 'str' for processing.
            if(str.compareTo(s) > 0){ //'str' is lexographically greater than 's' the comparison result will be greater than 0. if it is greater than 0 , it means 'str' is greater than 's' in lexographically order ,so it adds 'str' to 'ans' linked list
                ans.add(str);
            }
        }
        System.out.print(ans);

    }
}
//remove strings based on lexographically comparison