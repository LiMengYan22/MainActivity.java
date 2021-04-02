package nombre.proyecto;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   this.setContentView(R.layout.activity_main);
   WebView myWebView = this.findViewById(R.id.webview);
   myWebView.getSettings().setJavaScriptEnabled(true);
   myWebView.loadUrl("https://proyecto.html");
   myWebView.setWebViewClient(new WebViewClient());
   myWebView.setWebChromeClient(new WebChromeClient());
   WebSettings webSettings = myWebView.getSettings();
   webSettings.setDomStorageEnabled(false);
}
}
