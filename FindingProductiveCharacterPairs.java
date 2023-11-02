import java.util.Scanner;

public class FindingProductiveCharacterPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productType = sc.nextLine();
        sc.close();
        String tag="";
        int length=productType.length();
        for(int i=0;i<length;i+=2){
            if(i<length-1 && productType.charAt(i)<productType.charAt(i+1)){
                i++;
            }tag+=productType.charAt(i);
        }
        System.out.print(tag);
    }
}
// Finding Productive Character Pairs
