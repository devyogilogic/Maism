package maism.app.maism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class B1_Hello extends AppCompatActivity {
    EditText txtName;
    TextView lblWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b1__hello);

        txtName = (EditText) findViewById(R.id.txt_Name);
        lblWelcome = (TextView) findViewById(R.id.lbl_Welcome);
    }

    public void fun_Show(View view) {
        String s;

        s = txtName.getText().toString();
        lblWelcome.setText(s);
    }
}
