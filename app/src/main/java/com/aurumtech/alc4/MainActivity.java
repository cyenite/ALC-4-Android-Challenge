package com.aurumtech.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;


    public class MainActivity extends Activity {


        private LinearLayout linear1;
        private LinearLayout linear5;
        private TextView textview1;
        private Button button1;
        private Button button2;

        private Intent nav = new Intent();
        private AlertDialog.Builder exit;
        private Calendar date = Calendar.getInstance();

        @Override
        protected void onCreate(Bundle _savedInstanceState) {
            super.onCreate(_savedInstanceState);
            setContentView(R.layout.activity_main);
            initialize(_savedInstanceState);
            initializeLogic();
        }

        private void initialize(Bundle _savedInstanceState) {

            linear1 = (LinearLayout) findViewById(R.id.linear1);
            linear5 = (LinearLayout) findViewById(R.id.linear5);
            textview1 = (TextView) findViewById(R.id.textview1);
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            exit = new AlertDialog.Builder(this);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View _view) {
                    nav.setClass(getApplicationContext(), AlcwebActivity.class);
                    startActivity(nav);
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View _view) {
                    nav.setClass(getApplicationContext(), ProfileActivity.class);
                    startActivity(nav);
                }
            });
        }

        private void initializeLogic() {

            int[] colors = {Color.rgb(138, 41, 81), Color.rgb(41, 53, 158)};
            android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, colors);
            gd.setCornerRadius(0f);
            gd.setStroke(0, Color.WHITE);
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                linear1.setBackground(gd);
            } else {
                linear1.setBackgroundDrawable(gd);
            }
            android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
            gd3.setColor(Color.parseColor("#BFD8CCCC"));
            gd3.setCornerRadius(50);
            linear5.setBackground(gd3);


            android.graphics.drawable.GradientDrawable style = new android.graphics.drawable.GradientDrawable();
            style.setCornerRadius((float) 20);
            style.setColor(new android.content.res.ColorStateList(new int[][]{{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}, new int[]{Color.parseColor("#FF5B01FD"), Color.parseColor("#FF4CAF50")}));
            style.setStroke((int) 5, new android.content.res.ColorStateList(new int[][]{{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}, new int[]{Color.parseColor("#FFC5B0EC"), Color.parseColor("#FF4CAF50")}));
            button1.setBackground(style);


            android.graphics.drawable.GradientDrawable style1 = new android.graphics.drawable.GradientDrawable();
            style1.setCornerRadius((float) 20);
            style1.setColor(new android.content.res.ColorStateList(new int[][]{{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}, new int[]{Color.parseColor("#FF5B01FD"), Color.parseColor("#FF4CAF50")}));
            style1.setStroke((int) 5, new android.content.res.ColorStateList(new int[][]{{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}, new int[]{Color.parseColor("#FFC5B0EC"), Color.parseColor("#FF4CAF50")}));
            button2.setBackground(style1);

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
            exit.setTitle("Warning");
            exit.setMessage("Sure to exit?");
            exit.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface _dialog, int _which) {
                    finish();
                }
            });
            exit.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface _dialog, int _which) {

                }
            });
            exit.create().show();
        }

        @Deprecated
        public void showMessage(String _s) {
            Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
        }

	/*@Deprecated
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
	}*/

        @Deprecated
        public float getDip(int _input) {
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
        }

        @Deprecated
        public int getDisplayWidthPixels() {
            return getResources().getDisplayMetrics().widthPixels;
        }

        @Deprecated
        public int getDisplayHeightPixels() {
            return getResources().getDisplayMetrics().heightPixels;
        }

    }
