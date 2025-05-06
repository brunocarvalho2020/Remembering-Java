package hackerrank;

import java.util.Scanner;

public class StaticInitializer {
    static int B, H;    
    static Boolean flag = true;
    static{
        Scanner scan = new Scanner(System.in);
        
        B = scan.nextInt();
        H = scan.nextInt();
        
        if(B <=0 || H <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
        scan.close();
    }
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
