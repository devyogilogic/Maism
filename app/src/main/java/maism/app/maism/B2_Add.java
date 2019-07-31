package maism.app.maism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class B2_Add extends AppCompatActivity {
    EditText txtNo1, txtNo2;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2__add);

        txtNo1 = (EditText) findViewById(R.id.B2_txt_No1);
        txtNo2 = (EditText) findViewById(R.id.B2_txt_No2);

        lblResult = (TextView) findViewById(R.id.B2_lbl_Result);
    }

    public void B2_fun_Add(View view) {
        int n1, n2, res;

        n1 = Integer.parseInt(txtNo1.getText().toString());
        n2 = Integer.parseInt(txtNo2.getText().toString());

        res = n1 + n2;

        lblResult.setText(String.valueOf(res));

    }
}
