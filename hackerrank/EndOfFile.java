package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<String> texto = new ArrayList<>();
        int teste = 1, linhas = 0;
        
        while(teste==1){
            texto.add(sc.nextLine());
            linhas += 1;
            System.out.println("Digite 1 para adicionar uma linha, e 0 para sair");
            teste = sc.nextInt();
            sc.nextLine();
        }
        
        for(int i=0; i<linhas; i++){
            System.out.println(i+1+" "+ texto.get(i));
        }
        sc.close();
    }
}
