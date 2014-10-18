package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity {
    TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.second);
		super.onCreate(savedInstanceState);
		tv=(TextView) findViewById(R.id.textView1);
		Intent myintent=getIntent();
		String msg=myintent.getExtras().getString("int1");
		tv.setText(msg);
		
	}

}
