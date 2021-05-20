package facade;

public class CiaAerea {

    private String nomeCia;

    public CiaAerea(String nomeCia) {
        this.nomeCia = nomeCia;
    }

    public String getNomeCia() {
        return nomeCia;
    }

    public void setNomeCia(String nomeCia) {
        this.nomeCia = nomeCia;
    }

    public void reservaVoo(String nome, String sobrenome) {
        System.out.println("Voo reservado na Cia " + nomeCia);
        System.out.println("Para: " + sobrenome + " " + nome);
    }

}
