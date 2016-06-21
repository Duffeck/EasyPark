/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas.duffeck
 */
public class Mensalista extends Pessoa{
    
    private Date dataPgto;
    private List<Veiculo> veiculos;
    private List<FaturaMensal> faturas;
    
    public Mensalista(){
        super();
        veiculos = new ArrayList<Veiculo>(0);
        faturas = new ArrayList<FaturaMensal>(0);
    }
    
    public Date getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Date dataPgto) {
        this.dataPgto = dataPgto;
    }
    
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
