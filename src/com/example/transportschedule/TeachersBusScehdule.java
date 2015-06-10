package com.example.transportschedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TeachersBusScehdule extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teachers_bus_schedule);

		Button btnTeacher1 = (Button) findViewById(R.id.btnTeacher1);
		Button btnTeacher2 = (Button) findViewById(R.id.btnTeacher2);
		TextView tvTeacher1 = (TextView) findViewById(R.id.tvTeacher1);
		TextView tvTeacher2 = (TextView) findViewById(R.id.tvTeacher2);
		TextView tvTeacher3 = (TextView) findViewById(R.id.tvTeacher3);
		TextView tvTeacher4 = (TextView) findViewById(R.id.tvTeacher4);

		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");

		btnTeacher1.setTypeface(bangla_fonts);
		btnTeacher2.setTypeface(bangla_fonts);
		tvTeacher1.setTypeface(bangla_fonts);
		tvTeacher2.setTypeface(bangla_fonts);
		tvTeacher3.setTypeface(bangla_fonts);
		tvTeacher4.setTypeface(bangla_fonts);
	}

}
