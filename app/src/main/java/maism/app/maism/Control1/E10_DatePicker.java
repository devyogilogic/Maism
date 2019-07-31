package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import maism.app.maism.R;

public class E10_DatePicker extends AppCompatActivity {
    DatePicker dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e10__date_picker);

        dp = (DatePicker) findViewById(R.id.E10_dp);
    }

    public void E10_fun_Show(View view) {
        String s = "";
        s = dp.getDayOfMonth() + "-" + (dp.getMonth() + 1) + "-" + dp.getYear();

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

    }
}
