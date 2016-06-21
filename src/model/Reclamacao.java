/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author renan
 */
public class Reclamacao {
    
    private int id;
    private String reclamacao;
    private Date dataAbetura;
    private Date dataEncerramento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public Date getDataAbetura() {
        return dataAbetura;
    }

    public void setDataAbetura(Date dataAbetura) {
        this.dataAbetura = dataAbetura;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }
 
}
