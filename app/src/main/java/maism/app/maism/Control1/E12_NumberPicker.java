package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.NumberPicker;
import android.widget.Toast;

import maism.app.maism.R;

public class E12_NumberPicker extends AppCompatActivity {
    NumberPicker np;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e12__number_picker);

        np = (NumberPicker) findViewById(R.id.E12_np);
        np.setMinValue(1);
        np.setMaxValue(50);

        np.setOnValueChangedListener
                (new NumberPicker.OnValueChangeListener() {
                    @Override
                    public void onValueChange(NumberPicker picker,
                                              int oldVal, int newVal) {
                        Toast.makeText(E12_NumberPicker.this,
                                String.valueOf(newVal), Toast.LENGTH_LONG).show();
                    }
                });

    }
}
