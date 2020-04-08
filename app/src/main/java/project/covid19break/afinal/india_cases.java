package project.covid19break.afinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class india_cases extends AppCompatActivity {
    private WebView myVebView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_cases);
        myVebView3 = (WebView) findViewById(R.id.webview5);
        WebSettings webSettings = myVebView3.getSettings();
        myVebView3.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        myVebView3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setJavaScriptEnabled(true);
        myVebView3.loadUrl("https://www.covid19india.org");
        myVebView3.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myVebView3.canGoBack()) {
            myVebView3.goBack();
        } else {
            super.onBackPressed();
        }
    }
}