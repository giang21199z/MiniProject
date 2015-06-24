package com.friendlist.controller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class InitProject {
	SQLiteDatabase sqldb;
	SQLiteOpenHelper sqloh;

	public InitProject() {
		
		sqldb = SQLiteDatabase.openOrCreateDatabase("db_friend_list.sql", null);
	}

	public void doCreatedTable() {
		String sql = "CREATE TABLE tblfriendlist if not exists (";
		sql += "id int PRIMARY KEY AUTOINCREATEMENT";
		sql += "name TEXT NOT NULL";
		sql += "phone TEXT NOT NULL";
		sql += "avatar TEXT DEFAULT='avatar_default.jpg'";
		sqldb.execSQL(sql);
	}

	public SQLiteDatabase getSqldb() {
		return sqldb;
	}

	public void setSqldb(SQLiteDatabase sqldb) {
		this.sqldb = sqldb;
	}
}
