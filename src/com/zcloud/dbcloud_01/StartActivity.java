package com.zcloud.dbcloud_01;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StartActivity extends Activity {
	
	private Thread runThread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}) ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		
		switch (item.getItemId())
		{
			case R.id.exitItem :
					{	
						runThread.start();
						System.exit(0);
					}
			case R.id.trun : 
			{
				BluetoothAdapter blue =  BluetoothAdapter.getDefaultAdapter() ;
				if (blue.isEnabled())
				{
					blue.disable();
				}
				else
				{
					blue.enable();
				}
			}
		
		}
		
		return super.onOptionsItemSelected(item);
	}
	

}
