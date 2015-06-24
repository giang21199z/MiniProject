package com.friendlist.model;

import java.util.ArrayList;

import com.friendlist.controller.InitProject;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Friend {
	String name;
	String phone;
	String avatar;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, String phone, String avatar) {
		super();
		this.name = name;
		this.phone = phone;
		this.avatar = avatar;
	}

	public ArrayList<Friend> getAllFriend() {
		ArrayList<Friend> arrFriend = new ArrayList<Friend>();
		InitProject initProject = new InitProject();
		SQLiteDatabase sqldb = initProject.getSqldb();
		Cursor cursor = sqldb.query("tblfriendlist", null, null, null, null,
				null, null, null);
		cursor.moveToFirst();
		while (cursor.isAfterLast() == false) {
			String name = cursor.getString(1);
			String phone = cursor.getString(2);
			String avatar = cursor.getString(3);
			arrFriend.add(new Friend(name, phone, avatar));
			cursor.moveToNext();
		}
		cursor.close();
		return arrFriend;
	}

	public void insertFriendToDB(Friend friend) {
		ContentValues value = new ContentValues();
		value.put("name", friend.getName());
		value.put("phone", friend.getPhone());
		value.put("avatar", friend.getAvatar());
	}

}
