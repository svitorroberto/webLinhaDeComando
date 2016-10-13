package main.dao;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;

import main.model.Funcionario;

public class FuncionarioDao {
	
	
	public static final RethinkDB r = RethinkDB.r;
	
	public void inserir(Funcionario f) {
		Connection conn = r.connection().hostname("localhost").port(28015).connect();
		r.table("funcionario").insert(
				r.array(
						
						r.hashMap("func_nome", f.getFunc_nome()),
						r.hashMap("func_cpf", f.getFunc_cpf()),
						r.hashMap("func_dt_nascimento", f.getFunc_dt_nascimento()),
						r.hashMap("func_dpto", f.getFunc_dpto()),
						r.hashMap("func_dt_contratacao", f.getFunc_dt_contratacao()),
						r.hashMap("func_salario", f.getFunc_salario()),
						r.hashMap("func_cargo", f.getFunc_cargo())			     
			 )).run(conn);
		

	}

	public void deletar() {

	}

	public void atualizar() {

	}

	public void listar() {

	}

	public void buscar() {

	}

}
