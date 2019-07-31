package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.Toast;

import maism.app.maism.R;

public class E14_SeekBar extends AppCompatActivity {
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e14__seek_bar);

        sb = (SeekBar) findViewById(R.id.E14_sb);
        sb.setOnSeekBarChangeListener
                (new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged
                            (SeekBar seekBar,
                             int progress, boolean fromUser) {
                        Toast.makeText(E14_SeekBar.this,
                                String.valueOf(progress),
                                Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(E14_SeekBar.this,
                                "Start", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(E14_SeekBar.this,
                                "Stop", Toast.LENGTH_LONG).show();
                    }
                });
    }
}
