import java.util.Scanner;

public class fourteen14 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int []nrr=new int[n];
        int []mrr=new int[m];
        int []krr=new int[k];
        int a=0;
        int b=0;
        int c=0;

        for(int i=0;i<n;i++){
            nrr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            mrr[i]= sc.nextInt();
        }
        for(int i=0;i<k;i++){
            krr[i]= sc.nextInt();
        }
        int trgt= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int l=0;l<k;l++){
                    if ( nrr[i] + mrr[i] + krr[i] == trgt) {
                        System.out.print(nrr[i]+" ");
                        System.out.print(mrr[j]+" ");
                        System.out.print(krr[l]);
                        return;

                    }
            }

        }}

    }
}
