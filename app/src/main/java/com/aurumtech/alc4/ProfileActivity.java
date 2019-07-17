package com.aurumtech.alc4;

import android.app.*;
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
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;

public class ProfileActivity extends Activity {


    private LinearLayout linear2;
    private ImageView imageview2;
    private LinearLayout linear3;
    private LinearLayout linear7;
    private LinearLayout linear4;
    private LinearLayout linear8;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private TextView textview2;
    private TextView textview9;
    private TextView textview10;
    private ImageView imageview3;
    private TextView textview3;
    private ImageView imageview4;
    private TextView phoneid;
    private ImageView imageview6;
    private ImageView imageview5;
    private TextView emailid;
    private ImageView imageview7;
    private TextView textview7;
    private TextView textview8;
    private ImageView imageview8;

    private Intent nav = new Intent();
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.profile);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {

        linear2 = (LinearLayout) findViewById(R.id.linear2);
        imageview2 = (ImageView) findViewById(R.id.imageview2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear8 = (LinearLayout) findViewById(R.id.linear8);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview9 = (TextView) findViewById(R.id.textview9);
        textview10 = (TextView) findViewById(R.id.textview10);
        imageview3 = (ImageView) findViewById(R.id.imageview3);
        textview3 = (TextView) findViewById(R.id.textview3);
        imageview4 = (ImageView) findViewById(R.id.imageview4);
        phoneid = (TextView) findViewById(R.id.phoneid);
        imageview6 = (ImageView) findViewById(R.id.imageview6);
        imageview5 = (ImageView) findViewById(R.id.imageview5);
        emailid = (TextView) findViewById(R.id.emailid);
        imageview7 = (ImageView) findViewById(R.id.imageview7);
        textview7 = (TextView) findViewById(R.id.textview7);
        textview8 = (TextView) findViewById(R.id.textview8);
        imageview8 = (ImageView) findViewById(R.id.imageview8);

        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                ((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "+254700001267"));
                SketchwareUtil.showMessage(getApplicationContext(), "Phone copied to clipboard");
            }
        });

        imageview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                ((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "aaronrono42@gmail.com"));
                SketchwareUtil.showMessage(getApplicationContext(), "Email copied to clipboard");
            }
        });

        imageview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                ((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", " @Aaron Rono"));
                SketchwareUtil.showMessage(getApplicationContext(), "Username copied to clipboard");
            }
        });
    }
    private void initializeLogic() {
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
        nav.setClass(getApplicationContext(), MainActivity.class);
        nav.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(nav);
    }
    @Deprecated
    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    @Deprecated
    public int getLocationX(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[0];
    }

    @Deprecated
    public int getLocationY(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[1];
    }

    @Deprecated
    public int getRandom(int _min, int _max) {
        Random random = new Random();
        return random.nextInt(_max - _min + 1) + _min;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result;
    }

    @Deprecated
    public float getDip(int _input){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels(){
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels(){
        return getResources().getDisplayMetrics().heightPixels;
    }

}
