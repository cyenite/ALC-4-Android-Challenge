package com.aurumtech.alc4;

import android.app.*;
import android.net.http.SslError;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.content.Intent;
import android.net.Uri;

public class AlcwebActivity extends Activity {


    private WebView webview1;

    private Intent nav = new Intent();
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.alcweb);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {

        webview1 = (WebView) findViewById(R.id.webview1);
     /*   webview1.getSettings().setJavaScriptEnabled(true);*/
        webview1.getSettings().setSupportZoom(true);

        webview1.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error){
                handler.proceed();}
          /*  @Override
            public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
                final String _url = _param2;

                super.onPageStarted(_param1, _param2, _param3);
            }

            @Override
            public void onPageFinished(WebView _param1, String _param2) {
                final String _url = _param2;

                super.onPageFinished(_param1, _param2);
            }*/
        });
    }
    private void initializeLogic() {
        webview1.loadUrl("https://www.andela.com/alc/");
        SketchwareUtil.showMessage(getApplicationContext(), "Loading webpage..");
    }

    @Override
    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
        super.onActivityResult(_requestCode, _resultCode, _data);

        switch (_requestCode) {

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (webview1.canGoBack()) {
            webview1.goBack();
        }
        else {
            nav.setClass(getApplicationContext(), MainActivity.class);
            nav.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(nav);
        }
    }
  /*  private void _Desktop (final WebView _webview) {
        _webview.getSettings().setLoadWithOverviewMode(true); _webview.getSettings().setUseWideViewPort(true); final WebSettings webSettings = _webview.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/63.0"; webSettings.setUserAgentString(newUserAgent); ///by GiantMurloc\\\
    }*/



}
