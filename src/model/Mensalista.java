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
    
    public Mensalista(){
        super();
        veiculos = new ArrayList<Veiculo>(0);
    }
    
    public Date getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Date dataPgto) {
        this.dataPgto = dataPgto;
    }
    
    
}
