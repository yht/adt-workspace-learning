package id.web.yht.listviewcomposite;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	ArrayList<DataList> alData = new ArrayList<DataList>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        alData.add(new DataList("Judul1","Keterangan1"));
        alData.add(new DataList("Judul2","Keterangan2"));
        alData.add(new DataList("Judul3","Keterangan3"));
        
        ListView lv = (ListView) findViewById(R.id.listJudul);
        DataAdapter adapter = new DataAdapter (this, R.layout.row, alData, alData);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
