package com.newgame.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.newgame.sdk.AndroidShare;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AndroidShare as = new AndroidShare(
						MainActivity.this,
						"哈哈---超方便的分享！！！来自allen",
						"http://www.fjsen.com/images/attachement/jpg/site2/20100701/001aa02d373c0d96c27324.jpg");
				as.show();
			}
		});

	}

}
