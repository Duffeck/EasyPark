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
public class Pagamento {
    private int id;
    private String tipo;
    private Comprovante comprovante;
    private FaturaMensal fatura;
    private NFE notaFiscal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Comprovante getComprovante() {
        return comprovante;
    }

    public void setComprovante(Comprovante comprovante) {
        this.comprovante = comprovante;
    }

    public FaturaMensal getFatura() {
        return fatura;
    }

    public void setFatura(FaturaMensal fatura) {
        this.fatura = fatura;
    }

    public NFE getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NFE notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
