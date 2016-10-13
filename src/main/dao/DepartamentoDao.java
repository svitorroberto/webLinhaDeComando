package main.dao;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;

import main.model.Departamento;

public class DepartamentoDao {
	public static final RethinkDB r = RethinkDB.r;
	public void inserir(Departamento d) {
		Connection conn = r.connection().hostname("localhost").port(28015).connect();
		r.table("departamento").insert(
				r.array(
				
						r.hashMap("depto_descricao", d.getDepto_descricao()),
						r.hashMap("depto_ramal", d.getDepto_ramal())	     
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
