package maism.app.maism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class B6_Hello_List extends AppCompatActivity {
    EditText txtName;
    TextView lblWelcome;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b6__hello__list);

        txtName = (EditText) findViewById(R.id.B6_txt_Name);
        lblWelcome = (TextView) findViewById(R.id.B6_lbl_Welcome);

        btnShow = (Button) findViewById(R.id.B6_btn_Show);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                s = txtName.getText().toString();
                lblWelcome.setText(s);
            }
        });
    }


}
