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
public class Funcionario extends Pessoa{
    
    private float Salario, horasSemanais;
    private String turno, cargo;
   
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
    
    
}
