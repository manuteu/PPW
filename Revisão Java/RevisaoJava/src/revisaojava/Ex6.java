
package revisaojava;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Variaveis
        int n = 0;
        
        //Entrada
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        n = input.nextInt();
        
        input.close();
        
        //Processamento
        
        while (n != 1){
        
          if (n % 2 == 0) {
            n /= 2;
        } else {
            n = (3 * n) + 1;
        }
          System.out.println(n);
        }
    }
}
