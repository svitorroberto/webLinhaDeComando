package main.resources;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;

public class Teste {
	
	public static final RethinkDB r = RethinkDB.r;
	
	public static void main(String[] args) {
		Connection conn = r.connection().hostname("localhost").port(28015).connect();
		
		r.db("test").tableCreate("departamento").run(conn);
		r.db("test").tableCreate("cargo").run(conn);
		r.db("test").tableCreate("funcionario").run(conn);
		
//		Cursor cursor = r.table("tv_shows").run(conn);
//		for (Object doc : cursor) {
//		    System.out.println(doc);
//		}
//		r.table("tv_shows").insert(r.hashMap("name", "Two and a half man")).run(conn);
//		r.table("tv_shows").insert(r.hashMap("name", "Supernatural")).run(conn);
//		r.table("tv_shows").insert(r.hashMap("name", "Tv Globinho")).run(conn);
	}
}
