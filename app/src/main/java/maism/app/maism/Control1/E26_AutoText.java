package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import maism.app.maism.R;

public class E26_AutoText extends AppCompatActivity {
    AutoCompleteTextView lst;
    String[] arCity = {"a", "ab", "abc", "abcd", "abcde", "abcdef"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e26__auto_text);

        lst = (AutoCompleteTextView) findViewById(R.id.E26_auto);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        R.layout.support_simple_spinner_dropdown_item, arCity);
        lst.setAdapter(adapter);
        lst.setThreshold(2);
    }
}
