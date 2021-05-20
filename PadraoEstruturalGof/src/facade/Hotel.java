package facade;

public class Hotel {

    private String nome;
    private double valorDiaria;

    public Hotel(String nome, double valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void registraReserva(String nomeCliente, String sobrenomeCliente) {
        System.out.println("o Hotel" + nome + "informa que a reserva para");
        System.out.println(nomeCliente + "" + sobrenomeCliente + "foi realizada com sucesso...");
    }

}
