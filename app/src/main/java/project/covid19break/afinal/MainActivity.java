package project.covid19break.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    private Button button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private Button button8;
    private Button buttonx;

    ImageView bgapp, icon;
    LinearLayout textsplash, texthome, menus;
    Animation frombuttom, bganim, iconanim ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//For animination
        frombuttom = AnimationUtils.loadAnimation(this, R.anim.frombuttom);
        bgapp = (ImageView) findViewById(R.id.bgapp);
        icon = (ImageView) findViewById(R.id.icon);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);

        bgapp.animate().translationY(-1600).setDuration(1500).setStartDelay(1200);
        icon.animate().alpha(0).setDuration(1400).setStartDelay(800);
        textsplash.animate().translationY(1140).alpha(0).setDuration(1500).setStartDelay(1200);

        texthome.startAnimation(frombuttom);
        menus.startAnimation(frombuttom);

//Giving lives to buttons

      button1 = (Button) findViewById(R.id.button1);
      button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrecautions();
            }
        });
        button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotifications();
            }
        });

        button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymptoms();
            }
        });

        button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpreads();
            }
        });

        button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTracks();
            }
        });

        button6 = (ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpline();
            }
        });

        button7 = (ImageButton) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutus();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTermsofuse();
            }
        });
    }
//Creating intents

    public void openPrecautions() {
        Intent i1 = new Intent(this, precautions_tour.class);
        startActivity(i1);
    }
    public void openNotifications() {
        Intent i2 = new Intent(this, notifications.class);
        startActivity(i2);
    }
    public void openSymptoms() {
        Intent i3 = new Intent(this, symptoms.class);
        startActivity(i3);
    }
    public void openSpreads() {
        Intent i4 = new Intent(this, spreads.class);
        startActivity(i4);
    }
    public void openTracks() {
        Intent i5 = new Intent(this, trackcases.class);
        startActivity(i5);
    }
    public void openHelpline() {
        Intent i6 = new Intent(this, helpline.class);
        startActivity(i6);
    }
    public void openAboutus() {
        Intent i7 = new Intent(this, about_us.class);
        startActivity(i7);
    }
    public void openTermsofuse() {
        Intent i9 = new Intent(this, termsofuse.class);
        startActivity(i9);
    }

}



