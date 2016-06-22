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
public class Funcionario extends Pessoa{
    
    private float Salario, horasSemanais;
    private String turno, cargo;
    private List<Comprovante> comprovantes;
    
    public Funcionario(){
        comprovantes = new ArrayList(0);
    }
   
    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(float horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public List<Comprovante> getComprovantes() {
        return comprovantes;
    }

    public void setComprovantes(List<Comprovante> comprovantes) {
        this.comprovantes = comprovantes;
    }
}
