package com.fkysoft;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        
//        //Group 1
//        int group1 = Menu.FIRST;
//        MenuItem item1 = menu.add(group1, 1, 1, "menu 1.1");
//        item1.setIcon(R.drawable.ic_launcher);
//        menu.add(group1, 2, 2, "menu 1.2");
//        menu.add(group1, 3, 3, "menu 1.3");
//        
//        //Group 2
//        int group2 = Menu.CATEGORY_SECONDARY;
//        menu.add(group2, 4, 4, "menu 2.4");
//        menu.add(group2, 5, 5, "menu 2.5");
        
        return true;
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Toast.makeText(MenuActivity.this, "You selected:" + item.getItemId(), Toast.LENGTH_SHORT).show();
		
		return super.onOptionsItemSelected(item);
	}
    
    
}
