package com.omernaci.actionbarv1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case R.id.Omer:
			
			Toast.makeText(getApplicationContext(), "Omer", Toast.LENGTH_SHORT).show();
			
			break;

		case R.id.Naci:
			
			Toast.makeText(getApplicationContext(), "Naci", Toast.LENGTH_SHORT).show();
			
			break;
			
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
