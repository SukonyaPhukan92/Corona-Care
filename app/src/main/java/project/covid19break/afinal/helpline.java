package project.covid19break.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helpline extends AppCompatActivity {
    private Button buttonx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        buttonx = (Button) findViewById(R.id.button9);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelplineX();
            }
        });
    }
    public void openHelplineX(){
        Intent i1 = new Intent(this, helpline_numbers.class);
        startActivity(i1);
}}
