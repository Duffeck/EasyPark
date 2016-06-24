/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SetorDAO;
import exception.EasyParkException;
import java.util.List;
import model.Setor;

/**
 *
 * @author lucas.duffeck
 */
public class SetorController {
    private SetorDAO dao;
	
	public SetorController(){
		this.dao = new SetorDAO();
	}
	
	public void inserirSetor(Setor setor)throws EasyParkException{
		Setor aux = dao.findById(setor.getId());
		
		if(aux == null)
			dao.inserir(setor);
		else new EasyParkException("Customer not foud");
	}
	
	public void alterarSetor(Setor setor)throws EasyParkException{
		Setor aux = dao.findById(setor.getId());
		
		if(aux != null){
			aux.setNome(setor.getNome());
			dao.alterar(aux);
		}else new EasyParkException("Customer not foud");
	}
	
	public void deletarSetor(Setor setor)throws EasyParkException{
		Setor aux = dao.findById(setor.getId());
		
		if(aux != null)		
			dao.deletar(setor);
		else new EasyParkException("It was not possible to remove");
	}
	
	public List<Setor> listarSetor(){
		return dao.listar();
	}
	
	public Setor findSetorById(Integer id){
		return dao.findById(id);
	}
	
	public Setor findSetorByNome(String name){
		return dao.findByNome(name);
	}
        
        public boolean validarSetor(Setor setor){
            if(0 <= setor.getId())
                return false;
            if(setor.getNome().isEmpty())
                return false;
            if(0 < setor.getMaxVagas())
                return false;
            return true;
        }
}
