package maism.app.maism.Control1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;

import maism.app.maism.R;

public class E13_RatingBar extends AppCompatActivity {
    RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e13__rating_bar);

        rb = (RatingBar) findViewById(R.id.E13_rb);
        rb.setOnRatingBarChangeListener
                (new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(
                            RatingBar ratingBar,
                            float rating, boolean fromUser) {
                        Toast.makeText(E13_RatingBar.this,
                                String.valueOf(rating), Toast.LENGTH_LONG).show();
                    }
                });
    }
}
