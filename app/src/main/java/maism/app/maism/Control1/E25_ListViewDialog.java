package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import maism.app.maism.R;

public class E25_ListViewDialog extends AppCompatActivity {
    String[] arCity = {"a", "b", "C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e25__list_view_dialog);
    }

    public void E25_fun_Show(View view) {
        ListView lst = new ListView(this);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        R.layout.support_simple_spinner_dropdown_item,
                        arCity);
        lst.setAdapter(adapter);

        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setView(lst);
        ad.setPositiveButton("Ok", null);
        AlertDialog ab = ad.create();
        ab.show();


    }
}
