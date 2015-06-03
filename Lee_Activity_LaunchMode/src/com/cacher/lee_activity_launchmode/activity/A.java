package com.cacher.lee_activity_launchmode.activity;


import com.cacher.lee_activity_launchmode.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class A extends Activity implements OnClickListener{

	TextView mTv;
	Button mBtn,mBtn1,mBtn2,mBtn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_a);
		initView();
		mTv.setText("我是A-->"+this);
		mBtn.setOnClickListener(this);
		mBtn1.setOnClickListener(this);
			
	
	}

	private void initView() {
		mTv =(TextView) findViewById(R.id.id_show);
		mBtn =(Button) findViewById(R.id.id_showBtn);
		mBtn1 =(Button) findViewById(R.id.id_showBtn1);
		mBtn2 =(Button) findViewById(R.id.id_showBtn2);
		mBtn3 =(Button) findViewById(R.id.id_showBtn3);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.id_showBtn:
			Intent i =new Intent();
			i.setClass(A.this, A.class);
			startActivity(i);
			break;
		case R.id.id_showBtn1:
			Intent i1 =new Intent();
			i1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);//A设为singletop模式
			i1.setClass(A.this, B.class);
			startActivity(i1);
			break;
		case R.id.id_showBtn2:
			Intent i2 =new Intent();
			i2.setClass(A.this, B.class);
			startActivity(i2);
			break;
		case R.id.id_showBtn3:
			Intent i3 =new Intent();
			i3.setClass(A.this, B.class);
			startActivity(i3);
			break;
		}
		
	}

}
