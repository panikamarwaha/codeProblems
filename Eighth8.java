import java.util.ArrayList;
import java.util.Scanner;
public class Eighth8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s=sc.nextLine();
        String trgt=sc.next();
        ArrayList<Integer> occ=new ArrayList<>();
        int index=-1;
        while((index = s.indexOf(trgt,index+1)) > -1){
            occ.add(index);
        }
        if(occ.size()>0){
                System.out.println(occ);
        }
        else if(occ.size()==0){
                System.out.print("-1");
        }

    }
}
// recurrsive test seaRCH program