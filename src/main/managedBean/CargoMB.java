package main.managedBean;

import javax.faces.bean.ManagedBean;

import main.dao.CargoDao;
import main.model.Cargo;

@ManagedBean(name="cargo")
public class CargoMB {

	public Cargo c;	
	
	public CargoMB(){
	}
	
	public String CadastraCargoMB(){

		c = new Cargo();	
		new CargoDao().inserir(c);
		return "Cadastrou";
	}
}
