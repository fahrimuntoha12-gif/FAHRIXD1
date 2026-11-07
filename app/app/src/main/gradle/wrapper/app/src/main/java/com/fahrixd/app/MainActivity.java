package com.fahrixd.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("FAHRIXD");
        title.setTextColor(Color.RED);
        title.setTextSize(36);
        title.setGravity(Gravity.CENTER);

        layout.addView(title);
        setContentView(layout);
    }
}
