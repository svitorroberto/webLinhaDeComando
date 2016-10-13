package main.dao;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;

import main.model.Cargo;

public class CargoDao {
	public static final RethinkDB r = RethinkDB.r;
	public void inserir(Cargo c) {
			Connection conn = r.connection().hostname("localhost").port(28015).connect();
			r.table("cargo").insert(
					r.array(
					
							r.hashMap("cargo_descricao", c.getCargo_descricao()),
							r.hashMap("cargo_nivel", c.getCargo_nivel())	     
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
