package com.example.transportschedule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button morn = (Button) findViewById(R.id.morn);
		Button after = (Button) findViewById(R.id.after);
		Button even = (Button) findViewById(R.id.even);
		Button night = (Button) findViewById(R.id.night);
		Button teacher = (Button) findViewById(R.id.teacher);
		Button weekend = (Button) findViewById(R.id.weekend);

		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");

		morn.setTypeface(bangla_fonts);
		after.setTypeface(bangla_fonts);
		even.setTypeface(bangla_fonts);
		night.setTypeface(bangla_fonts);
		teacher.setTypeface(bangla_fonts);
		weekend.setTypeface(bangla_fonts);

		morn.setOnClickListener(this);
		after.setOnClickListener(this);
		even.setOnClickListener(this);
		night.setOnClickListener(this);
		teacher.setOnClickListener(this);
		weekend.setOnClickListener(this);

	}

	@SuppressLint({ "NewApi", "ShowToast" })
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		switch (item.getItemId()) {
		case R.id.action_about_us:
			Intent aboutUs = new Intent(this, AboutUS.class);
			startActivity(aboutUs);
			return true;
		case R.id.action_update:
			Toast.makeText(getApplicationContext(), "Up date started", Toast.LENGTH_LONG);
			return true;
		case R.id.action_exit:
			System.exit(0);

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();

		inflater.inflate(R.menu.main, menu);

		return true;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.morn:
			// morningBusSchedule();
			Intent morn = new Intent(this, MorningBusSchedule.class);
			startActivity(morn);
			break;

		case R.id.after:
			Intent after = new Intent(this, AfternoonBusSchedule.class);
			startActivity(after);
			break;
		case R.id.even:
			Intent even = new Intent(this, EveningBusSchedule.class);
			startActivity(even);
			break;
		case R.id.night:
			Intent night = new Intent(this, NightBusSchedule.class);
			startActivity(night);
			break;
		case R.id.teacher:
			Intent teacher = new Intent(this, TeachersBusScehdule.class);
			startActivity(teacher);
			break;
		case R.id.weekend:
			Intent weekend = new Intent(this, Weekend.class);
			startActivity(weekend);
			break;

		}
		// TODO Auto-generated method stub

	}

}
