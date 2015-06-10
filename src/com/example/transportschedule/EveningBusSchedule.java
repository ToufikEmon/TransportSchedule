package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class EveningBusSchedule extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.evening_bus_schedule);

		Button btnEvenning1 = (Button) findViewById(R.id.btnEvenning1);
		Button btnEvenning2 = (Button) findViewById(R.id.btnEvenning2);
		Button btnEvenning3 = (Button) findViewById(R.id.btnEvenning3);
		TextView tvEvening1 = (TextView) findViewById(R.id.tvEvenning1);
		TextView tvEvening2 = (TextView) findViewById(R.id.tvEvenning2);
		TextView tvEvening3 = (TextView) findViewById(R.id.tvEvenning3);
		TextView tvEvening4 = (TextView) findViewById(R.id.tvEvenning4);

		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");

		btnEvenning1.setTypeface(bangla_fonts);
		btnEvenning2.setTypeface(bangla_fonts);
		btnEvenning3.setTypeface(bangla_fonts);
		tvEvening1.setTypeface(bangla_fonts);
		tvEvening2.setTypeface(bangla_fonts);
		tvEvening3.setTypeface(bangla_fonts);
		tvEvening4.setTypeface(bangla_fonts);

	}

}
