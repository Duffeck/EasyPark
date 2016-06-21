/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author renan
 */
public class Setor {
    
    private int id;
    private String nome;
    private int maxVagas;
    private int vagasLivres;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxVagas() {
        return maxVagas;
    }

    public void setMaxVagas(int maxVagas) {
        this.maxVagas = maxVagas;
    }

    public int getVagasLivres() {
        return vagasLivres;
    }

    public void setVagasLivres(int vagasLivres) {
        this.vagasLivres = vagasLivres;
    }
}
