import java.util.Scanner;
public class AliceandBob {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            brr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]*2<brr[i] || brr[i]*2<arr[i]){ // this condition checks if either of the two nos is more than double the value of other .
                continue;
            }  // if the condition is not met then cnt ++;
            else{
                cnt++;
            }
        }
        System.out.print(cnt);


    }
}
//      Alice and Bob
