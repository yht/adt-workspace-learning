package id.web.yht.listviewcomposite;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DataAdapter extends ArrayAdapter<DataList> {
	private static ArrayList<DataList> alData;
	public DataAdapter(Context con, int textViewResourceId, ArrayList<DataList>aldata, ArrayList<DataList> alData) {
		super (con,textViewResourceId,alData);
		this.alData = alData;
	}
	public View getView(int pos, View convertView, ViewGroup parent) {
		View v = convertView;
		if ( v == null ) {
			LayoutInflater li = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = li.inflate(R.layout.row, null);
		}
		DataList dl = alData.get(pos);
		if (dl != null) {
			TextView tvJudul = (TextView) v.findViewById(R.id.tvJudul);
			TextView tvKeterangan = (TextView) v.findViewById(R.id.tvKeterangan);
			tvJudul.setText(dl.judul);
			tvKeterangan.setText(dl.keterangan);
		}
		return v;
	}
}
