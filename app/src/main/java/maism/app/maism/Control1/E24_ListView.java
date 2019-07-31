package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import maism.app.maism.R;

public class E24_ListView extends AppCompatActivity {
    ListView lst;
    String[] arCity = {"a", "b", "c", "d", "e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e24__list_view);

        lst = (ListView) findViewById(R.id.E24_lst);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, arCity);
        lst.setAdapter(adapter);
    }
}
