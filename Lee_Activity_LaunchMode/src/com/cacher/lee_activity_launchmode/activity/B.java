package com.cacher.lee_activity_launchmode.activity;

import com.cacher.lee_activity_launchmode.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class B extends Activity {

	TextView mTv;
	Button mBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_b);
		initView();
		mTv.setText("ÎÒÊÇB-->" + this);
		mBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent();
				i.setClass(B.this, A.class);
				startActivity(i);
			}
		});
	}

	private void initView() {
		mTv = (TextView) findViewById(R.id.id_showB);
		mBtn = (Button) findViewById(R.id.id_showBbtn);
	}

}
