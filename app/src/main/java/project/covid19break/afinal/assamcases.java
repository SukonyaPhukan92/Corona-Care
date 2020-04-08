package project.covid19break.afinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class assamcases extends AppCompatActivity {
    private WebView myVebView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assamcases);
        myVebView6 = (WebView) findViewById(R.id.webview4);
        WebSettings webSettings = myVebView6.getSettings();
        myVebView6.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        myVebView6.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setJavaScriptEnabled(true);
        myVebView6.loadUrl("http://www.covid19assam.blogspot.com/");
        myVebView6.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if (myVebView6.canGoBack()) {
            myVebView6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}