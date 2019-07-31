package maism.app.maism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class B10_List extends AppCompatActivity {
    String[] arCity = {"a", "b", "C", "d", "e"};
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10__list);

        lst = (ListView) findViewById(R.id.B10_lst);

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item,
                        arCity);
        lst.setAdapter(adapter);
    }
}
