package com.lhy.demo.constraintlayoutapp;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.activity_main)
    ConstraintLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick({R.id.textView, R.id.button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView:
                break;
            case R.id.button:
                Toast.makeText(this, "tusi", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
