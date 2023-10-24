import java.util.LinkedList;
import java.util.Scanner;
public class Seventh7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer>ll=new LinkedList<>();
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }else{
            ll.add(value);
            }
        }
        int ind= sc.nextInt();
        int res=ll.get((ll.size()-1)-ind); // linked list size - index to get the element at kth index
        System.out.print(ll.get(res));
    }
}


// kth element