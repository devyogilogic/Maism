package maism.app.maism.Control1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import maism.app.maism.R;

public class E20_AlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e20__alert_dialog);
    }

    public void E20_fun_Show(View view) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);

        ad.setTitle("This is Title");
        ad.setMessage("This is Message");

        ad.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(E20_AlertDialog.this,
                                "YEs", Toast.LENGTH_LONG).show();
                    }
                });

        ad.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(E20_AlertDialog.this,
                                "YEs", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog ab = ad.create();
        ab.show();
    }
}
