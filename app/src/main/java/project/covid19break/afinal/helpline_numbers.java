package project.covid19break.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class helpline_numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline_numbers);

        WebView webview = findViewById(R.id.webview3);
        final ProgressBar progressbar = findViewById(R.id.progressBar);

        progressbar.setVisibility(View.VISIBLE);

        String url = "https://covid19.assam.gov.in/wp-content/uploads/2020/04/Designated-Hospitals-in-Districts-for-COVID-19-along-with-officials-name-contact-no..pdf";
        String finalURL = "http://drive.google.com/viewerng/viewer?embedded=true&url="+url;

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);

        webview.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

                if (newProgress==100){
                    progressbar.setVisibility(View.GONE);
                }

            }
        });
                webview.loadUrl(finalURL);

    }
}
