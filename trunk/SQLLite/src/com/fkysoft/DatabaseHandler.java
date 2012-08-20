package com.fkysoft;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper{
	
	static final String DATABASE_NAME = "EmployeesManager";
	static final String TABLE_NAME = "Employees";
	
	static final String ID = "id";
	static final String NAME = "name";
	static final String PHONE = "phone";

	public DatabaseHandler(Context context, String name, CursorFactory factory,int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String strCreate = "CREATE TABLE " + TABLE_NAME + "( "
							+ ID +" INTEGER PRIMARY KEY,  "
							+ NAME +" VARCHAR,  "
							+ PHONE +" VARCHAR  "
							+ ")";
		db.execSQL(strCreate);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
	}
	
	
	
	//other method
	public void insertRecord(Employees employes){
		SQLiteDatabase db = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(NAME, employes.getName());
		values.put(PHONE, employes.getPhone());
		
		db.insert(TABLE_NAME, null, values );
		db.close();
	}
	
	public Employees getEmpByID(int id){
		Employees emp = new Employees();
		
		return emp;
	}
	
	public List<Employees> getAllEmp(){
		List<Employees> lstEmp = new ArrayList<Employees>();
		
		return lstEmp;
	}
	
	public void updateRecord(Employees emp){
		
	}
	
	public void deleteRecord(Employees emp){
		SQLiteDatabase db = this.getWritableDatabase();
		
		db.delete(TABLE_NAME, "id = ?", new String[]{emp.getId()+""});
		db.close();
	}
	
	
}
