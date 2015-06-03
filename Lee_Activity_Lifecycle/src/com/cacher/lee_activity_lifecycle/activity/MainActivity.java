package com.cacher.lee_activity_lifecycle.activity;

import com.cacher.lee_activity_lifecycle.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected ImageView mShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		Toast.makeText(MainActivity.this, "����һ�ε���һ��Activityʱ,�ͻ�ִ��onCreate����",
				Toast.LENGTH_LONG).show();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		mShow = (ImageView) findViewById(R.id.id_show);

	}

	@Override
	protected void onStart() {
		Toast.makeText(MainActivity.this, "��Activity���ڿɼ�״̬��ʱ,�ͻ����onStart����",
				Toast.LENGTH_LONG).show();
		super.onStart();
	}

	@Override
	protected void onResume() {
		Toast.makeText(MainActivity.this, "��Activity���Եõ��û������ʱ,�ͻ����onResume����",
				Toast.LENGTH_LONG).show();
		super.onResume();
	}

	@Override
	protected void onRestart() {
		Toast.makeText(MainActivity.this,
				"��Activityû�б����ٵ�ʱ�����µ������Activity,�ͻ����onRestart����",
				Toast.LENGTH_LONG).show();
		super.onRestart();
	}

	@Override
	protected void onPause() {
		Toast.makeText(MainActivity.this, "��Activity���ڵ�ס��ʱ,�ͻ����onPause����",
				Toast.LENGTH_LONG).show();
		super.onPause();
	}

	@Override
	protected void onStop() {
		Toast.makeText(MainActivity.this, "��Activity���ڲ��ɼ�״̬��ʱ��,�����onStop����",
				Toast.LENGTH_LONG).show();
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Toast.makeText(MainActivity.this, "��Activity������ʱ,�ͻ����onDestory����",
				Toast.LENGTH_LONG).show();
		super.onDestroy();
	}

}
