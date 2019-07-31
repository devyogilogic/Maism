package maism.app.maism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class B7_Toggle extends AppCompatActivity {
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b7__toggle);

        tb = (ToggleButton) findViewById(R.id.B7_tg);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                Toast.makeText(B7_Toggle.this,
                        String.valueOf(isChecked), Toast.LENGTH_LONG).show();
            }
        });
    }
}
