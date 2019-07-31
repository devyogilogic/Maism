package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import maism.app.maism.R;

public class E27_MultiAutoText extends AppCompatActivity {
    String[] arCity = {"a", "ab", "abc", "abcd", "abcde", "abcdef"};
    MultiAutoCompleteTextView auto;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e27__multi_auto_text);

        auto = (MultiAutoCompleteTextView) findViewById(R.id.E27_auto);
        txt = (TextView) findViewById(R.id.E27_txt);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        R.layout.support_simple_spinner_dropdown_item,
                        arCity);
        auto.setAdapter(adapter);
        auto.setThreshold(2);
        auto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public void E27_fun_Show(View view) {
        String s = "", test = "";
        String[] arCity1;

        s = auto.getText().toString();
        arCity1 = s.split(",");

        for (int i = 0; i < arCity1.length; i++)
            test = test + arCity1[i] + " -- ";
        //Toast.makeText(this, arCity1[i], Toast.LENGTH_LONG).show();

        txt.setText(test);
    }
}
