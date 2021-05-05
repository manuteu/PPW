
package revisaojava;

public class Ex4 {
    public static void main(String[] args) {
        //Variáveis
        int resultado = 1;
        int fatorial = 10;
        
        //Processamento
        for (int i = 1; i <= fatorial; i++) {
		resultado*=i;
		System.out.println("O fatorial de " + i + " é: " + resultado);

	}
    }
}
