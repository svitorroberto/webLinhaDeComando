package main.resources;

import javax.faces.bean.ManagedBean;

import main.dao.DepartamentoDao;
import main.model.Departamento;

@ManagedBean(name="departamento")
public class DepartamentoMB {
	
	public Departamento d;
	
	public DepartamentoMB(){
		d = new Departamento();
	}
	public String cadastraDepartamento(){
		new DepartamentoDao().inserir(d);
		return "cadastrou departamento";
	}
	
	
	public Departamento getD() {
		return d;
	}
	public void setD(Departamento d) {
		this.d = d;
	}
	
	
}
