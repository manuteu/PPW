package revisaojava;

import java.io.Console;
import java.util.Scanner;

public class testeCarro {

    public static void main(String[] args) {
        Ex7 ex = new Ex7();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        ex.aumentarVelocidade(input.nextDouble());
        
        ex.ligarCarro();
        ex.desligarCarro();
        
        
        System.out.println("O carro esta na velocidade " + ex.velocidadeAtual + " e na " + ex.marcha);
    }
}
