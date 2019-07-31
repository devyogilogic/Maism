package maism.app.maism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import maism.app.maism.Control1.E27_MultiAutoText;
import maism.app.maism.Control1.E43_ListViewMulti;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, E43_ListViewMulti.class));
    }
}
