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
 * @author renan   
 */
public class Comprovante {
    
    private int id;
    private Date horarioEntrada;
    private Date horarioSaida;
    private Veiculo veiculo;
    private List lavagens;
    private List reclamacoes;
    private Setor setor;
    private Funcionario funcEntrada;
    private Funcionario funcSaida;
    private Pagamento pagamento;
    
    public Comprovante(){
        lavagens = new ArrayList<Lavagem>();
        reclamacoes = new ArrayList<Reclamacao>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(Date horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List getLavagens() {
        return lavagens;
    }

    public void setLavagens(List lavagens) {
        this.lavagens = lavagens;
    }

    public List getReclamacoes() {
        return reclamacoes;
    }

    public void setReclamacoes(List reclamacoes) {
        this.reclamacoes = reclamacoes;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Funcionario getFuncEntrada() {
        return funcEntrada;
    }

    public void setFuncEntrada(Funcionario funcEntrada) {
        this.funcEntrada = funcEntrada;
    }

    public Funcionario getFuncSaida() {
        return funcSaida;
    }

    public void setFuncSaida(Funcionario funcSaida) {
        this.funcSaida = funcSaida;
    }
    
    public Pagamento getPagamento() {
        return pagamento;
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
