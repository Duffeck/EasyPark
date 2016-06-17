/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas.duffeck
 */
public class Veiculo {
    
    private String placa, modelo, cor;
    private Mensalista dono;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Mensalista getDono() {
        return dono;
    }

    public void setDono(Mensalista dono) {
        this.dono = dono;
    }
    
    
}
