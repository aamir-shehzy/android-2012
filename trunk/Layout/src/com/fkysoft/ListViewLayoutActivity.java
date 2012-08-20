package com.fkysoft;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.app.ListActivity;

public class ListViewLayoutActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListAdapter adapter = createAdapter();
        setListAdapter(adapter);
    }
 
    /**
     * Creates and returns a list adapter for the current list activity
     * @return
     */
    protected ListAdapter createAdapter()
    {
    	// Create some mock data
    	String[] testValues = new String[] {
    			"Test1",
    			"Test2",
    			"Test3"
    	};
 
    	// Create a simple array adapter (of type string) with the test values
    	ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testValues);
 
    	return adapter;
    }
}
