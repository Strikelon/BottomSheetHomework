package com.strikalov.bottomsheethomework;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView cityMoscow;
    private TextView citySaintPetersburg;
    private TextView cityRostovNaDony;

    private View bottomSheet;
    private BottomSheetBehavior bottomSheetBehavior;
    private TextView bottomSheetTitle;
    private ImageView bottomSheetImage;

    private CityListener cityListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityListener = new CityListener();

        cityMoscow = findViewById(R.id.city_moscow);
        cityMoscow.setOnClickListener(cityListener);
        citySaintPetersburg = findViewById(R.id.city_saint_petersburg);
        citySaintPetersburg.setOnClickListener(cityListener);
        cityRostovNaDony = findViewById(R.id.city_rostov_na_dony);
        cityRostovNaDony.setOnClickListener(cityListener);

        bottomSheet = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetTitle = findViewById(R.id.bottom_sheet_title);
        bottomSheetImage = findViewById(R.id.bottom_sheet_image);

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
    }

    private class CityListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.city_moscow:
                    bottomSheetTitle.setText(R.string.city_moscow);
                    bottomSheetImage.setImageResource(R.drawable.moscow);
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    break;
                case R.id.city_saint_petersburg:
                    bottomSheetTitle.setText(R.string.city_saint_petersburg);
                    bottomSheetImage.setImageResource(R.drawable.petersburg);
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    break;
                case R.id.city_rostov_na_dony:
                    bottomSheetTitle.setText(R.string.city_rostov_na_dony);
                    bottomSheetImage.setImageResource(R.drawable.rostov);
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    break;
                default:
                    break;
            }

        }
    }
}
