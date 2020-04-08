package project.covid19break.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class trackcases extends AppCompatActivity {
    private Button button1x;
    private Button button2x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackcases);

        button1x = (Button) findViewById(R.id.buttonassam);
        button1x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAssam();
            }
        });
        button2x = (Button) findViewById(R.id.buttonindia);
        button2x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIndia();
            }
        });
    }
    public void openAssam() {
        Intent i12 = new Intent(this, assamcases.class);
        startActivity(i12);
    }

    public void openIndia() {
        Intent i22 = new Intent(this, india_cases.class);
        startActivity(i22);
    }
}