/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Setor;
import util.DBConnect;

/**
 *
 * @author lucas.duffeck
 */
public class SetorDAO {
    private DBConnect db;
	
	public SetorDAO(){
		this.db = new DBConnect();
	}
	
	public void inserir(Setor setor){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void alterar(Setor c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void deletar(Setor c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public List<Setor> listar(){
		db.openConnect();
		
		List result = (List) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
	
	public Setor findById(Integer id){
		db.openConnect();
		
		Setor result = (Setor) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}

	public Setor findByNome(String name) {
		db.openConnect();
		
		Setor result = (Setor) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
}
