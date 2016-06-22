/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas.duffeck
 */
public class Veiculo {
    
    private int id;
    private String placa, modelo, cor;
    private Mensalista dono;
    private TipoVeiculo tipo;
    private List comprovantes;
    
    public Veiculo(){
        comprovantes = new ArrayList<Comprovante>(0);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    
    public List getComprovantes() {
        return comprovantes;
    }

    public void setComprovantes(List comprovantes) {
        this.comprovantes = comprovantes;
    }
}
