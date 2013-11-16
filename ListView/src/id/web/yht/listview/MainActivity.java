package id.web.yht.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	String[] items={"satu","dua","tiga","empat","lima"};
	ArrayAdapter<String> adapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listAngka = (ListView) findViewById(R.id.listAngka);
        adapter = new ArrayAdapter<String>
        	(this,android.R.layout.simple_expandable_list_item_1,items);
        
        listAngka.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void klikButton (View v) {
    	items[0]="satu diganti one";
    	adapter.notifyDataSetChanged();
    }
    
}
