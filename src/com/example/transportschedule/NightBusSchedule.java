package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NightBusSchedule extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.night_bus_schedule);
		
		Button btnNight1 = (Button) findViewById(R.id.btnNight1);
		Button btnNight2 = (Button) findViewById(R.id.btnNight2);
		Button btnNight3 = (Button) findViewById(R.id.btnNight3);
		TextView tvNight1 = (TextView) findViewById(R.id.tvNight1);
		TextView tvNight2 = (TextView) findViewById(R.id.tvNight2);
		TextView tvNight3 = (TextView) findViewById(R.id.tvNight3);
		
		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");
		
		btnNight1.setTypeface(bangla_fonts);
		btnNight2.setTypeface(bangla_fonts);
		btnNight3.setTypeface(bangla_fonts);
		tvNight1.setTypeface(bangla_fonts);
		tvNight2.setTypeface(bangla_fonts);
		tvNight3.setTypeface(bangla_fonts);

	}

}
