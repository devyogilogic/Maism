package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import maism.app.maism.R;

public class E11_TimePicker extends AppCompatActivity {
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e11__time_picker);

        tp = (TimePicker) findViewById(R.id.E11_tp);
    }

    public void E11_fun_Show(View view) {
        String s = "";

        s = tp.getHour() + ":" + tp.getMinute();

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
