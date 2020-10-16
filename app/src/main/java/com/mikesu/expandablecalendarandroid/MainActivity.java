package com.mikesu.expandablecalendarandroid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import com.mikesu.horizontalexpcalendar.HorizontalExpCalendar;
import com.mikesu.horizontalexpcalendar.common.Config;

import java.time.LocalDate;

/**
 * Created by MikeSu on 04/08/16.
 * www.michalsulek.pl
 */
public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getName();
  private HorizontalExpCalendar horizontalExpCalendar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    horizontalExpCalendar = (HorizontalExpCalendar) findViewById(R.id.calendar);
    horizontalExpCalendar.setHorizontalExpCalListener(new HorizontalExpCalendar.HorizontalExpCalListener() {
      @Override
      public void onCalendarScroll(LocalDate dateTime) {
        Log.i(TAG, "onCalendarScroll: " + dateTime.toString());
      }

      @Override
      public void onDateSelected(LocalDate dateTime) {
        Log.i(TAG, "onDateSelected: " + dateTime.toString());
      }

      @Override
      public void onChangeViewPager(Config.ViewPagerType viewPagerType) {
        Log.i(TAG, "onChangeViewPager: " + viewPagerType.name());
      }
    });
  }
}
