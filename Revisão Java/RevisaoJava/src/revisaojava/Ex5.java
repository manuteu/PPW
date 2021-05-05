
package revisaojava;

public class Ex5 {
    public static void main(String[] args) {      
        //Variaveis
        int n1 = 1, n2 = 0;
        
        //Processamento
        for(int i = 0; i < 10; i++){
            n1 += n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }
        System.out.println(n2);
        System.out.println(n1);
    }    
}
    

