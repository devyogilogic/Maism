package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import maism.app.maism.R;

public class E7_CheckBox extends AppCompatActivity {
    CheckBox chkASP, chkPHP, chkSEO, chkAndroid;
    TextView lblMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e7__check_box);

        chkASP = (CheckBox) findViewById(R.id.E7_chk_ASP);
        chkPHP = (CheckBox) findViewById(R.id.E7_chk_PHP);
        chkSEO = (CheckBox) findViewById(R.id.E7_chk_SEO);
        chkAndroid = (CheckBox) findViewById(R.id.E7_chk_Android);
        lblMessage = (TextView) findViewById(R.id.E7_lbl_Message);
    }

    public void E7_fun_Show(View view) {
        String s = "";

        if (chkASP.isChecked())
            s = s + "ASP, ";
        if (chkPHP.isChecked())
            s = s + "PHP, ";
        if (chkSEO.isChecked())
            s = s + "SEO, ";
        if (chkAndroid.isChecked())
            s = s + "Android, ";

        if (s == "")
            lblMessage.setText("Select Any Course");
        else {
            s = s.trim().substring(0, s.length() - 2);
            lblMessage.setText(s);
        }
    }
}
