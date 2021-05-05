// Desenvolva o código de uma classe Java com as seguintes características: 
// (1) nome: 'Carro'; 
// (2) atributos que indiquem: cor, modelo, velocidade atual, velocidade máxima, 
// ano de fabricação, se o carro está ligado/desligado; 
// (3) métodos: ligar carro, desligar carro, aumentar velocidade, diminuir velocidade; 
// informa a marcha em que o carro está 
// (se a velocidade é 0: ponto morto, 
// se a velocidade está entre 1 e 20: marcha 1, 
// velocidade entre 21 e 40: marcha 2, 
// velocidade entre 41 e 60: marcha 3, 
// velocidade > 61: marcha 4


package revisaojava;



public class Ex7 {
    
    //Variaveis
        String cor;
        String modelo;
        String marcha;
        double velocidadeAtual;
        double velocidadeMaxima;
        double velocidade = 0;
        int anoFabricacao;
        boolean carroLigado = true;
    
        

    
    public void ligarCarro(){
       
        if(carroLigado){
            System.out.println("O carro já esta ligado"); 
        }else{
            carroLigado = true;
        }
    }
    public void desligarCarro(){
        
        if(!carroLigado){
            System.out.println("O carro está desligado");
        }else{
            carroLigado = false;
        }
    }
    public void aumentarVelocidade(double acelerar){
        
        velocidadeAtual = velocidadeAtual + acelerar;
        marcha(velocidadeAtual);
    }
    public void diminuirVelocidade(double frear){
        
        velocidadeAtual = velocidadeAtual - frear;
        marcha(velocidadeAtual);
    }
    public void marcha(double velocidade){
        
        if (velocidade <= 20 && velocidade >= 1) {
            marcha = "Marcha 1";
        } else if (velocidade <= 40 && velocidade >= 21) {
            marcha = "Marcha 2";
        } else if (velocidade <= 60 && velocidade >= 41) {
            marcha = "Marcha 3";
        } else if (velocidade > 60){
            marcha = "Marcha 4";
        } else if (velocidade == 0){
            marcha = "Ponto Morto";
        }                       
    }
}
