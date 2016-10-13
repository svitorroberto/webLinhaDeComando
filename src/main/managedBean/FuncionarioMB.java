package main.managedBean;

import javax.faces.bean.ManagedBean;

import main.dao.FuncionarioDao;
import main.model.Funcionario;

@ManagedBean(name="funcionario")
public class FuncionarioMB {

	public Funcionario f;
	
	public FuncionarioMB(){
		
	}
	public String cadastraFuncionario(){
		f = new Funcionario();
		new FuncionarioDao().inserir(f);
		return "cadastrou funcionario";
	}
}
