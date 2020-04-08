package project.covid19break.afinal;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.DownloadManager;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.DownloadListener;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.Toast;

        import static android.view.View.VISIBLE;


public class notifications extends AppCompatActivity {
    private WebView myVebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        myVebView = (WebView) findViewById(R.id.webView2);
        WebSettings webSettings = myVebView.getSettings();
        myVebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        myVebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setJavaScriptEnabled(true);
        myVebView.loadUrl("https://covid19.assam.gov.in/orders-notifications-by-govt-of-india/");
        myVebView.setWebViewClient(new WebViewClient());
        myVebView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                DownloadManager.Request myRequest1 = new DownloadManager.Request(Uri.parse(url));
                myRequest1.allowScanningByMediaScanner();
                myRequest1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                DownloadManager myManager =(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                myManager.enqueue(myRequest1);

                Toast.makeText(notifications.this, "File is downloading", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onBackPressed() {
        if (myVebView.canGoBack()) {
            myVebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
