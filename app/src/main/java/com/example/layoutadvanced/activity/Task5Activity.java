package com.example.layoutadvanced.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.layoutadvanced.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kotlin.text.Regex;

public class Task5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);
        TextView text=findViewById(R.id.tv_task5text);


        Button btHashtag = (Button)findViewById(R.id.b_searchHashtag);
        btHashtag.setAllCaps(false);
        btHashtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pattern pattern = Pattern.compile("(#\\w+)");
                Matcher matcher = pattern.matcher(text.getText());
                // Check all occurrences
                while (matcher.find()) {
                    SpannableString spannableStr = new SpannableString(text.getText());
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.GREEN);

                    spannableStr.setSpan(foregroundColorSpan, matcher.start(), matcher.end(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                    text.setText(spannableStr);

                }

            }
        });



    }



    }
