package com.fkysoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {
	InputStream is = null;
	JSONObject jObj = null;
	String json = "";
	
	public JSONObject getJSonObjectFromUrl(String url){
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		
		try {
			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();
			is = httpEntity.getContent();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuilder strBuilder = new StringBuilder();
		String line = null;
		try {
			while((line=br.readLine())!=null){
				strBuilder.append(line+"n");
			}
			is.close();
			json = strBuilder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			jObj = new JSONObject(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return jObj;
	}
}
