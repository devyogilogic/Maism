package maism.app.maism.Control1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import maism.app.maism.R;

public class E43_ListViewMulti extends AppCompatActivity {
    String[] arCity = {"a", "b", "c", "d"};
    String[] arState = {"a1", "b1", "c1", "d1"};
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e43__list_view_multi);

        lst = (ListView) findViewById(R.id.E43_lst);

        CustAdpt adpt = new CustAdpt(this, arCity, arState);
        lst.setAdapter(adpt);
    }


    public class CustAdpt extends ArrayAdapter<String> {
        String[] mState, mCity;
        Context mContext;

        public CustAdpt(Context context, String[] tCity, String[] tState) {
            super(context,
                    R.layout.activity_e43__list_view_multi_row,
                    R.id.E43_lbl_City, tCity);

            mState = tState;
            mCity = tCity;
            mContext = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            ViewHolder vHolder = null;

            if (row == null) {
                LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.activity_e43__list_view_multi_row, parent, false);
                vHolder = new ViewHolder(row);

                row.setTag(vHolder);
            } else {
                vHolder = (ViewHolder) row.getTag();
            }

            vHolder.lblCity.setText(mCity[position]);
            vHolder.lblState.setText(mState[position]);

            return row;
        }
    }


    public class ViewHolder {
        TextView lblCity, lblState;

        public ViewHolder(View v) {
            lblCity = (TextView) v.findViewById(R.id.E43_lbl_City);
            lblState = (TextView) v.findViewById(R.id.E43_lbl_State);
        }
    }
}
