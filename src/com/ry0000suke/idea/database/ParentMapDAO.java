package com.ry0000suke.idea.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;

public class ParentMapDAO {
	private final SQLiteDatabase db;
	
	public ParentMapDAO(SQLiteDatabase db) {
		this.db = db;
	}

	public long insertParentMap(String text1, String text2, String text3, String text4, 
			String text5, String text6, String text7, String text8, String text9) {
		ContentValues inititalValue = new ContentValues();
		//inititalValue.put(ParentMapScheme.PARENT_ID, _id);
		inititalValue.put(ParentMapScheme.TEXT1, text1);
		inititalValue.put(ParentMapScheme.TEXT2, text2);
		inititalValue.put(ParentMapScheme.TEXT3, text3);
		inititalValue.put(ParentMapScheme.TEXT4, text4);
		inititalValue.put(ParentMapScheme.TEXT5, text5);
		inititalValue.put(ParentMapScheme.TEXT6, text6);
		inititalValue.put(ParentMapScheme.TEXT7, text7);
		inititalValue.put(ParentMapScheme.TEXT8, text8);
		inititalValue.put(ParentMapScheme.TEXT9, text9);

		return db.insert(ParentMapScheme.TABLE_NAME, null, inititalValue);
	}

	public long updateParentMap(int parent_id, String text1, String text2, String text3, String text4, 
			String text5, String text6, String text7, String text8, String text9) {
		ContentValues inititalValue = new ContentValues();
		//inititalValue.put(ParentMapScheme.PARENT_ID, _id);
		inititalValue.put(ParentMapScheme.TEXT1, text1);
		inititalValue.put(ParentMapScheme.TEXT2, text2);
		inititalValue.put(ParentMapScheme.TEXT3, text3);
		inititalValue.put(ParentMapScheme.TEXT4, text4);
		inititalValue.put(ParentMapScheme.TEXT5, text5);
		inititalValue.put(ParentMapScheme.TEXT6, text6);
		inititalValue.put(ParentMapScheme.TEXT7, text7);
		inititalValue.put(ParentMapScheme.TEXT8, text8);
		inititalValue.put(ParentMapScheme.TEXT9, text9);

		return db.update(ParentMapScheme.TABLE_NAME, inititalValue, ParentMapScheme.PARENT_ID + " = " + parent_id, null);
	}

	public Cursor getAllList() {
		String sql = "SELECT * FROM parent_map";
		Cursor mcursor = db.rawQuery(sql, null);
		return mcursor;
	}

	public Cursor getNewRecord() {
		String sql = "SELECT * FROM parent_map ORDER BY parent_id DESC LIMIT 1";
		Cursor mcursor = db.rawQuery(sql, null);
		return mcursor;
	}

	public Cursor getByParentId(int parent_id) {
		String sql = "SELECT * FROM parent_map WHERE parent_id = " + parent_id;
		Cursor mcursor = db.rawQuery(sql, null);
		return mcursor;
	}

	public boolean deleteByParentId(int parent_id) {
		return db.delete(ParentMapScheme.TABLE_NAME, ParentMapScheme.PARENT_ID + " = " + parent_id, null) > 0;
	}
}
