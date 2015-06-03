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

		Toast.makeText(MainActivity.this, "当第一次调用一个Activity时,就会执行onCreate方法",
				Toast.LENGTH_LONG).show();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		mShow = (ImageView) findViewById(R.id.id_show);

	}

	@Override
	protected void onStart() {
		Toast.makeText(MainActivity.this, "当Activity处于可见状态的时,就会调用onStart方法",
				Toast.LENGTH_LONG).show();
		super.onStart();
	}

	@Override
	protected void onResume() {
		Toast.makeText(MainActivity.this, "当Activity可以得到用户焦点的时,就会调用onResume方法",
				Toast.LENGTH_LONG).show();
		super.onResume();
	}

	@Override
	protected void onRestart() {
		Toast.makeText(MainActivity.this,
				"当Activity没有被销毁的时候重新调用这个Activity,就会调用onRestart方法",
				Toast.LENGTH_LONG).show();
		super.onRestart();
	}

	@Override
	protected void onPause() {
		Toast.makeText(MainActivity.this, "当Activity被遮挡住的时,就会调用onPause方法",
				Toast.LENGTH_LONG).show();
		super.onPause();
	}

	@Override
	protected void onStop() {
		Toast.makeText(MainActivity.this, "当Activity处于不可见状态的时候,会调用onStop方法",
				Toast.LENGTH_LONG).show();
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Toast.makeText(MainActivity.this, "当Activity被销毁时,就会调用onDestory方法",
				Toast.LENGTH_LONG).show();
		super.onDestroy();
	}

}
