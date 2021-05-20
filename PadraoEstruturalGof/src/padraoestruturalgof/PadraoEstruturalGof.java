/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoestruturalgof;

import facade.AgenciaFacade;
import facade.CiaAerea;
import facade.Cliente;
import facade.Hotel;

/**
 *
 * @author david
 */
public class PadraoEstruturalGof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        exemploFacade();
    }

    private static void exemploFacade() {
        Cliente cliente = new Cliente("Matheus Baptista ", "Rodrigues ", 18);
        Hotel hotel = new Hotel(" Bizera - GO ", 550.00);
        CiaAerea cia = new CiaAerea("LATAM");

        AgenciaFacade agencia = new AgenciaFacade(hotel, cia);
        agencia.registrarViagem(cliente);
    }

}
