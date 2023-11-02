import java.util.Scanner;
public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N=sc.nextInt();
        int X =sc.nextInt();
        int arr[]=new int[N];
        int brr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< N;i++){
            brr[i]= sc.nextInt();
        }
        int totalcost=0;
        for(int i=0;i<N;i++){
            if(arr[i]>=X){
                totalcost+=brr[i];
            }
        }
        System.out.print(totalcost);

    }
}

// Cost of Groceries
