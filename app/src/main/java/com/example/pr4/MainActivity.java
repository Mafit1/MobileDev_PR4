package com.example.pr4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;import android.view.Gravity;
import android.view.ViewGroup;import android.widget.LinearLayout;
import android.widget.ScrollView;import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);

        TextView textView = new TextView(this);
        textView.setText(R.string.text4);
        textView.setTextSize(40);
        textView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        scrollView.addView(textView);
        setContentView(scrollView);
    }
}