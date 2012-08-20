package com.fkysoft;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {

	static final String jsonListData = "";
	private static List<Employees> lstData;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Object -> json
		//Employees emp = new Employees(1, "Thang", "123456789");
		//Gson gson = new Gson();
		//String flat = gson.toJson(emp);
		//System.out.println(flat);
		
		//json -> Object
		//Gson gson = new Gson();
    	//Type type = new TypeToken<List<Employees>>(){}.getType();
    	//lstData = gson.fromJson(jsonListData, type);
    	//System.out.println(lstData.size());
	}

}
