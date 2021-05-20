package facade;

public class AgenciaFacade {

    private Hotel hotel;
    private CiaAerea ciaaerea;

    public AgenciaFacade(Hotel hotel, CiaAerea ciaaerea) {
        this.hotel = hotel;
        this.ciaaerea = ciaaerea;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public CiaAerea getCiaaerea() {
        return ciaaerea;
    }

    public void setCiaaerea(CiaAerea ciaaerea) {
        this.ciaaerea = ciaaerea;
    }

    public void registrarViagem(Cliente cliente) {
        this.hotel.registraReserva(cliente.getNome(), cliente.getSobrenome());
        this.ciaaerea.reservaVoo(cliente.getNome(), cliente.getSobrenome());
    }
}
