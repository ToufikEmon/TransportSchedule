package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AfternoonBusSchedule extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.afternoon_bus_schedule);

		Button btn_afternoon = (Button) findViewById(R.id.btnAfternoon);
		Button btn_afternoonCD = (Button) findViewById(R.id.btnAfternoonCD);
		TextView tv_Afternoon1 = (TextView) findViewById(R.id.tvAftrnoon1);
		TextView tv_Afternoon2 = (TextView) findViewById(R.id.tvAftrnoon2);

		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");

		btn_afternoon.setTypeface(bangla_fonts);
		btn_afternoonCD.setTypeface(bangla_fonts);
		tv_Afternoon1.setTypeface(bangla_fonts);
		tv_Afternoon2.setTypeface(bangla_fonts);

	}

}
