package th.ac.su.speedrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class speedcal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedcal);
        EditText ET_M = findViewById(R.id.editText_meters);
        EditText ET_S = findViewById(R.id.editText_seconds);
        String M1 =ET_M.getText().toString();
        String S1 =ET_S.getText().toString();
        Double S =Double.parseDouble(M1);
        Double T =Double.parseDouble(S1);
        Double ANS = (S / 1000) * (3600 / T);
        //setText(String.format("%.2f", ANS));
    }
}