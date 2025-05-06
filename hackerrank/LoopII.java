package hackerrank;
import java.util.*;

public class LoopII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0; j<n; j++){
                int somatudo=0;
                for(int x=0, potenciaDe2=1 ; x<=j ; x++, potenciaDe2 = potenciaDe2*2){
                    somatudo = somatudo + (potenciaDe2 * b);
                }
            
                System.out.print(a+somatudo+" ");
            }
            System.out.println();
        }
        in.close();
    }
}