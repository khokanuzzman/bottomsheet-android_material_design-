package com.example.khokan.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout bottomlayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView shareImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomlayout =findViewById(R.id.bottom_sheet);
        shareImage=findViewById(R.id.shareImg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomlayout);
        shareImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

    }
}
