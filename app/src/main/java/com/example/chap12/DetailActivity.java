package com.example.chap12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    int count;
    TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btn=(Button)findViewById(R.id.detail_btn);
        countView=(TextView)findViewById(R.id.detail_count);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        count++;
        countView.setText(String.valueOf(count));
    }
}
