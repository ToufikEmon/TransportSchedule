package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Weekend extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.weekend_bus_schedule);
	
	Button btnHoliday1 = (Button) findViewById(R.id.btnHoliday1);
	Button btnHoliday2 = (Button) findViewById(R.id.btnHoliday2);
	Button btnHoliday3 = (Button) findViewById(R.id.btnHoliday3);
	TextView tvHoliday1 = (TextView) findViewById(R.id.tvHoliday1);
	TextView tvHoliday2 = (TextView) findViewById(R.id.tvHoliday2);
	TextView tvHoliday3 = (TextView) findViewById(R.id.tvHoliday3);
	TextView tvHoliday4 = (TextView) findViewById(R.id.tvHoliday4);
	TextView tvHoliday5 = (TextView) findViewById(R.id.tvHoliday5);
	TextView tvHoliday6 = (TextView) findViewById(R.id.tvHoliday6);
	TextView tvHoliday7 = (TextView) findViewById(R.id.tvHoliday7);
	TextView tvHoliday8 = (TextView) findViewById(R.id.tvHoliday8);
	
	Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
			"fonts/Siyamrupali.ttf");
	
	btnHoliday1.setTypeface(bangla_fonts);
	btnHoliday2.setTypeface(bangla_fonts);
	btnHoliday3.setTypeface(bangla_fonts);
	tvHoliday1.setTypeface(bangla_fonts);
	tvHoliday2.setTypeface(bangla_fonts);
	tvHoliday3.setTypeface(bangla_fonts);
	tvHoliday4.setTypeface(bangla_fonts);
	tvHoliday5.setTypeface(bangla_fonts);
	tvHoliday6.setTypeface(bangla_fonts);
	tvHoliday7.setTypeface(bangla_fonts);
	tvHoliday8.setTypeface(bangla_fonts);
	
	}

}
