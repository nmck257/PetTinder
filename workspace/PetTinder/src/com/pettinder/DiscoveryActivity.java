package com.pettinder;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class DiscoveryActivity extends ActionBarActivity {

    Intent matchesIntent, settingsIntent;
    
    
    /*
	View.OnClickListener matches = (new View.OnClickListener() {
		public void onClick(View v){
			startActivity(matchesIntent);
		}
	});
	*/
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);
        //define intents
        matchesIntent = new Intent(this, MatchesActivity.class);
        settingsIntent = new Intent(this, SettingsActivity.class);

    }

    
    @Override
    protected void onStart(){
    	super.onStart();
    }
    
    @Override
    protected void onRestart(){
    	super.onRestart();
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    }
    
    @Override
    protected void onStop(){
    	super.onStop();
    }

    @Override
    protected void onDestroy(){
    	super.onDestroy();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.discovery_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.settings) {
        	startActivity(settingsIntent);
            return true;
        }else if(id == R.id.matches){
        	startActivity(matchesIntent);
        	return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
}
