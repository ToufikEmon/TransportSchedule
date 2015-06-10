package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MorningBusSchedule extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout .morning_bus_schedule);
		
		Button btnMorning1 = (Button) findViewById(R.id.btnMorinig1);
		Button btnMorning2 = (Button) findViewById(R.id.btnMorinig2);
		Button btnMorning3 = (Button) findViewById(R.id.btnMorinig3);
		TextView tvMorning1 = (TextView) findViewById(R.id.tvMorning1);
		TextView tvMorning2 = (TextView) findViewById(R.id.tvMorning2);
		TextView tvMorning3 = (TextView) findViewById(R.id.tvMorning3);
		
		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");
		
		btnMorning1.setTypeface(bangla_fonts);
		btnMorning2.setTypeface(bangla_fonts);
		btnMorning3.setTypeface(bangla_fonts);
		tvMorning1.setTypeface(bangla_fonts);
		tvMorning2.setTypeface(bangla_fonts);
		tvMorning3.setTypeface(bangla_fonts);

	}
}
