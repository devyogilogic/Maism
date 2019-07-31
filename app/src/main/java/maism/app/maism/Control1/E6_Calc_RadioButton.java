package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import maism.app.maism.R;

public class E6_Calc_RadioButton extends AppCompatActivity {
    RadioButton optAdd, optSub, optMul, optDiv;
    TextView lblResult;
    EditText txtNo1, txtNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e6__calc__radio_button);

        optAdd = (RadioButton) findViewById(R.id.E6_opt_Add);
        optSub = (RadioButton) findViewById(R.id.E6_opt_Sub);
        optMul = (RadioButton) findViewById(R.id.E6_opt_Mul);
        optDiv = (RadioButton) findViewById(R.id.E6_opt_Div);

        lblResult = (TextView) findViewById(R.id.E6_lbl_Result);
        txtNo1 = (EditText) findViewById(R.id.E6_txt_No1);
        txtNo2 = (EditText) findViewById(R.id.E6_txt_No2);
    }

    public void E6_fun_Calc(View view) {
        int n1, n2, res;

        n1 = Integer.parseInt(txtNo1.getText().toString());
        n2 = Integer.parseInt(txtNo2.getText().toString());

        if (optAdd.isChecked())
            res = n1 + n2;
        else if (optSub.isChecked())
            res = n1 - n2;
        else if (optMul.isChecked())
            res = n1 * n2;
        else if (optDiv.isChecked())
            res = n1 / n2;
        else
            res = 0;

        lblResult.setText(String.valueOf(res));

    }
}
